lexer grammar DrivingDirectionsLexer;

@header {
  package exp.lexer;
}

TURN
  :
  'turn'
  ;

U_TURN
  :
  'U-turn'
  ;

LEFT
  :
  'left'
  ;

RIGHT
  :
  'right'
  ;

SLIGHT
  :
  'slight'
  ;

ONTO
  :
  'onto'
  ;

IN
  :
  'in'
  ;

MILES
  :
  'miles'
  ;

MINUTES
  :
  'minutes'
  ;

TOLLROAD
  :
  'tollroad'
  ;

EXIT
  :
  'exit'
  ;

ARRIVE
  :
  'arrive'
  ;

AT
  :
  'at'
  ;

OR
  :
  'or'
  ;

DBL_QUOTE
  :
  '"'
  ;

QUOTE
  :
  '\''
  ;

LOCATION
  @after {
    setText(getText().substring(1, getText().length() - 1));
  }
  : 
  DBL_QUOTE (~DBL_QUOTE)* DBL_QUOTE | 
  QUOTE (~QUOTE)* QUOTE
  ;

NONNEGATIVE_NUMBER
  :
  (DIGIT+ (DOT DIGIT+)? | DOT DIGIT+)
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