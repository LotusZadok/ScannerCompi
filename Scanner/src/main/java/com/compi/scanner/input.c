// Comentario de una línea

/* Comentario
de 
bloque que debe ser ignorado por el lexer.
*/

/* Comentario bloque no cerrado (debería causar un error)
int x = 5; 
*/

// Números enteros
12345678
0      // Esto debería ser reconocido como un entero (no octal)
0777   // Octal válido
00001  // Octal con ceros a la izquierda

// Números hexadecimales
0x1A3F
0XFF
0x0  // Hexadecimal con valor 0

// Números flotantes
5.0
0.123456
.456    // Malformado, debe dar error
123.    // Malformado, debe dar error
1.5e10
3.0E-5
3E8    // Flotante en notación científica sin punto decimal

// Operadores y símbolos
+ - * / % = == != <= >= && || ++ -- += -= *= /= %=
<< >> & | ^ ~ -> : ; , . ?
*0      // operador seguido de numero
+cero   // operador seguido de identificador
/case   // operador seguido de palara reservada
-#32    // operador seguido de literal

// Identificadores y palabras reservadas
int variable1;
float x_y_z;
if (x > 0) return;
identificadorValido123;
_invalid_identifier;  // Error: empieza con _
9identificadorInvalido; // Error: empieza con un número

// Literales de caracteres (valores ASCII)
#65   // Representa 'A'
#97   // Representa 'a'
#48   // Representa '0'
#InvalidLiteral   // Error: malformado

// Strings y errores en strings
"Esta es una cadena de texto válida"
"Este string tiene un salto de línea directo:
y deberia causar un error"
"String con \q"
"He said, \"Hello!\" and left."  // String válido con comillas escapadas
"String con escape \n"  // String válido con un carácter de escape
"Hola" == "Hola"
"string"adsa 
"Sin cerrar este string
"This string is "malformado""  // Error: comillas dentro sin escapar

// Palabras reservadas
Auto        // es case sentitive, lo va a reconocer como id
break   
case
const
while void  // reconoce palabras resrvadas seguidas separadas por un espacio
whilevoid   // no hay espacio entre las palabras reservadas, lo va a reconocer como id

// Prueba de todos los casos y errores posibles
_underscore  // Error: comienza con un subrayado
123IdentificadorMalformado  // Error: comienza con un número
0x123FG  // Error: 'G' no es válido en un hexadecimal
07877  // Error: dígito '8' no es válido en octal


"string"adsa 
"Sin cerrar este string
"This string is "malformado""  // Error: comillas dentro sin escapar
