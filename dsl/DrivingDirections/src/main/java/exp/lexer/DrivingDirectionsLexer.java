// $ANTLR 3.4 C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g 2012-05-06 21:03:59

  package exp.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DrivingDirectionsLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ARRIVE=4;
    public static final int AT=5;
    public static final int DBL_QUOTE=6;
    public static final int DIGIT=7;
    public static final int DOT=8;
    public static final int EXIT=9;
    public static final int IN=10;
    public static final int LEFT=11;
    public static final int LOCATION=12;
    public static final int MILES=13;
    public static final int MINUTES=14;
    public static final int NONNEGATIVE_NUMBER=15;
    public static final int ONTO=16;
    public static final int OR=17;
    public static final int QUOTE=18;
    public static final int RIGHT=19;
    public static final int SLIGHT=20;
    public static final int TOLLROAD=21;
    public static final int TURN=22;
    public static final int U_TURN=23;
    public static final int WS=24;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DrivingDirectionsLexer() {} 
    public DrivingDirectionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DrivingDirectionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g"; }

    // $ANTLR start "TURN"
    public final void mTURN() throws RecognitionException {
        try {
            int _type = TURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:8:3: ( 'turn' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:9:3: 'turn'
            {
            match("turn"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TURN"

    // $ANTLR start "U_TURN"
    public final void mU_TURN() throws RecognitionException {
        try {
            int _type = U_TURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:13:3: ( 'U-turn' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:14:3: 'U-turn'
            {
            match("U-turn"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U_TURN"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:18:3: ( 'left' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:19:3: 'left'
            {
            match("left"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:23:3: ( 'right' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:24:3: 'right'
            {
            match("right"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "SLIGHT"
    public final void mSLIGHT() throws RecognitionException {
        try {
            int _type = SLIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:28:3: ( 'slight' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:29:3: 'slight'
            {
            match("slight"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLIGHT"

    // $ANTLR start "ONTO"
    public final void mONTO() throws RecognitionException {
        try {
            int _type = ONTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:33:3: ( 'onto' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:34:3: 'onto'
            {
            match("onto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ONTO"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:38:3: ( 'in' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:39:3: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "MILES"
    public final void mMILES() throws RecognitionException {
        try {
            int _type = MILES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:43:3: ( 'miles' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:44:3: 'miles'
            {
            match("miles"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MILES"

    // $ANTLR start "MINUTES"
    public final void mMINUTES() throws RecognitionException {
        try {
            int _type = MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:48:3: ( 'minutes' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:49:3: 'minutes'
            {
            match("minutes"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUTES"

    // $ANTLR start "TOLLROAD"
    public final void mTOLLROAD() throws RecognitionException {
        try {
            int _type = TOLLROAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:53:3: ( 'tollroad' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:54:3: 'tollroad'
            {
            match("tollroad"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TOLLROAD"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:58:3: ( 'exit' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:59:3: 'exit'
            {
            match("exit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "ARRIVE"
    public final void mARRIVE() throws RecognitionException {
        try {
            int _type = ARRIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:63:3: ( 'arrive' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:64:3: 'arrive'
            {
            match("arrive"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRIVE"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:68:3: ( 'at' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:69:3: 'at'
            {
            match("at"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:73:3: ( 'or' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:74:3: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "DBL_QUOTE"
    public final void mDBL_QUOTE() throws RecognitionException {
        try {
            int _type = DBL_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:78:3: ( '\"' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:79:3: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DBL_QUOTE"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:83:3: ( '\\'' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:84:3: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "LOCATION"
    public final void mLOCATION() throws RecognitionException {
        try {
            int _type = LOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:91:3: ( DBL_QUOTE (~ DBL_QUOTE )* DBL_QUOTE | QUOTE (~ QUOTE )* QUOTE )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:92:3: DBL_QUOTE (~ DBL_QUOTE )* DBL_QUOTE
                    {
                    mDBL_QUOTE(); 


                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:92:13: (~ DBL_QUOTE )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    mDBL_QUOTE(); 


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:93:3: QUOTE (~ QUOTE )* QUOTE
                    {
                    mQUOTE(); 


                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:93:9: (~ QUOTE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    mQUOTE(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;

                setText(getText().substring(1, getText().length() - 1));
              
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOCATION"

    // $ANTLR start "NONNEGATIVE_NUMBER"
    public final void mNONNEGATIVE_NUMBER() throws RecognitionException {
        try {
            int _type = NONNEGATIVE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:97:3: ( ( ( DIGIT )+ ( DOT ( DIGIT )+ )? | DOT ( DIGIT )+ ) )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:3: ( ( DIGIT )+ ( DOT ( DIGIT )+ )? | DOT ( DIGIT )+ )
            {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:3: ( ( DIGIT )+ ( DOT ( DIGIT )+ )? | DOT ( DIGIT )+ )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:4: ( DIGIT )+ ( DOT ( DIGIT )+ )?
                    {
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:4: ( DIGIT )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:
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
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:11: ( DOT ( DIGIT )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:12: DOT ( DIGIT )+
                            {
                            mDOT(); 


                            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:16: ( DIGIT )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:
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
                            	    break;

                            	default :
                            	    if ( cnt5 >= 1 ) break loop5;
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:27: DOT ( DIGIT )+
                    {
                    mDOT(); 


                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:98:31: ( DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:
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
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NONNEGATIVE_NUMBER"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:102:3: ( '.' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:103:3: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:107:3: ( ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' ) )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:108:3: ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' )
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

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:112:3: ( '0' .. '9' )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:8: ( TURN | U_TURN | LEFT | RIGHT | SLIGHT | ONTO | IN | MILES | MINUTES | TOLLROAD | EXIT | ARRIVE | AT | OR | DBL_QUOTE | QUOTE | LOCATION | NONNEGATIVE_NUMBER | DOT | WS )
        int alt9=20;
        switch ( input.LA(1) ) {
        case 't':
            {
            int LA9_1 = input.LA(2);

            if ( (LA9_1=='u') ) {
                alt9=1;
            }
            else if ( (LA9_1=='o') ) {
                alt9=10;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 1, input);

                throw nvae;

            }
            }
            break;
        case 'U':
            {
            alt9=2;
            }
            break;
        case 'l':
            {
            alt9=3;
            }
            break;
        case 'r':
            {
            alt9=4;
            }
            break;
        case 's':
            {
            alt9=5;
            }
            break;
        case 'o':
            {
            int LA9_6 = input.LA(2);

            if ( (LA9_6=='n') ) {
                alt9=6;
            }
            else if ( (LA9_6=='r') ) {
                alt9=14;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 6, input);

                throw nvae;

            }
            }
            break;
        case 'i':
            {
            alt9=7;
            }
            break;
        case 'm':
            {
            int LA9_8 = input.LA(2);

            if ( (LA9_8=='i') ) {
                int LA9_20 = input.LA(3);

                if ( (LA9_20=='l') ) {
                    alt9=8;
                }
                else if ( (LA9_20=='n') ) {
                    alt9=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 20, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 8, input);

                throw nvae;

            }
            }
            break;
        case 'e':
            {
            alt9=11;
            }
            break;
        case 'a':
            {
            int LA9_10 = input.LA(2);

            if ( (LA9_10=='r') ) {
                alt9=12;
            }
            else if ( (LA9_10=='t') ) {
                alt9=13;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 10, input);

                throw nvae;

            }
            }
            break;
        case '\"':
            {
            int LA9_11 = input.LA(2);

            if ( ((LA9_11 >= '\u0000' && LA9_11 <= '\uFFFF')) ) {
                alt9=17;
            }
            else {
                alt9=15;
            }
            }
            break;
        case '\'':
            {
            int LA9_12 = input.LA(2);

            if ( ((LA9_12 >= '\u0000' && LA9_12 <= '\uFFFF')) ) {
                alt9=17;
            }
            else {
                alt9=16;
            }
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
            alt9=18;
            }
            break;
        case '.':
            {
            int LA9_14 = input.LA(2);

            if ( ((LA9_14 >= '0' && LA9_14 <= '9')) ) {
                alt9=18;
            }
            else {
                alt9=19;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt9=20;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 9, 0, input);

            throw nvae;

        }

        switch (alt9) {
            case 1 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:10: TURN
                {
                mTURN(); 


                }
                break;
            case 2 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:15: U_TURN
                {
                mU_TURN(); 


                }
                break;
            case 3 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:22: LEFT
                {
                mLEFT(); 


                }
                break;
            case 4 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:27: RIGHT
                {
                mRIGHT(); 


                }
                break;
            case 5 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:33: SLIGHT
                {
                mSLIGHT(); 


                }
                break;
            case 6 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:40: ONTO
                {
                mONTO(); 


                }
                break;
            case 7 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:45: IN
                {
                mIN(); 


                }
                break;
            case 8 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:48: MILES
                {
                mMILES(); 


                }
                break;
            case 9 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:54: MINUTES
                {
                mMINUTES(); 


                }
                break;
            case 10 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:62: TOLLROAD
                {
                mTOLLROAD(); 


                }
                break;
            case 11 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:71: EXIT
                {
                mEXIT(); 


                }
                break;
            case 12 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:76: ARRIVE
                {
                mARRIVE(); 


                }
                break;
            case 13 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:83: AT
                {
                mAT(); 


                }
                break;
            case 14 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:86: OR
                {
                mOR(); 


                }
                break;
            case 15 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:89: DBL_QUOTE
                {
                mDBL_QUOTE(); 


                }
                break;
            case 16 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:99: QUOTE
                {
                mQUOTE(); 


                }
                break;
            case 17 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:105: LOCATION
                {
                mLOCATION(); 


                }
                break;
            case 18 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:114: NONNEGATIVE_NUMBER
                {
                mNONNEGATIVE_NUMBER(); 


                }
                break;
            case 19 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:133: DOT
                {
                mDOT(); 


                }
                break;
            case 20 :
                // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\lexer\\DrivingDirectionsLexer.g:1:137: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}