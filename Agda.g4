grammar Agda;

// Parser rules
prog: declaration* EOF;

declaration
    : datatypeDecl
    | functionDef
    | recordDecl
    | moduleDecl
    | postulateDecl
    | abstractDecl
    | openDecl
    | importDecl
    | pragmaDecl
    | optionDecl
    | fixityDecl
    | syntaxDecl
    | variableDecl
    | instanceDecl
    ;

functionDef: name ':' expr '=' expr ( '|' name (pattern | namedArg)* '=' expr whereBlock?)* withClause?;

pattern
    : name                        // constructor or variable
    | '(' pattern ')'             // parenthesized pattern
    | '_'                         // wildcard pattern
    | pattern pattern             // nested pattern
    | '{' pattern '}'             // implicit argument
    | '{{' pattern '}}'           // instance argument
    | '.' pattern                 // forced argument
    ;

namedArg: '{' name '=' pattern '}' | '{{' name '=' pattern '}}' | '.' name '=' pattern;

datatypeDecl: 'data' name ':' expr 'where' constructorList;
constructorList: constructorDecl*;
constructorDecl: name ':' expr;

recordDecl: 'record' name ':' expr 'where' recordBody;
recordBody: inductivity? ('constructor' name)? ('field' fieldDecl*)?;
fieldDecl: name ':' expr;
inductivity : 'inductive' | 'coinductive';

moduleDecl: 'module' name ':' expr 'where' prog;


postulateDecl: 'postulate' (name ':' expr)+;

abstractDecl: 'abstract' prog;

instanceDecl: visibility? 'instance' prog;

openDecl: 'open' name openSpec?;

importDecl: 'open' 'import' name openSpec? ;

openSpec: 'public'?
          'using' '(' nameList ')'
        | 'hiding' '(' nameList ')'
        | 'renaming' '(' renamingList ')';

nameList: name (';' name)* ;

renamingList: renaming (';' renaming)* ;
renaming: name 'to' name;

pragmaDecl: '{-#' 'pragma' pragmaName pragmaArgs* '#-}';
pragmaName: ID;
pragmaArgs: ID | STRING | NUMBER;

optionDecl: '{-#' 'OPTIONS' optionArgs* '#-}';
optionArgs: ID | STRING | NUMBER;

fixityDecl: fixityKeyword fixityLevel? (name | '(' name ')')+;
fixityKeyword: 'infix' | 'infixl' | 'infixr';
fixityLevel: INT;

syntaxDecl: 'syntax' syntaxPattern '=' name;
syntaxPattern: syntaxAtom+;
syntaxAtom: '_' | name | '(' syntaxPattern ')';

variableDecl: visibility? 'variable'? nameList;
visibility: 'public' | 'private';

expr
    : name                                        // variable
    | expr expr                                   // function application
    | '(' expr ')'                                // parenthesized expression
    | '{' expr '}'                                // implicit argument
    | '{{' expr '}}'                              // instance argument
    | LAMBDA name TO expr                         // lambda abstraction
    | LAMBDA '(' name ':' expr ')' TO expr         // lambda abstraction
    | LAMBDA '{' name ':' expr '}' TO expr        // lambda abstraction with implicit argument
    | LAMBDA '{{' name ':' expr '}}' TO expr      // lambda abstraction with instance argument
    | '(' name ':' expr ')' TO expr               // dependent function type
    | '{' name ':' expr '}' TO expr             // dependent function type with implicit argument
    | '{{' name ':' expr '}}' TO expr           // dependent function type with instance argument
    | 'let' letBinding+ 'in' expr                 // let-expression
    | expr whereBlock                     // where-block
    | 'record' '{' (name '=' expr (';' name '=' expr)*)? '}'
    ;

LAMBDA: 'λ' | '\\' ;
TO : '→' | '->';

letBinding: name ':' expr '=' expr;
whereBlock: 'where' declaration+;
withClause: 'with' expr ('|' name+ ':' expr '=' expr whereBlock?)*;

name: ID ('.' ID)*;

// Lexer rules
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
STRING: '"' (~["\r\n])* '"';
NUMBER: '-'? INT;

LINE_COMMENT: '--' ~[\r\n]* '\r'? '\n' -> skip;
BLOCK_COMMENT: '{-' (BLOCK_COMMENT | ~[-}])* '-}' -> skip;

WS: [ \t\r\n]+ -> skip;
