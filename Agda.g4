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
    ;

datatypeDecl: 'data' name ':' expr 'where' constructorList;
constructorList: constructorDecl*;
constructorDecl: name ':' expr;

functionDef: name ':' expr '=' expr;

recordDecl: 'record' name ':' expr 'where' recordBody;
recordBody: 'field' fieldDecl* | 'constructor' name 'field' fieldDecl*;
fieldDecl: name ':' expr;

moduleDecl: 'module' name ':' expr 'where' prog;


postulateDecl: 'postulate' (name ':' expr)+;

abstractDecl: 'abstract' prog;

openDecl: 'open' name openSpec?;

importDecl: 'open' 'import' name openSpec? ;

openSpec: 'public'?
          'using' '(' nameList ')'
        | 'hiding' '(' nameList ')'
        | 'renaming' '(' renamingList ')';

nameList: name (',' name)* ;

renamingList: renaming (',' renaming)* ;
renaming: name 'to' name;

pragmaDecl: 'pragma' PRAGMA_KEYWORD;

optionDecl: 'option' OPTION_KEYWORD;

expr
    : name                                        // variable
    | 'λ' name '->' expr                          // lambda abstraction
    | '(' expr ')'                                // parenthesized expression
    | expr expr                                   // function application
    | '(' name ':' expr ')' '->' expr             // dependent function type
    | sort                                        // sort
    ;

sort: 'Set' | 'Set' ('ω' | INT);
name: ID ('.' ID)*;

// Lexer rules
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;

PRAGMA_KEYWORD: '#' [a-zA-Z0-9_]+;
OPTION_KEYWORD: [a-zA-Z0-9_]+;

WS: [ \t\r\n]+ -> skip;
