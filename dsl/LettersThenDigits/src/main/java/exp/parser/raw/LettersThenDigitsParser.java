// $ANTLR 3.4 C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g 2012-05-06 12:53:10

  package exp.parser.raw;


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
    public String getGrammarFileName() { return "C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g"; }



    // $ANTLR start "start"
    // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:11:1: start : ( LETTER )+ ( DIGIT )* ;
    public final void start() throws RecognitionException {
        try {
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:12:5: ( ( LETTER )+ ( DIGIT )* )
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:13:5: ( LETTER )+ ( DIGIT )*
            {
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:13:5: ( LETTER )+
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
            	    // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:13:5: LETTER
            	    {
            	    match(input,LETTER,FOLLOW_LETTER_in_start40); 

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


            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:13:13: ( DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIGIT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\parser\\raw\\LettersThenDigitsParser.g:13:13: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_start43); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_start40 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_DIGIT_in_start43 = new BitSet(new long[]{0x0000000000000012L});

}