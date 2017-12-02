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
	| ifstmt
	| loop
	| inputstmt
	;

block :
	RARROW stmt* LARROW
	;

//TO-DO: CHECK if I can print floats....
printstmt :
	LPARENS SINGLEQUOTE operand SINGLEQUOTE RPARENS (PRINTLN|PRINT) 
	;
inputstmt:
	LPARENS variable RPARENS INPUT
	;

funcall :
	STRING operand?
	| STRING operand (SEMICOLON operand)+
	;



booleanop :
	operand LT operand
	| operand GT operand
	| operand LT REQUALS operand
	| operand GT REQUALS operand
	| operand BOOLEQUALS operand
	| operand EXCLAIM REQUALS operand
	;

ifstmt :
	block LPARENS boolstmt RPARENS 'if'
	;
boolstmt:
	(booleanop logic_connector)* booleanop
	;

logic_connector:
	OR
	|AND
	;
operations:
	number_operation
	|string_operation
	|bool operation
	;

number_operation :
	operand MUL operand # multiply
   | operand DIV operand # divide
   | operand ADD operand # add
   | operand SUB operand # subtract
   | operand POW operand # toPower
   | operand MOD operand # modulo
   | variable INC		 # increment_by_1
   | variable DEC  		 # decrements_by_1
   ;

loop :
	forloop
	|whileloop
	|dountil
	;
	
forloop :
	block (LPARENS (assignment|number_operation) SEMICOLON booleanop SEMICOLON declaration RPARENS) FORTYPE
	;
whileloop:
	block (LPARENS booleanop WHILETYPE RPARENS)
	;
dountil:
	RARROW booleanop 'until' stmt* LARROW 'execute'
	;

operand :
	value | variable
   ;

//expression :
//	LPARENS (operations | booleanop) RPARENS
//   ;

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

//Declare new variables. Constant is optional, variable type necessary.
declaration :
	operand ASSIGNMENTOPERATOR variable var_type CONST?
   ;
   
//Assign value to already existing variable
assignment :
	operand ASSIGNMENTOPERATOR variable
   ;


ASSIGNMENTOPERATOR: REQUALS ;
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
CONST: 'constant';
WHITESPACE : [' '\t\r\n] -> skip ;
REQUALS : '==>' ;
LEQUALS : '<==';
BOOLEQUALS : '<==>';
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
INC : LEQUALS ADD;
DEC : LEQUALS SUB;
COLON : ':' ;
PRINTLN : 'nloutput';
PRINT : 'output';
INPUT : 'userinput';
STRINGTYPE : 'rope';
FLOATTYPE : 'decimal';
FORTYPE: 'for';
WHILETYPE: 'as long as';


