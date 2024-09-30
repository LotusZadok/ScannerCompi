/* Simple JFlex example to tokenize arithmetic expressions */

package com.compi.scanner;
import static com.compi.scanner.TokenTypes.*;
%%

%class SimpleLexer
%unicode
%type Token
%public
%line

L = [a-zA-Z]
D = [0-9]

Alfanumerico = ({L}|_)({L}|{D}|_)* // Letra seguida de letras o digitos

ZERO    = 0
DECIMAL = [1-9][0-9]*       
OCTAL   = 0[0-7]+          
HEX     = "0"[xX][0-9A-Fa-f]+  
INT     = ( {ZERO} | {DECIMAL} | {OCTAL} | {HEX} ) [lL]?  

EXP             = [eE][\+\-]?[0-9]+  
DECPART         = \.[0-9]+      
OPTIONALDECPART = \.?[0-9]+ //parte opcional antes del exponente
FLOATSUFFIX     = [fFdD]?       //sufijo de exponente opcional
FLOAT           = {INT}({DECPART} {EXP}? | {OPTIONALDECPART}{EXP}) {FLOATSUFFIX}

%{
    TokenList tokenList = TokenList.getInstance();
    ErrorList errorList = ErrorList.getInstance();
%}

%%

[ \t\n\r]+    { /* ignore */ }

// 1. OMITIR COMENTARIOS 
"//".* { /* ignore */ }
"/*"([^*]|\*+[^*/])*"*"+"/" { /* ignore */ }
"/*"[^\n\r]* {errorList.insertError(ERROR, "Comentario no cerrado -> " + yytext(), yyline);}

// 2. PALABRAS RESERVADAS
auto | break | case | char | const | continue | default | do | double | else | enum | extern | float | for |
goto | if | int | long | register | return | short | signed | sizeof | static | struct | switch | typedef |
union | unsigned | void | volatile | while {tokenList.insertToken(PALABRA_RESERVADA, yytext(), yyline);}

// 3. NUMEROS
{INT}("-")                     { errorList.insertError(ERROR, "Símbolo inválido después de número -> " + yytext(), yyline); }
{FLOAT}("-")                   { errorList.insertError(ERROR, "Símbolo inválido después de número -> " + yytext(), yyline); }
"-"?{INT}     { tokenList.insertToken(LITERAL, yytext(), yyline); }
"-"?{FLOAT}   { tokenList.insertToken(LITERAL, yytext(), yyline); }
\.[0-9]+                         { errorList.insertError(ERROR, "Flotante mal formado -> " + yytext(), yyline); } // Captura casos como .456
[0-9]+\.[0-9]+\.[0-9]+           { errorList.insertError(ERROR, "Flotante mal formado -> " + yytext(), yyline); }
0[xX][^0-9A-Fa-f]+ { errorList.insertError(ERROR, "Hexadecimal mal formado -> " + yytext(), yyline); }
0[0-9]+                          { errorList.insertError(ERROR, "Octal mal formado -> " + yytext(), yyline); } //caracteres octales no validos
({DECIMAL}|{ZERO})[eE][^\+\-0-9] { errorList.insertError(ERROR, "Exponente mal formado -> " + yytext(), yyline); } 
{DECIMAL}\.[^0-9]+               { errorList.insertError(ERROR, "Flotante mal formado -> " + yytext(), yyline); } //casos como 123.

// 4. OPERADORES
"," | ";" | "++" | "--" | "==" | ">=" | ">" | "?" | "<=" | "<" | "!=" | "||" | "&&" | "!" | "=" | "+" | "-" | 
"*" | "/" | "%" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." | "+=" | "-=" | "*=" | "/=" | "&" | "^" | "|" | 
">>" | "<<" | "~" | "%=" | "&=" | "^=" | "|=" | "<<=" | ">>=" | "->" {tokenList.insertToken(OPERADOR, yytext(), yyline);}

// 5. STRINGS
\"([^\"\\\n]|\\.)*\" {tokenList.insertToken(LITERAL, yytext(), yyline);}
\'([^\'\\\n]|\\[\'\"\\ntr0])\' {tokenList.insertToken(LITERAL, yytext(), yyline);}      // linea anadida despues de la revision

// \"([^\"\\\n]|\\.)*\"[^ \t\n\r]* {errorList.insertError(ERROR, "String invalido -> " + yytext(), yyline);}

\"([^\"\\\n]|\\.)* {errorList.insertError(ERROR, "String no cerrado -> " + yytext(), yyline);}
\'([^\'\\\n]|\\[\'\"\\ntr0]) {errorList.insertError(ERROR, "Caracter no cerrado -> " + yytext(), yyline);}  // linea anadida despues de la revision
\'([^\'\\\n]|\\.)+\' {errorList.insertError(ERROR, "Caracter mal formado -> " + yytext(), yyline);}         // linea anadida despues de la revision

"#"{DECIMAL} {tokenList.insertToken(LITERAL, yytext(), yyline);}
"#"[^ \t\n\r]* {errorList.insertError(ERROR, "Caracter invalido -> " + yytext(), yyline);}


// 6. IDENTIFICADORES  
{DECIMAL}{Alfanumerico} {errorList.insertError(ERROR,"Identificador no puede empezar con un número -> " + yytext(), yyline); }
{Alfanumerico} {tokenList.insertToken(IDENTIFICADOR, yytext(),  yyline); }

.             {errorList.insertError(ERROR, "Desconocido -> " + yytext(),  yyline); }
