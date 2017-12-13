//Arrays - DONE
//Array operations
//Global variables - DONE
//Func call - DONE
//Variable scoping to function - DONE
//Comments - DONE
//Using brackets to define precedence - DONE

```javascript

/*
 *  ___     __   __                   _   __    ___   ______    ____ _    __    ______
   /   |   / /  / /_  ___    _____   / | / /   /   | /_  __/   /  _/| |  / /   / ____/
  / /| |  / /  / __/ / _ \  / ___/  /  |/ /   / /| |  / /      / /  | | / /   / __/   
 / ___ | / /  / /_  /  __/ / /     / /|  /   / ___ | / /     _/ /   | |/ /   / /___   
/_/  |_|/_/   \__/  \___/ /_/     /_/ |_/   /_/  |_|/_/     /___/   |___/   /_____/   
 *
 *///                                                     created by   Gergo Kekesi
 //                                                                 ******************                                           

grammar AlterNATIVE ;

program:
	 ('FINISH' stmt* 'START') (function_def|declaration)*
	;

function_def:
	(block|return_block) LPARENS (variable var_type)? (COMMA variable var_type)* RPARENS LABEL (var_type array?|VOIDTYPE)
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
	| array_functions
	;

block :
	RARROW stmt* LARROW
	;
return_block:
	RARROW RETURN operand stmt* LARROW
	;
funcall:
	LPARENS variable* RPARENS LABEL 'call'
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
	 LPARENS bool_stmt RPARENS
	|((bool_operation|funcall) logic_connector)* (bool_operation|funcall)
	;

logic_connector:
	AND
	|OR
	;

operations:
	number_operation
	|text_operation
	|bool_operation	
	;
array_functions:
	variable EQUALS variable 'merge'	#merge
	| variable EQUALS variable 'join'	#join
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
	|LT EQUALS
	|GT EQUALS
	|BOOLEQUALS
	|EXCLAIM EQUALS
	;


loop :
	forloop
	|whileloop
	|dountil
	;

forloop :
	block
	(LPARENS ((number_operation EQUALS variable)|number_functions)
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
	|variable array?
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

array:
	LT (DIGIT+|variable|funcall|number_operation) GT
	;

variable :
	UNDERSCORE? LETTER (LETTER | DIGIT | UNDERSCORE)*
   ;

//Declare new variables. Constant and array is optional, variable type necessary.
declaration :
	(operand EQUALS variable var_type
	|operations EQUALS variable var_type
	|funcall EQUALS variable var_type 
	|(funcall|LT GT|LT value (',' value)* GT) EQUALS variable var_type array)
	CONST?
   ;

//Assign value to already existing variable
assignment :
	 (operand EQUALS variable
	|operations EQUALS variable
	|funcall EQUALS variable )
	array?
   ;

//LEXER RULES------------------------------------------------------------------------

TEXT : DOUBLEQUOTE [CHARACTER]+ DOUBLEQUOTE ;
NUMBER : [FLOAT SHORTFLOAT];
BOOL: 'true'|'false';

//Comments are thrown out on the lexer channel
LINE_COMMENT : '//' .*? '\n' -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

//Match any character inc. escaped quotation mark.  [A-Z][a-Z][0-9] would not suffice
CHARACTER: '"' ( '\\"' | . )*? '"' ;


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
EQUALS : '==>' ;
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
INC : ADD EQUALS;
DEC : SUB EQUALS;
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
