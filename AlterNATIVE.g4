// Fragments of the original program
/*

[age]
   print
   input "enter your age in years 50-99: ";a
   if a<50 or a>99 then print:print " ===> age is outside of accepted parameters":goto [age]

bmi=int(((p*703)/(i^2))+.5)

x=bmi

*/
grammar AlterNATIVE ;

//block :
//	label stmt+	COLON 'goto' label
//	;
//
//label :
//	LSQBRKT variable RSQBRKT
//	;
//

stmt :
	printstmt
	| funcall
	| boolstmt
	| expression
	| loop
	;

block :
	RARROW stmt* LARROW
	;

printstmt :
	LPARENS value RPARENS PRINTLN 
	| LPARENS value RPARENS PRINT
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
	'if' booleanop (logic_connector booleanop)* 'then' stmt
	;

logic_connector:
	OR
	|AND
	;

operation :
	operand MUL operand # multiply
   | operand DIV operand # divide
   | operand ADD operand # add
   | operand SUB operand # subtract
   | operand POW operand # toPower
   | operand MOD operand # modulo
   | operand 
   ;

loop :
	forloop
	|whileloop
	|dountil
	;
	
forloop :
	block (LPARENS assignment SEMICOLON booleanop SEMICOLON declaration RPARENS) FORTYPE
	;
whileloop:
	block (LPARENS booleanop WHILETYPE RPARENS)
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

var_type:
	FLOATTYPE
	|STRINGTYPE
	;
		
variable :
	UNDERSCORE? LETTER (LETTER | DIGIT | UNDERSCORE)*
   ;

declaration :
	operand ASSIGNMENTOPERATOR variable var_type
   ;
   
assignment :
	operand ASSIGNMENTOPERATOR variable
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
OR: 'or';
AND: 'and';
WHITESPACE : [' '\t\r\n] -> skip ;
EQUALS : '==>' ;
DOUBLEQUOTE : '"' ;
SINGLEQUOTE : '\'' ;
MINUS : '-' ;
DOT : '.' ;
SEMICOLON: ';';
LPARENS : '(' ;
RPARENS : ')' ;
LSQBRKT : '[' ;
RSQBRKT : ']' ;
LARROW : '<-';
RARROW : '->';
LT : '<<' ;
GT : '>>' ;
EXCLAIM : '!' ;
POW : '^^' ;
MUL : '**' ;
DIV : '//' ;
ADD : '++' ;
SUB : '--' ;
MOD : '%%' ;
INC : ADD EQUALS;
COLON : ':' ;
PRINTLN : 'nloutput';
PRINT : 'output';
STRINGTYPE : 'rope';
FLOATTYPE : 'decimal';
FORTYPE: 'for';
WHILETYPE: 'as long as';

