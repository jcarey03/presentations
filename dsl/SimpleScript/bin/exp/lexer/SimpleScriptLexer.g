lexer grammar SimpleScriptLexer;

@header {
  package exp.lexer;
}

DECLARE
  :
  'declare' | 'decl'
  ;

COMMA
  :
  ','
  ;

EQUALS
  :
  '='
  ;
             
PLUS
  :
  '+'
  ;
  
MINUS
  :
  '-'
  ;  
  
MULTIPLY
  :
  '*'
  ;    
    
DIVIDE
  :
  '/'
  ;
            
EXP
  :
  '**'
  ;
            
L_PAREN
  :
  '('
  ;
            
R_PAREN
  :
  ')'
  ;                                  

DISPLAY
  :
  'display' | 'disp'
  ;

ML_COMMENT
  :  
  '/*' (options {greedy = false;} : .)* '*/' { $channel=HIDDEN; }
  ;

SINGLE_COMMENT
  : 
  '//' ~('\r' | '\n')* ('\r'? '\n')* { $channel=HIDDEN; }
  ;
  
ID          
  :   
  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
  ;
    
NUMBER
  :
  MINUS? (DIGIT+ (DOT DIGIT+)? | DOT DIGIT+)
  ;

DOT
  :
  '.'
  ;     
                
WS          
  :  
  (' '|'\r'|'\t'|'\f'|'\n') { $channel=HIDDEN; }
  ;
  
fragment DIGIT
  :
  '0'..'9'
  ;