tree grammar SimpleScriptWalker;

options { 
  tokenVocab=SimpleScriptLexer;
  ASTLabelType=CommonTree;
}

@header {
  package exp.walker;
  
  import java.util.Map;
  import exp.model.ProgramState;
}

@members {
  private ProgramState programState;
}

script[Map<String, Double> constants] returns [ double result ]
  @init {
    programState = new ProgramState(constants);
  }
  @after {
    $result = programState.getEvaluationResult();
  }
  :
  declaration* stmt*
  ;

declaration
  :
  ^(DECLARE ID (EQUALS NUMBER)?)
  {
    double value = 0.0;
    if($NUMBER.text != null) {
      value = Double.parseDouble($NUMBER.text);
    }
    programState.declareVariable($ID.text, value);
  }
  ;

stmt
  :
  assignmentStmt |
  displayStmt |
  expressionStmt 
  ;

assignmentStmt
  :
  ^(EQUALS ID arithExpression)
  {
    programState.updateVariable($ID.text, $arithExpression.result);
    programState.setEvaluationResult($arithExpression.result);
  }
  ;

displayStmt
  :
  ^(DISPLAY arithExpression)
  {
    double result = $arithExpression.result;
    programState.setEvaluationResult(result);
    System.out.println(String.format("Intermediate Result:\n  \%f\n", result));
  }
  ;
  
expressionStmt
  :
  arithExpression
  {
    programState.setEvaluationResult($arithExpression.result);
  }
  ;
  
arithExpression returns [double result]
  :
  ^(PLUS op1 = arithExpression op2 = arithExpression)       { $result = $op1.result + $op2.result; } |
  ^(MINUS op1 = arithExpression op2 = arithExpression)      { $result = $op1.result - $op2.result; } |
  ^(MULTIPLY op1 = arithExpression op2 = arithExpression)   { $result = $op1.result * $op2.result; } |
  ^(DIVIDE op1 = arithExpression op2 = arithExpression)     { $result = $op1.result / $op2.result; } |
  ^(EXP op1 = arithExpression op2 = arithExpression)        { $result = Math.pow($op1.result, $op2.result); } |
  NUMBER                                                    { $result = Double.parseDouble($NUMBER.text); } |
  ID                                                        { $result = programState.getValue($ID.text); }
  ;
