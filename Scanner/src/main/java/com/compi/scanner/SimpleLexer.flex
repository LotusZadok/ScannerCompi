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
    
%}


%%

// TODO: Añadir expresiones regulares para los tokens
// Ver ejemplo https://github.com/ernesto-si/proyectocomppiladores2021/blob/master/src/codigo/Lexer.flex

[ \t\n\r]    { /* ignore */ }

// 1. OMITIR COMENTARIOS 

"//".* { /* ignore */ }
"/*"([^*]|\*+[^*/])*"*"+"/" { /* ignore */ }

// 2. PALABRAS RESERVADAS

// 3. NUMEROS

// 4. OPERADORES




// 5. IDENTIFICADORES  
{Entero}{Alfanumerico} {return new Token(ERROR, yytext(), yyline); }
{Alfanumerico} {return new Token(IDENTIFICADOR, yytext(),  yyline); }

.             {return new Token(ERROR, yytext(),  yyline); }