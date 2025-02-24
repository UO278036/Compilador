grammar Grammar;

import Tokenizer;

program
	:  definicion+ sentencia+ EOF
	;

definicion
	: 'var' IDENT':'tipo';'
	;

tipo
	: 'int'
	| 'real'
	| 'float'
	| 'char'
	;

sentencia
	: 'print' expr ';'
	| 'read' IDENT ';'
	| IDENT '=' expr ';'
	| 'if' '(' expr ')' '{' sentencia+ '}'
	| 'if' '(' expr ')' '{' sentencia+ '}' 'else' '{' sentencia+ '}'
	| 'while' '(' expr ')' '{' sentencia+ '}'
	;

expr
	: LITENT
	| LITREAL
	| IDENT
	| expr '+' expr
	| expr '!=' expr
	| '(' expr ')'
	| '<' tipo '>' '(' expr ')'
	;
