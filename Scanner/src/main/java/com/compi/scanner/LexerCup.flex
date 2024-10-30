package com.compi.scanner;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
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
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%

[ \t\n\r]+    { /* ignore */ }

// 1. OMITIR COMENTARIOS 
"//".* { /* ignore */ }
"/*"([^*]|\*+[^*/])*"*"+"/" { /* ignore */ }

// Comillas 
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

// 2. PALABRAS RESERVADAS
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}
//( char ) {return new Symbol(sym.Char, yychar, yyline, yytext());}
( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());}
( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}
//( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}
//( long ) {return new Symbol(sym.Long, yychar, yyline, yytext());}
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}
//( short ) {return new Symbol(sym.Short, yychar, yyline, yytext());}
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}
( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

( char | int | long | short ) {return new Symbol(sym.Tipo_dato, yychar, yyline, yytext());}


// 3. NUMEROS

// 4. OPERADORES
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

( "++" | "--" | "=" | "+" | "-" | "*" | "/" | "%" | "+=" | "-=" | "*=" | "/=" ) {return new Symbol(sym.Op_aritmetrico, yychar, yyline, yytext());}
( "==" | ">=" | ">" | "<=" | "<" | "!=" | "||" | "&&" | "!" ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

// 5. STRINGS

// 6. IDENTIFICADORES
{Alfanumerico} {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

.   {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
