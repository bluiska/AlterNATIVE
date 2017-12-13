
```javascript

/*
 *  ___     __   __                   _   __    ___   ______    ____ _    __    ______
   /   |   / /  / /_  ___    _____   / | / /   /   | /_  __/   /  _/| |  / /   / ____/
  / /| |  / /  / __/ / _ \  / ___/  /  |/ /   / /| |  / /      / /  | | / /   / __/   
 / ___ | / /  / /_  /  __/ / /     / /|  /   / ___ | / /     _/ /   | |/ /   / /___   
/_/  |_|/_/   \__/  \___/ /_/     /_/ |_/   /_/  |_|/_/     /___/   |___/   /_____/   
 *
 */// A language that's "flippin" weird...                created by   Gergo Kekesi
 //                                                                 ******************                                           

grammar AlterNATIVE ;

program:
	 ('FINISH' stmt* 'START') (function_def|declaration)*
	;

function_def:
	(block|return_block) LPARENS (variable var_type)? (COMMA variable var_type)* RPARENS LABEL (var_type array?|VOIDTYPE)
	;
funcall:
	LPARENS variable* RPARENS LABEL 'call'
	| number_functions
	| array_functions
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
	;

print_stmt :
	LPARENS DOUBLEQUOTE operand DOUBLEQUOTE RPARENS (PRINTLN|PRINT)
	;
input_stmt:
	LPARENS variable? RPARENS INPUT
	;
case_stmt:
	RARROW case_block+ LARROW LPARENS operand RPARENS 'check'
	;
block :
	RARROW stmt* LARROW
	;
return_block:
	RARROW RETURN (operand|assignment) stmt* LARROW
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
	  LPARENS variable EQUALS variable RPARENS 'merge'				//merge
	| LPARENS variable EQUALS variable RPARENS 'join'				//join
	| LPARENS variable RPARENS 'quantity'							//length
	| variable 'from' LPARENS value COMMA value RPARENS 'extract'	//slice_array
	;

number_operation :
	  LPARENS number_operation RPARENS	// brackets_precedence
    | operand POW<assoc=right> operand 	// toPower
    | operand MUL operand 				// multiply
    | operand DIV operand 				// divide
    | operand MOD operand 				// modulo
    | operand ADD operand 				// add
    | operand SUB operand 				// subtract
    ;

number_functions:
	(INC|DEC) variable //increment or decrement
	;

text_operation :
	(TEXT|variable) (ADD (value|variable))+ 	//concatinate text
	| LPARENS variable RPARENS 'quantity'   	//get length
	| LPARENS (TEXT|variable) RPARENS 'exists'	//contains
	| variable 'from' LPARENS value COMMA value RPARENS 'extract'	//slice string
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

declaration :
	((operand|operations|funcall|input_stmt) EQUALS variable var_type
	|(funcall|LT GT|LT (value ',')* value GT) EQUALS variable var_type array)
	(NULLABLE|CONST)?
   ;

assignment :
	 (operand EQUALS variable
	|operations EQUALS variable
	|funcall EQUALS variable )
	array?
   ;

//LEXER RULES------------------------------------------------------------------------

//Tokens are in order of matching precedence

BOOL: 'true'|'false';
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
NULLABLE: 'nullable';
OR: 'or';
AND: 'and';
CONST: 'constant';
LABEL: [LETTER]+;
TEXT : DOUBLEQUOTE [CHARACTER]+ DOUBLEQUOTE ;
NUMBER : [FLOAT SHORTFLOAT];
SHORTFLOAT : DOT DIGIT+ ;
FLOAT : MINUS? DIGIT DIGIT* DOT DIGIT* ;
LETTER : LOWERCASE|UPPERCASE;
INC : ADD EQUALS;
DEC : SUB EQUALS;

//Comments are thrown out on the lexer channel and not parsed
LINE_COMMENT : '//' .*? '\n' -> skip ;
ML_COMMENT : '/*' .*? '*/' -> skip;
WHITESPACE : [' '\t\r\n] -> skip ;

UNDERSCORE : '_' ;
EQUALS : '==>' ;
BOOLEQUALS : '<==>';
DOUBLEQUOTE : '"' ;
MINUS : '-' ;
DOT : '.' ;
SEMICOLON: ';';
LPARENS : '(' ;
RPARENS : ')' ;
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

COLON : ':' ;
COMMA : ',';


DIGIT : [0-9] ;
//Match any character inc. escaped quotation mark.  [A-Z][a-Z][0-9] would not suffice
CHARACTER: '"' ( '\\"' | . )*? '"' ;



fragment
	UPPERCASE: [A-Z] ;
fragment
	LOWERCASE : [a-z] ;


