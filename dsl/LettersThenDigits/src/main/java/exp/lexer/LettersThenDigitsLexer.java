// $ANTLR 3.4 C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g 2012-05-06 20:51:30

  package exp.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LettersThenDigitsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int LETTER=5;
    public static final int WS=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LettersThenDigitsLexer() {} 
    public LettersThenDigitsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LettersThenDigitsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g"; }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:7:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:11:6: ( ( '0' .. '9' ) )
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:16:3: ( ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' ) )
            // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:17:3: ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:1:8: ( LETTER | DIGIT | WS )
        int alt1=3;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt1=1;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt1=2;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt1=3;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:1:10: LETTER
                {
                mLETTER(); 


                }
                break;
            case 2 :
                // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:1:17: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 3 :
                // C:\\development\\workspace\\LettersThenDigits\\src\\main\\java\\exp\\lexer\\LettersThenDigitsLexer.g:1:23: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}