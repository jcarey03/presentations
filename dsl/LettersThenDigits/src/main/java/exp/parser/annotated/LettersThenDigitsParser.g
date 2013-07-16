parser grammar LettersThenDigitsParser;

options {
  tokenVocab = LettersThenDigitsLexer;
}

@header {
  package exp.parser.annotated;
}

start[String customArg] returns [int numLetters, int numDigits]
    @init {
        System.out.println("In init with custom argument: " + $customArg);
    }
    @after {
        System.out.println("In after");
    }
    :
    {
        System.out.println("Before rule match");
    }
    (LETTER 
    {
        System.out.println("Matching Letter: " + $LETTER.text); 
        $numLetters++;
    } 
    )+ 
    (DIGIT
    {
        System.out.println("Matching Digit: " + $DIGIT.text);
        $numDigits++;
    }
    )*
    {
        System.out.println("After rule match");
    }
    ;  