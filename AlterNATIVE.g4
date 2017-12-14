
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
	 ('FINISH' stmt* 'START') (functionDef|declaration)*
	;

functionDef:
	(block|returnBlock) LPARENS (variable varType)? (COMMA variable varType)* RPARENS LABEL (varType array?|VOIDTYPE)
	;
funCall:
	LPARENS variable* RPARENS LABEL 'call'
	| numberFunctions
	| arrayFunctions
	;

stmt :
	  printStmt
	| funCall
	| ifStmt
	| caseStmt
	| loop
	| inputStmt
	| assignment
	| declaration
	;

printStmt :
	LPARENS DOUBLEQUOTE? operand DOUBLEQUOTE? RPARENS (PRINTLN|PRINT)
	;
inputStmt:
	LPARENS variable? RPARENS INPUT
	;
caseStmt:
	RARROW caseBlock+ LARROW LPARENS operand RPARENS 'check'
	;
block :
	RARROW stmt* LARROW
	;
returnBlock:
	RARROW RETURN (operand|assignment) stmt* LARROW
	;
caseBlock:
	'terminate' EXCLAIM stmt* COLON caseCondition
	;
caseCondition:
	COLON
	(('is' boolOperators operand)
	|'by default')
	;

ifStmt :
	(block 'otherwise')? (block LPARENS boolStmt RPARENS 'or when')* block LPARENS boolStmt RPARENS 'when'
	;

boolStmt:
	 LPARENS boolStmt RPARENS
	|((boolOperations|funCall) logicConnector)* (boolOperations|funCall)
	;
	
logicConnector:
	AND
	|OR
	;

operations:
	numberOperations
	|textOperations
	|boolOperations	
	;
	
arrayFunctions:
	  LPARENS variable EQUALS variable RPARENS 'merge'				//merge
	| LPARENS variable EQUALS variable RPARENS 'join'				//join
	| LPARENS variable RPARENS 'quantity'							//length
	| variable 'from' LPARENS value COMMA value RPARENS 'extract'	//slice_array
	;

numberOperations :
	  LPARENS numberOperations RPARENS	// brackets_precedence
    | operand POW<assoc=right> operand 	// toPower
    | operand MUL operand 				// multiply
    | operand DIV operand 				// divide
    | operand MOD operand 				// modulo
    | operand ADD operand 				// add
    | operand SUB operand 				// subtract
    ;

numberFunctions:
	(INC|DEC) variable 					//increment or decrement
	|(DIGIT+ COMMA variable)'precision'	//Set decimal places (round)
	;

textOperations :
	(TEXT|variable) (ADD (value|variable))+ 	//concatinate text
	| LPARENS variable RPARENS 'quantity'   	//get length
	| LPARENS (TEXT|variable) RPARENS 'exists'	//contains
	| variable 'from' LPARENS value COMMA value RPARENS 'extract'	//slice string
	;

boolOperations :
	operand boolOperators operand
	;

boolOperators:
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
	(LPARENS ((numberOperations EQUALS variable)|numberFunctions)
		SEMICOLON boolOperations
		SEMICOLON declaration
		RPARENS
	)
	'for'
	;
	
whileloop:
	block (LPARENS boolStmt RPARENS) WHILE
	;
	
dountil:
	RARROW boolStmt 'until' stmt* LARROW 'execute'
	;
	
operand :
	value
	|variable array?
	|NULL
	|textOperations
   ;
   
value :
	NUMBER
   | TEXT
   | BOOL
   ;

varType:
	(FLOATTYPE
	|TEXTTYPE
	|BOOLTYPE
	)
	ARRAYTYPE?
	;

array:
	LT (DIGIT+|variable|funCall|numberOperations) GT
	;

variable :
	UNDERSCORE? LETTER (LETTER | DIGIT | UNDERSCORE)*
   ;

declaration :
	((operand|operations|funCall|inputStmt) EQUALS variable varType
	|(funCall|ARRAYTYPE|LT (value ',')* value GT) EQUALS variable varType array)
	(NULLABLE|CONST)?
   ;

assignment :
	 (operand EQUALS variable
	|operations EQUALS variable
	|funCall EQUALS variable )
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
ARRAYTYPE: LT GT;
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
fragment
	DOT : '.' ;
fragment
	MINUS : '-' ;


