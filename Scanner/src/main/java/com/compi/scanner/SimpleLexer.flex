/* Simple JFlex example to tokenize arithmetic expressions */

package com.compi.scanner;
import static com.compi.scanner.Tokens.*;
%%

%class SimpleLexer
%unicode
%public
%type Token

L = [a-zA-Z]
D = [0-9]
Alfanumerico = {L}({L}|{D})* // Letra seguida de letras o digitos
Entero = {D}+ 

%{
public int getLineNumber() {
    if (yyline == 0) {
      yyline++;
    }
    // cut the buffer to the correct size
    String str = new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);

    // count the number of \n in the matched text
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '\n') {
        yyline++;
      }
    }

    return yyline;
}
%}


%%

// TODO: Añadir expresiones regulares para los tokens
// Ver ejemplo https://github.com/ernesto-si/proyectocomppiladores2021/blob/master/src/codigo/Lexer.flex

[ \t\n\r]    { getLineNumber(); }

// 1. OMITIR COMENTARIOS 

"//".* { getLineNumber(); }
"/*"([^*]|\*+[^*/])*"*"+"/" { getLineNumber(); }

// 2. PALABRAS RESERVADAS

// 3. NUMEROS

// 4. OPERADORES




// 5. IDENTIFICADORES  
{Entero}{Alfanumerico} {return new Token(ERROR, yytext(), getLineNumber()); }
{Alfanumerico} {return new Token(IDENTIFICADOR, yytext(),  getLineNumber()); }

.             {return new Token(ERROR, yytext(),  getLineNumber()); }