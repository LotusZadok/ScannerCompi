/* Simple JFlex example to tokenize arithmetic expressions */

package com.compi.scanner;
import static com.compi.scanner.Token.*;
%%

%class SimpleLexer
%unicode
%public
%type Token

%{
  public String lexeme;
%}

%%

// TODO: Añadir expresiones regulares para los tokens
// Ver ejemplo https://github.com/ernesto-si/proyectocomppiladores2021/blob/master/src/codigo/Lexer.flex

"+"           {lexeme=yytext(); return PLUS; }
"-"           {lexeme=yytext(); return MINUS; }
"*"           {lexeme=yytext(); return MULTIPLY; }
"/"           {lexeme=yytext(); return DIVIDE; }
[0-9]+        {lexeme=yytext(); return INTEGER; }
[ \t\n\r]+    { /* Ignore whitespace */ }
.             {lexeme=yytext(); return UNKNOWN; }