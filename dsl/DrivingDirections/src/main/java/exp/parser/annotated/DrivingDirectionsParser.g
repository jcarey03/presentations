parser grammar DrivingDirectionsParser;

options {
  tokenVocab = DrivingDirectionsLexer;
}

@header {
  package exp.parser.annotated;
  
  import exp.model.DirectionBuilder;
  import exp.model.DirectionList;
  import exp.model.DirectionBuilderFactory;
  import exp.model.TurnDirection.TurnDirectionBuilder;
  import exp.model.TurnType;
}

@members {
  private DirectionList directionList = new DirectionList();
  private DirectionBuilder currDirectionBuilder;
}

directions returns [DirectionList result]
  @after {
    $result = directionList;
  }
  :
  direction+
  ;

direction
  @after {
    directionList.add(currDirectionBuilder.build());
  }
  :
  turnDirection | 
  exitDirection | 
  arrivalDirection
  ;

turnDirection
  :
  turn ONTO TOLLROAD? LOCATION IN
  { 
    currDirectionBuilder = DirectionBuilderFactory
      .turn($turn.result)
      .onto($LOCATION.text);
    if($TOLLROAD.text != null) {
      ((TurnDirectionBuilder) currDirectionBuilder).tollroad();
    }
  } 
  estimatedDistanceOrTime
  ;

exitDirection
  :
  EXIT AT exit=LOCATION ONTO nextLoc=LOCATION IN 
  { 
    currDirectionBuilder = DirectionBuilderFactory
      .exit($exit.text)
      .onto($nextLoc.text);
  }
  estimatedDistanceOrTime 
  ;

arrivalDirection
  :
  ARRIVE AT LOCATION IN
  {
    currDirectionBuilder = DirectionBuilderFactory
      .arrive($LOCATION.text);
  }
  estimatedDistanceOrTime
  ;
  
turn returns [TurnType result]
  :
  U_TURN 
  {
    $result = TurnType.U_TURN;
  }
  | 
  TURN SLIGHT? leftOrRight=(LEFT | RIGHT) 
  {
    String slightValue = ($SLIGHT.text == null) ? "" : $SLIGHT.text + " ";
    $result = TurnType.valueOfByDisplayLabel(slightValue + $leftOrRight.text);
  }  
  ;
  
estimatedDistanceOrTime
  :
  estimatedDistance OR estimatedTime
  {
    currDirectionBuilder
      .in_miles($estimatedDistance.result)
      .in_minutes($estimatedTime.result);
  }
  ;

estimatedDistance returns[double result]
  :
  NONNEGATIVE_NUMBER MILES
  {
    $result = Double.parseDouble($NONNEGATIVE_NUMBER.text);
  }
  ;

estimatedTime returns[double result]
  :
  NONNEGATIVE_NUMBER MINUTES
  {
    $result = Double.parseDouble($NONNEGATIVE_NUMBER.text);
  }
  ;
