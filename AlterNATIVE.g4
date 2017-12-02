
grammar AlterNATIVE ;

stmt :
	print_stmt
	| funcall
	| if_stmt
	| case_stmt
	| loop
	| input_stmt
	;

block :
	RARROW stmt* LARROW
	;

//TO-DO: CHECK if I can print floats....
print_stmt :
	LPARENS SINGLEQUOTE operand SINGLEQUOTE RPARENS (PRINTLN|PRINT) 
	;
input_stmt:
	LPARENS variable RPARENS INPUT
	;
case_stmt:
	RARROW case_block+ LARROW LPARENS operand RPARENS 'check'
	;
case_block:
	'terminate' EXCLAIM stmt* COLON case_condition
	;
case_condition:
	('is' bool_operator operand)
	|'by default'
	;
	
funcall :
	STRING operand?
	| STRING operand (SEMICOLON operand)+
	;

if_stmt :
	block LPARENS bool_stmt RPARENS 'if'
	;
bool_stmt:
	(bool_operation logic_connector)* bool_operation
	;

logic_connector:
	OR
	|AND
	;
operations:
	number_operation
	|string_operation
	|bool_operation
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

string_operation :
	(STRING|variable) (ADD (value|variable))+ # concatinate_string
	;

bool_operation :
	operand bool_operator operand
	;

bool_operator:
	LT
	|GT
	|LT REQUALS
	|GT REQUALS
	|BOOLEQUALS
	|EXCLAIM REQUALS
	;

loop :
	forloop
	|whileloop
	|dountil
	;
	
forloop :
	block (LPARENS (number_operation ASSIGNMENTOPERATOR variable) SEMICOLON bool_operation SEMICOLON declaration RPARENS) FORTYPE
	;
whileloop:
	block (LPARENS bool_operation WHILETYPE RPARENS)
	;
dountil:
	RARROW bool_operation 'until' stmt* LARROW 'execute'
	;

operand :
	value | variable
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

//Declare new variables. Constant is optional, variable type necessary.
declaration :
	operand ASSIGNMENTOPERATOR variable var_type CONST?
   ;
   
//Assign value to already existing variable
assignment :
	operand ASSIGNMENTOPERATOR variable
	|operations ASSIGNMENTOPERATOR variable
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


