// $ANTLR 3.4 C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g 2012-05-06 12:53:11

  package exp.parser.annotated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LettersThenDigitsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "LETTER", "WS"
    };

    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int LETTER=5;
    public static final int WS=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LettersThenDigitsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LettersThenDigitsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LettersThenDigitsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g"; }


    public static class start_return extends ParserRuleReturnScope {
        public int numLetters;
        public int numDigits;
    };


    // $ANTLR start "start"
    // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:11:1: start[String customArg] returns [int numLetters, int numDigits] : ( LETTER )+ ( DIGIT )* ;
    public final LettersThenDigitsParser.start_return start(String customArg) throws RecognitionException {
        LettersThenDigitsParser.start_return retval = new LettersThenDigitsParser.start_return();
        retval.start = input.LT(1);


        Token LETTER1=null;
        Token DIGIT2=null;


                System.out.println("In init with custom argument: " + customArg);
            
        try {
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:18:5: ( ( LETTER )+ ( DIGIT )* )
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:19:5: ( LETTER )+ ( DIGIT )*
            {

                    System.out.println("Before rule match");
                

            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:22:5: ( LETTER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:22:6: LETTER
            	    {
            	    LETTER1=(Token)match(input,LETTER,FOLLOW_LETTER_in_start70); 


            	            System.out.println("Matching Letter: " + (LETTER1!=null?LETTER1.getText():null)); 
            	            retval.numLetters++;
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:28:5: ( DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIGIT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\annotated\\LettersThenDigitsParser.g:28:6: DIGIT
            	    {
            	    DIGIT2=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_start93); 


            	            System.out.println("Matching Digit: " + (DIGIT2!=null?DIGIT2.getText():null));
            	            retval.numDigits++;
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



                    System.out.println("After rule match");
                

            }

            retval.stop = input.LT(-1);



                    System.out.println("In after");
                
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_start70 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_DIGIT_in_start93 = new BitSet(new long[]{0x0000000000000012L});

}