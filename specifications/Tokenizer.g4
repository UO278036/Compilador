lexer grammar Tokenizer;

IDENT
	: [a-zA-Z_][a-zA-Z0-9_]+
	;

INT_LITERAL
	: [0-9]+
	;

REAL : INT_LITERAL+ '.' INT_LITERAL+;

READ: 'read';
PRINT: 'print';

LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;
	
MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;
CHAR_LITERAL
	: '\' '~[\n\r] '\''
	|	'\' \n\'' 
	;