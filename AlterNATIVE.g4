//Arrays - DONE
//Array operations
//Global variables - DONE
//Func call - DONE
//Variable scoping to function - DONE
//Comments - DONE
//Using brackets to define precedence - DONE

```javascript

/*
 *     ___     __   __                   _   __    ___   ______    ____ _    __    ______
   /   |   / /  / /_  ___    _____   / | / /   /   | /_  __/   /  _/| |  / /   / ____/
  / /| |  / /  / __/ / _ \  / ___/  /  |/ /   / /| |  / /      / /  | | / /   / __/   
 / ___ | / /  / /_  /  __/ / /     / /|  /   / ___ | / /     _/ /   | |/ /   / /___   
/_/  |_|/_/   \__/  \___/ /_/     /_/ |_/   /_/  |_|/_/     /___/   |___/   /_____/   
 *
 */

grammar AlterNATIVE ;

program:
	 ('FINISH' stmt* 'START') function_def* declaration*
	;

function_def:
	(block|return_block) LPARENS (variable var_type)? (COMMA variable var_type)* RPARENS LABEL (var_type ARRAY?|VOIDTYPE)
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
	| number_functions
	| array_operations
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
	(variable ASSIGNMENTOPERATOR)? LPARENS variable* RPARENS LABEL 'call'
	;
print_stmt :
	LPARENS DOUBLEQUOTE operand DOUBLEQUOTE RPARENS (PRINTLN|PRINT)
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
	(block 'otherwise')? (block 'or when')* block LPARENS bool_stmt RPARENS 'when'
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
	|text_operation
	|bool_operation
	;
array_operations:
	variable LEQUALS variable 'merge'	#merge
	| variable LEQUALS variable 'join'	#join
	;

number_operation :

	//Operations are listed in order of precedence
	  LPARENS number_operation RPARENS	# brackets_precedence
    | operand POW<assoc=right> operand 	# toPower //<assoc=right> defines that the power operator is right associative.
    | operand MUL operand 				# multiply
    | operand DIV operand 				# divide
    | operand MOD operand 				# modulo
    | operand ADD operand 				# add
    | operand SUB operand 				# subtract
    ;


number_functions:
	(INC|DEC) variable #increment_or_decrement
	;

text_operation :
	(TEXT|variable) (ADD (value|variable))+ # concatinate_text
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
	block
	(LPARENS ((number_operation ASSIGNMENTOPERATOR variable)|number_functions)
		SEMICOLON bool_operation
		SEMICOLON declaration
		RPARENS
	)
	'for'
	;
whileloop:
	block (LPARENS bool_stmt RPARENS) WHILE
	;
dountil:
	RARROW bool_stmt 'until' stmt* LARROW 'execute'
	;

operand :
	value
	|variable ARRAY?
	|NULL
   ;

value :
	NUMBER
   | TEXT
   | BOOL
   ;

var_type:
	FLOATTYPE
	|TEXTTYPE
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


ASSIGNMENTOPERATOR: REQUALS;
TEXT : DOUBLEQUOTE [CHARACTER]+ DOUBLEQUOTE ;
NUMBER : [FLOAT SHORTFLOAT];
BOOL: TRUE|FALSE;
TRUE: 'true';
FALSE: 'false';

//Comments are thrown out on the lexer channel
LINE_COMMENT : '//' .*? '\n' -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

//Match any character inc. escaped quotation mark.  [A-Z][a-Z][0-9] would not suffice
CHARACTER: '"' ( '\\"' | . )*? '"' ;

ARRAY : LT [DIGIT]* GT;
FLOAT : MINUS? DIGIT DIGIT* DOT DIGIT* ;
SHORTFLOAT : DOT DIGIT+ ;
UNDERSCORE : '_' ;
LETTER : LOWERCASE|UPPERCASE;
LABEL: [LETTER]+;
DIGIT : [0-9] ;
OR: 'or';
AND: 'and';
CONST: 'constant';
WHITESPACE : [' '\t\r\n] -> skip ;
REQUALS : '==>' ;
LEQUALS : '<==';
BOOLEQUALS : '<==>';
DOUBLEQUOTE : '"' ;
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
TEXTTYPE : 'text';
FLOATTYPE : 'decimal';
BOOLTYPE : 'logical';
VOIDTYPE: 'void';
NULL: 'null';
WHILE: 'as long as';

fragment
	UPPERCASE: [A-Z] ;
fragment
	LOWERCASE : [a-z] ;

```
