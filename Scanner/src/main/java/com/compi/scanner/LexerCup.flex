package com.compi.scanner;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%line
%column
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
":"         { return new Symbol(sym.COLON, yyline, yycolumn, yytext()); }
";"         { return new Symbol(sym.SEMI, yyline, yycolumn, yytext()); }
","         { return new Symbol(sym.COMMA, yyline, yycolumn, yytext()); }
"/="        { return new Symbol(sym.DIV_EQ, yyline, yycolumn, yytext()); }
"*="        { return new Symbol(sym.TIMES_EQ, yyline, yycolumn, yytext()); }
"+="        { return new Symbol(sym.PLUS_EQ, yyline, yycolumn, yytext()); }
"-="        { return new Symbol(sym.MINUS_EQ, yyline, yycolumn, yytext()); }
"++"        { return new Symbol(sym.PLUS_PLUS, yyline, yycolumn, yytext()); }
"--"        { return new Symbol(sym.MINUS_MINUS, yyline, yycolumn, yytext()); }
"{"         { return new Symbol(sym.LBRACKET, yyline, yycolumn, yytext()); }
"}"         { return new Symbol(sym.RBRACKET, yyline, yycolumn, yytext()); }
"("         { return new Symbol(sym.LPAREN, yyline, yycolumn, yytext()); }
")"         { return new Symbol(sym.RPAREN, yyline, yycolumn, yytext()); }
"="         { return new Symbol(sym.EQ, yyline, yycolumn, yytext()); }
"+"         { return new Symbol(sym.PLUS, yyline, yycolumn, yytext()); }
"-"         { return new Symbol(sym.MINUS, yyline, yycolumn, yytext()); }
"*"         { return new Symbol(sym.TIMES, yyline, yycolumn, yytext()); }
"/"         { return new Symbol(sym.DIV, yyline, yycolumn, yytext()); }
"%"         { return new Symbol(sym.MOD, yyline, yycolumn, yytext()); }
"!"         { return new Symbol(sym.NOT, yyline, yycolumn, yytext()); }
"&&"        { return new Symbol(sym.AND, yyline, yycolumn, yytext()); }
"||"        { return new Symbol(sym.OR, yyline, yycolumn, yytext()); }
"=="        { return new Symbol(sym.EQ_EQ, yyline, yycolumn, yytext()); }
"!="        { return new Symbol(sym.NOT_EQ, yyline, yycolumn, yytext()); }
"<"         { return new Symbol(sym.LT, yyline, yycolumn, yytext()); }
"<="        { return new Symbol(sym.LT_EQ, yyline, yycolumn, yytext()); }
">"         { return new Symbol(sym.GT, yyline, yycolumn, yytext()); }
">="        { return new Symbol(sym.GT_EQ, yyline, yycolumn, yytext()); }

// 3. PALABRAS RESERVADAS
"int"       { return new Symbol(sym.TYPE_INT, yyline, yycolumn, yytext()); }
"long"      { return new Symbol(sym.TYPE_LONG, yyline, yycolumn, yytext()); }
"short"      { return new Symbol(sym.TYPE_SHORT, yyline, yycolumn, yytext()); }
"char"      { return new Symbol(sym.TYPE_CHAR, yyline, yycolumn, yytext()); }
"void"      { return new Symbol(sym.VOID, yyline, yycolumn, yytext()); }

"if"        { return new Symbol(sym.IF, yyline, yycolumn, yytext()); }
"else"      { return new Symbol(sym.ELSE, yyline, yycolumn, yytext()); }

"for"       { return new Symbol(sym.FOR, yyline, yycolumn, yytext()); }

"while"     { return new Symbol(sym.WHILE, yyline, yycolumn, yytext()); }

"switch"    { return new Symbol(sym.SWITCH, yyline, yycolumn, yytext()); }
"case"      { return new Symbol(sym.CASE, yyline, yycolumn, yytext()); }
"default"   { return new Symbol(sym.DEFAULT, yyline, yycolumn, yytext()); }

"const"     { return new Symbol(sym.CONST, yyline, yycolumn, yytext()); }
"global"    { return new Symbol(sym.GLOBAL, yyline, yycolumn, yytext()); }

"true"      { return new Symbol(sym.TRUE, yyline, yycolumn, yytext()); }
"false"     { return new Symbol(sym.FALSE, yyline, yycolumn, yytext()); }

"continue"  { return new Symbol(sym.CONTINUE, yyline, yycolumn, yytext()); }
"break"     { return new Symbol(sym.BREAK, yyline, yycolumn, yytext()); }
"do"        { return new Symbol(sym.DO, yyline, yycolumn, yytext()); }
"return"    { return new Symbol(sym.RETURN, yyline, yycolumn, yytext()); }


//  4. NUMEROS
{INT}("-")                     { reportError("Símbolo inválido después de número -> " + yytext()); }
{FLOAT}("-")                   { reportError("Símbolo inválido después de número -> " + yytext()); }
"-"?{INT}     { return new Symbol(sym.INT, yyline, yycolumn, yytext()); }
"-"?{FLOAT}   { return new Symbol(sym.FLOAT, yyline, yycolumn, yytext()); }
\.[0-9]+                         { reportError("Flotante mal formado -> " + yytext()); } // Captura casos como .456
[0-9]+\.[0-9]+\.[0-9]+           { reportError("Flotante mal formado -> " + yytext()); }
0[xX][^0-9A-Fa-f]+ { reportError("Hexadecimal mal formado -> " + yytext()); }
0[0-9]+                          { reportError("Octal mal formado -> " + yytext()); } //caracteres octales no validos
({DECIMAL}|{ZERO})[eE][^\+\-0-9] { reportError("Exponente mal formado -> " + yytext()); }
{DECIMAL}\.[^0-9]+               { reportError("Flotante mal formado -> " + yytext()); } //casos como 123.


// 5. STRINGS
\'([^\'\\\n]|\\[\'\"\\ntr0])\' { return new Symbol(sym.CHAR, yyline, yycolumn, yytext()); }
\"([^\"\\\n]|\\.)*\" { return new Symbol(sym.STRING, yyline, yycolumn, yytext()); }
\"([^\"\\\n]|\\.)* { reportError("String no cerrado -> " + yytext()); }
\'([^\'\\\n]|\\.)+\' { reportError("Caracter mal formado -> " + yytext()); }
\'([^\'\\\n]|\\[\'\"\\ntr0]) { reportError("Caracter no cerrado -> " + yytext()); }

"#"{DECIMAL} { return new Symbol(sym.CHAR, yyline, yycolumn, yytext()); }
"#"[^ \t\n\r]* { reportError("Caracter invalido -> " + yytext()); }

// 6. IDENTIFICADORES
{DECIMAL}{Alfanumerico} { reportError("Identificador no puede empezar con un número -> " + yytext()); }
{Alfanumerico} { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }

.             { reportError("Desconocido -> " + yytext()); }