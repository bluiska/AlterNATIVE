//Arrays - DONE
//Array operations
//Global variables - DONE
//Func call - DONE
//Variable scoping to function - DONE
//Comments
//Using brackets to define precedence - 


grammar AlterNATIVE ;

program:
	 ('FINISH' stmt* 'START') function_def* declaration*
	;

function_def:
	(block|return_block) LPARENS (variable var_type)? (COMMA variable var_type)* RPARENS LABEL (var_type|VOIDTYPE)
	;
	
stmt :
	print_stmt
	| funcall
	| if_stmt
	| case_stmt
	| loop
	| input_stmt
	| assignment
	| declaration
	|
	;

block :
	RARROW stmt* LARROW
	;
return_block:
	RARROW RETURN operand stmt* LARROW
	;
funcall:
	void_funcall|nonvoid_funcall
	;

void_funcall :
	LPARENS variable* RPARENS LABEL 'call'
	;
nonvoid_funcall :
	variable? ASSIGNMENTOPERATOR LPARENS variable* RPARENS LABEL 'call'
	;


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

if_stmt :
	block LPARENS bool_stmt RPARENS 'if'
	;

	
bool_stmt:
	(bool_operation logic_connector)* bool_operation
	|(nonvoid_funcall logic_connector)* nonvoid_funcall
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
   | INC variable  		 # increment_by_1
   | DEC variable   	 # decrements_by_1
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
	block (LPARENS (number_operation ASSIGNMENTOPERATOR variable) SEMICOLON bool_operation SEMICOLON declaration RPARENS) FOR
	;
whileloop:
	block (LPARENS bool_operation WHILE RPARENS)
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
   | BOOL
   ;

var_type:
	FLOATTYPE
	|STRINGTYPE
	|BOOLTYPE
	;
		
variable :
	UNDERSCORE? LETTER (LETTER | DIGIT | UNDERSCORE)*
   ;

//Declare new variables. Constant and array is optional, variable type necessary.
declaration :
	operand ASSIGNMENTOPERATOR variable var_type ARRAY? CONST?
	|operations ASSIGNMENTOPERATOR variable var_type ARRAY? CONST?
	|nonvoid_funcall ASSIGNMENTOPERATOR variable var_type ARRAY? CONST?
   ;
   
//Assign value to already existing variable
assignment :
	operand ASSIGNMENTOPERATOR variable
	|operations ASSIGNMENTOPERATOR variable
	|nonvoid_funcall ASSIGNMENTOPERATOR variable
   ;


ASSIGNMENTOPERATOR: REQUALS ;
VALUE : [STRING NUMBER] ;
STRING : DOUBLEQUOTE [CHARACTER]+ DOUBLEQUOTE ;
NUMBER : [FLOAT SHORTFLOAT];
BOOL: TRUE|FALSE;
TRUE: 'true';
FALSE: 'false';
//Any standard ASCII char (that's readable, inc. space)
CHARACTER: [\u0040-\u007E];
ARRAY : LT [DIGIT]+ GT;
FLOAT : MINUS? DIGIT DIGIT* DOT DIGIT* ;
SHORTFLOAT : DOT DIGIT+ ;
UNDERSCORE : '_' ;
LETTER : LOWERCASE|UPPERCASE;
LABEL: [LETTER]+;
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
INC : ADD REQUALS;
DEC : SUB REQUALS;
COLON : ':' ;
COMMA : ',';
PRINTLN : 'nloutput';
PRINT : 'output';
RETURN: 'return';
INPUT : 'userinput';
STRINGTYPE : 'text';
FLOATTYPE : 'decimal';
BOOLTYPE : 'logical';
VOIDTYPE: 'void';
ARRAYTYPE: LSQBRKT RSQBRKT;
FOR: 'for';
WHILE: 'as long as';


