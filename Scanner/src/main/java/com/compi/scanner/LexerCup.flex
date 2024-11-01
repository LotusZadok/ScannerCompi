package com.compi.scanner;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%line
%char

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
  private void reportError(String message) {
    System.err.println("Error léxico en línea " + (yyline + 1) + ", columna " + (yycolumn + 1) + ": " + message);
  }
%}

%%

[ \t\n\r]+    { /* ignore */ }

// 1. OMITIR COMENTARIOS 
"//".* { /* ignore */ }
"/*"([^*]|\*+[^*/])*"*"+"/" { /* ignore */ }
"/*"[^\n\r]* { reportError("Comentario no cerrado -> " + yytext()); }

// 2. OPERADORES Y SIMBOLOS
":"         { return new Symbol(sym.COLON, yyline, (int) yychar, yytext()); }
";"         { return new Symbol(sym.SEMI, yyline, (int) yychar, yytext()); }
","         { return new Symbol(sym.COMMA, yyline, (int) yychar, yytext()); }
"/="        { return new Symbol(sym.DIV_EQ, yyline, (int) yychar, yytext()); }
"*="        { return new Symbol(sym.TIMES_EQ, yyline, (int) yychar, yytext()); }
"+="        { return new Symbol(sym.PLUS_EQ, yyline, (int) yychar, yytext()); }
"-="        { return new Symbol(sym.MINUS_EQ, yyline, (int) yychar, yytext()); }
"++"        { return new Symbol(sym.PLUS_PLUS, yyline, (int) yychar, yytext()); }
"--"        { return new Symbol(sym.MINUS_MINUS, yyline, (int) yychar, yytext()); }
"{"         { return new Symbol(sym.LBRACKET, yyline, (int) yychar, yytext()); }
"}"         { return new Symbol(sym.RBRACKET, yyline, (int) yychar, yytext()); }
"("         { return new Symbol(sym.LPAREN, yyline, (int) yychar, yytext()); }
")"         { return new Symbol(sym.RPAREN, yyline, (int) yychar, yytext()); }
"="         { return new Symbol(sym.EQ, yyline, (int) yychar, yytext()); }
"+"         { return new Symbol(sym.PLUS, yyline, (int) yychar, yytext()); }
"-"         { return new Symbol(sym.MINUS, yyline, (int) yychar, yytext()); }
"*"         { return new Symbol(sym.TIMES, yyline, (int) yychar, yytext()); }
"/"         { return new Symbol(sym.DIV, yyline, (int) yychar, yytext()); }
"%"         { return new Symbol(sym.MOD, yyline, (int) yychar, yytext()); }
"!"         { return new Symbol(sym.NOT, yyline, (int) yychar, yytext()); }
"&&"        { return new Symbol(sym.AND, yyline, (int) yychar, yytext()); }
"||"        { return new Symbol(sym.OR, yyline, (int) yychar, yytext()); }
"=="        { return new Symbol(sym.EQ_EQ, yyline, (int) yychar, yytext()); }
"!="        { return new Symbol(sym.NOT_EQ, yyline, (int) yychar, yytext()); }
"<"         { return new Symbol(sym.LT, yyline, (int) yychar, yytext()); }
"<="        { return new Symbol(sym.LT_EQ, yyline, (int) yychar, yytext()); }
">"         { return new Symbol(sym.GT, yyline, (int) yychar, yytext()); }
">="        { return new Symbol(sym.GT_EQ, yyline, (int) yychar, yytext()); }

// 3. PALABRAS RESERVADAS
"int"       { return new Symbol(sym.TYPE_INT, yyline, (int) yychar, yytext()); }
"long"      { return new Symbol(sym.TYPE_LONG, yyline, (int) yychar, yytext()); }
"shot"      { return new Symbol(sym.TYPE_SHORT, yyline, (int) yychar, yytext()); }
"char"      { return new Symbol(sym.TYPE_CHAR, yyline, (int) yychar, yytext()); }
"void"      { return new Symbol(sym.VOID, yyline, (int) yychar, yytext()); }

"if"        { return new Symbol(sym.IF, yyline, (int) yychar, yytext()); }
"else"      { return new Symbol(sym.ELSE, yyline, (int) yychar, yytext()); }

"for"       { return new Symbol(sym.FOR, yyline, (int) yychar, yytext()); }

"while"     { return new Symbol(sym.WHILE, yyline, (int) yychar, yytext()); }

"switch"    { return new Symbol(sym.SWITCH, yyline, (int) yychar, yytext()); }
"case"      { return new Symbol(sym.CASE, yyline, (int) yychar, yytext()); }
"default"   { return new Symbol(sym.DEFAULT, yyline, (int) yychar, yytext()); }

"const"     { return new Symbol(sym.CONST, yyline, (int) yychar, yytext()); }
"global"    { return new Symbol(sym.GLOBAL, yyline, (int) yychar, yytext()); }

"true"      { return new Symbol(sym.TRUE, yyline, (int) yychar, yytext()); }
"false"     { return new Symbol(sym.FALSE, yyline, (int) yychar, yytext()); }

"continue"  { return new Symbol(sym.CONTINUE, yyline, (int) yychar, yytext()); }
"break"     { return new Symbol(sym.BREAK, yyline, (int) yychar, yytext()); }
"do"        { return new Symbol(sym.DO, yyline, (int) yychar, yytext()); }
"return"    { return new Symbol(sym.RETURN, yyline, (int) yychar, yytext()); }


//  4. NUMEROS
{INT}("-")                     { reportError("Símbolo inválido después de número -> " + yytext()); }
{FLOAT}("-")                   { reportError("Símbolo inválido después de número -> " + yytext()); }
"-"?{INT}     { return new Symbol(sym.INT, yyline, (int) yychar, yytext()); }
"-"?{FLOAT}   { return new Symbol(sym.FLOAT, yyline, (int) yychar, yytext()); }
\.[0-9]+                         { reportError("Flotante mal formado -> " + yytext()); } // Captura casos como .456
[0-9]+\.[0-9]+\.[0-9]+           { reportError("Flotante mal formado -> " + yytext()); }
0[xX][^0-9A-Fa-f]+ { reportError("Hexadecimal mal formado -> " + yytext()); }
0[0-9]+                          { reportError("Octal mal formado -> " + yytext()); } //caracteres octales no validos
({DECIMAL}|{ZERO})[eE][^\+\-0-9] { reportError("Exponente mal formado -> " + yytext()); }
{DECIMAL}\.[^0-9]+               { reportError("Flotante mal formado -> " + yytext()); } //casos como 123.


// 5. STRINGS
\'([^\'\\\n]|\\[\'\"\\ntr0])\' { return new Symbol(sym.CHAR, yyline, (int) yychar, yytext()); }
\"([^\"\\\n]|\\.)*\" { return new Symbol(sym.STRING, yyline, (int) yychar, yytext()); }
\"([^\"\\\n]|\\.)* { reportError("String no cerrado -> " + yytext()); }
\'([^\'\\\n]|\\.)+\' { reportError("Caracter mal formado -> " + yytext()); }
\'([^\'\\\n]|\\[\'\"\\ntr0]) { reportError("Caracter no cerrado -> " + yytext()); }

"#"{DECIMAL} { return new Symbol(sym.CHAR, yyline, (int) yychar, yytext()); }
"#"[^ \t\n\r]* { reportError("Caracter invalido -> " + yytext()); }

// 6. IDENTIFICADORES
{DECIMAL}{Alfanumerico} { reportError("Identificador no puede empezar con un número -> " + yytext()); }
{Alfanumerico} { return new Symbol(sym.ID, yyline, (int) yychar, yytext()); }

.             { reportError("Desconocido -> " + yytext()); }