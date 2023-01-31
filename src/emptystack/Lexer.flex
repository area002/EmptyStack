package emptystack;
import static emptystack.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int |
if |
else |
do while |
for |
foreach |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return asignacion;}
"==" {return asignacion;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"sqrt" {return Raiz;}
"%" {return residuo;}
"=" {return asignacion;}
">" {return mayor;}
"<" {return menor;}
">=" {return mayoroigualque;}
"<=" {return menoroigualque;}
"!=" {return diferente;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
