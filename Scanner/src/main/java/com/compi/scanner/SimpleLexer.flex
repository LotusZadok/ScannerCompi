/* Simple JFlex example to tokenize arithmetic expressions */

package com.compi.scanner;
import static com.compi.scanner.Tokens.*;
%%

%class SimpleLexer
%unicode
%public
%type Token
%line

L = [a-zA-Z]
D = [0-9]
Alfanumerico = {L}({L}|{D})* // Letra seguida de letras o digitos
Entero = {D}+ 

%{
    public String lexeme;
%}


%%

// TODO: Añadir expresiones regulares para los tokens
// Ver ejemplo https://github.com/ernesto-si/proyectocomppiladores2021/blob/master/src/codigo/Lexer.flex

[ \t\n\r]    { /* ignore */ }

// 1. OMITIR COMENTARIOS 
"//".* { /* ignore */ }
"/*"([^*]|\*+[^*/])*"*"+"/" { /* ignore */ }

// 2. PALABRAS RESERVADAS
auto | break | case | char | const | continue | default | do | double | else | enum | extern | float | for |
goto | if | int | long | register | return | short | signed | sizeof | static | struct | switch | typedef |
union | unsigned | void | volatile | while {return new Token(PALABRA_RESERVADA, yytext(), yyline);}

// 3. NUMEROS


// 4. OPERADORES
"," | ";" | "++" | "--" | "==" | ">=" | ">" | "?" | "<=" | "<" | "!=" | "||" | "&&" | "!" | "=" | "+" | "-" | 
"*" | "/" | "%" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." | "+=" | "-=" | "*=" | "/=" | "&" | "^" | "|" | 
">>" | "<<" | "~" | "%=" | "&=" | "^=" | "|=" | "<<=" | ">>=" | "->" {return new Token(OPERADOR, yytext(), yyline);}

// 5. STRINGS
"\""([^\"\\\n]|\\[\"\\bfnrt])*"\"" {return new Token(LITERAL, yytext(), yyline);}
"\""(.[^\n]*)"\"" {return new Token(ERROR, yytext(), yyline);}
"#"{Entero} {return new Token(LITERAL, yytext(), yyline);}
"#"[^ \t\n\r]* {return new Token(ERROR, yytext(), yyline);}

// 6. IDENTIFICADORES  
{Entero}{Alfanumerico} {return new Token(ERROR, yytext(), yyline); }
{Alfanumerico} {return new Token(IDENTIFICADOR, yytext(),  yyline); }

.             {return new Token(ERROR, yytext(),  yyline); }