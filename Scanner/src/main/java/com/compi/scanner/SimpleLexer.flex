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
Alfanumerico = {L}({L}|{D})* // Letra seguida de letras o digitos
Entero = {D}+ 

%{
    TokenList tokenList = TokenList.getInstance();
%}


%%

// TODO: Añadir expresiones regulares para los tokens
// Ver ejemplo https://github.com/ernesto-si/proyectocomppiladores2021/blob/master/src/codigo/Lexer.flex

[ \t\n\r]+    { /* ignore */ }

// 1. OMITIR COMENTARIOS 
"//".* { /* ignore */ }
"/*"([^*]|\*+[^*/])*"*"+"/" { /* ignore */ }

// 2. PALABRAS RESERVADAS
auto | break | case | char | const | continue | default | do | double | else | enum | extern | float | for |
goto | if | int | long | register | return | short | signed | sizeof | static | struct | switch | typedef |
union | unsigned | void | volatile | while {tokenList.insertToken(PALABRA_RESERVADA, yytext(), yyline);}

// 3. NUMEROS


// 4. OPERADORES
"," | ";" | "++" | "--" | "==" | ">=" | ">" | "?" | "<=" | "<" | "!=" | "||" | "&&" | "!" | "=" | "+" | "-" | 
"*" | "/" | "%" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." | "+=" | "-=" | "*=" | "/=" | "&" | "^" | "|" | 
">>" | "<<" | "~" | "%=" | "&=" | "^=" | "|=" | "<<=" | ">>=" | "->" {tokenList.insertToken(OPERADOR, yytext(), yyline);}

// 5. STRINGS
"\""([^\"\\\n]|\\[\"\\bfnrt])*"\"" {tokenList.insertToken(LITERAL, yytext(), yyline);}
"\""(.[^\n]*)"\"" {tokenList.insertToken(ERROR, "Error: String no valido -> " + yytext(), yyline);}
"\""[^\n\r]* {tokenList.insertToken(ERROR, "Error: String no cerrado -> " + yytext(), yyline);}



"#"{Entero} {tokenList.insertToken(LITERAL, yytext(), yyline);}
"#"[^ \t\n\r]* {tokenList.insertToken(ERROR, yytext(), yyline);}

// 6. IDENTIFICADORES  
{Entero}{Alfanumerico} {tokenList.insertToken(ERROR,"Error: Identificador no puede empezar con un número ->" + yytext(), yyline); }
{Alfanumerico} {tokenList.insertToken(IDENTIFICADOR, yytext(),  yyline); }

.             {tokenList.insertToken(ERROR, "Error: Desconocido -> " + yytext(),  yyline); }