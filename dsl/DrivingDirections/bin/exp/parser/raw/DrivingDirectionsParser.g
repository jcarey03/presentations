parser grammar DrivingDirectionsParser;

options {
  tokenVocab = DrivingDirectionsLexer;
}

@header {
  package exp.parser.raw;
}

directions
  :
  direction+
  ;

direction
  :
  turnDirection | 
  exitDirection | 
  arrivalDirection
  ;

turnDirection
  :
  turn ONTO TOLLROAD? LOCATION IN estimatedDistanceOrTime
  ;

exitDirection
  :
  EXIT AT LOCATION ONTO LOCATION IN estimatedDistanceOrTime 
  ;

arrivalDirection
  :
  ARRIVE AT LOCATION IN estimatedDistanceOrTime
  ;
  
turn
  :
  U_TURN 
  | 
  TURN SLIGHT? (LEFT | RIGHT)   
  ;
  
estimatedDistanceOrTime
  :
  estimatedDistance OR estimatedTime
  ;

estimatedDistance
  :
  NONNEGATIVE_NUMBER MILES
  ;

estimatedTime
  :
  NONNEGATIVE_NUMBER MINUTES
  ;
