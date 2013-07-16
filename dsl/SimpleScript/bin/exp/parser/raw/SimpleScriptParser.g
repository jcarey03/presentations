parser grammar SimpleScriptParser;

options {
  tokenVocab = SimpleScriptLexer;
  output = AST;
}

@header {
  package exp.parser.raw;
}

script
  :
  declaration* stmt*
  ;

declaration
  :
  DECLARE ID (COMMA ID)* (EQUALS NUMBER)? 
  ;

stmt
  :
  assignmentStmt |
  displayStmt |
  expressionStmt 
  ;

assignmentStmt
  :
  ID EQUALS arithExpression 
  ;

displayStmt
  :
  DISPLAY arithExpression
  ;

expressionStmt
  :
  arithExpression
  ;

arithExpression
  : 
  multExpression ((PLUS | MINUS) multExpression)*
  ;

multExpression
  :
  expExpression ((MULTIPLY | DIVIDE) expExpression)*
  ;
  
expExpression
  :
  atom (EXP atom)*
  ;

atom        
  : 
  ID |
  NUMBER |
  L_PAREN arithExpression R_PAREN
  ;  