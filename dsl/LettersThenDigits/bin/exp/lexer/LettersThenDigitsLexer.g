lexer grammar LettersThenDigitsLexer;

@header {
  package exp.lexer;
}

LETTER:
  ('a'..'z'|'A'..'Z')
  ;
  
DIGIT:
  ('0'..'9')
  ;     
                
WS          
  :  
  (' '|'\r'|'\t'|'\f'|'\n') { $channel=HIDDEN; }
  ;
  