// Fragments of the original program
/*

[age]
   print
   input "enter your age in years 50-99: ";a
   if a<50 or a>99 then print:print " ===> age is outside of accepted parameters":goto [age]

bmi=int(((p*703)/(i^2))+.5)

x=bmi

*/
grammar JustBasic ;

block :
	label stmt+	COLON 'goto' label
	;

label :
	LSQBRKT variable RSQBRKT
	;

stmt :
	printstmt
	| funcall
	| boolstmt
	| expression
	COLON?
	;

printstmt :
	'print'
	| 'print' DOUBLEQUOTE STRING  DOUBLEQUOTE
	;

funcall :
	STRING operand?
	| STRING operand (SEMICOLON operand)+
	;

booleanop :
	operand LT operand
	| operand GT operand
	| operand LT EQUALS operand
	| operand GT EQUALS operand
	| operand EQUALS EQUALS operand
	| operand EXCLAIM EQUALS operand
	;

boolstmt :
	'if' booleanop ('or' booleanop)* 'then' stmt
	;

operation :
	operand MUL operand # multiply
   | operand DIV operand # divide
   | operand ADD operand # add
   | operand SUB operand # subtract
   | operand POW operand # toPower
   | operand MOD operand # modulo
   ;

operand :
	value | variable
   ;

expression :
	LPARENS? (operation | booleanop) RPARENS?
   ;

value :
	NUMBER
   | STRING
   ;

type:
	FLOATTYPE
	|STRINGTYPE

variable :
	UNDERSCORE? LETTER (LETTER | DIGIT | UNDERSCORE)*
   ;

assignment :
	operand ASSIGNMENTOPERATOR variable type
   ;


ASSIGNMENTOPERATOR: EQUALS ;
VALUE : [STRING NUMBER] ;
STRING : DOUBLEQUOTE [LETTER EQUALS GT WS NUMBER ' ']+ DOUBLEQUOTE ;
NUMBER : [FLOAT SHORTFLOAT] ;
FLOAT : MINUS? DIGIT DIGIT* DOT DIGIT* ;
SHORTFLOAT : DOT DIGIT+ ;
UNDERSCORE : '_' ;
LETTER : LOWERCASE|UPPERCASE;
fragment
	UPPERCASE: [A-Z] ;
fragment
	LOWERCASE : [a-z] ;
DIGIT : [0-9] ;
WHITESPACE : [' '\t\r\n] -> skip ;
EQUALS : '==>' ;
DECIMAL : 'decimal';
DOUBLEQUOTE : '"' ;
SINGLEQUOTE : '\'' ;
MINUS : '-' ;
DOT : '.' ;
LPARENS : '(' ;
RPARENS : ')' ;
LSQBRKT : '[' ;
RSQBRKT : ']' ;
LT : '<<' ;
GT : '>>' ;
EXCLAIM : '!' ;
POW : '^^' ;
MUL : '**' ;
DIV : '//' ;
ADD : '++' ;
SUB : '--' ;
MOD : '%%' ;
COLON : ':' ;
STRINGTYPE : 'rope'
FLOATTYPE : 

