// $ANTLR 3.4 C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g 2012-05-06 12:53:17

  package exp.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleScriptLexer extends Lexer {
    public static final int EOF=-1;
    public static final int COMMA=4;
    public static final int DECLARE=5;
    public static final int DIGIT=6;
    public static final int DISPLAY=7;
    public static final int DIVIDE=8;
    public static final int DOT=9;
    public static final int EQUALS=10;
    public static final int EXP=11;
    public static final int ID=12;
    public static final int L_PAREN=13;
    public static final int MINUS=14;
    public static final int ML_COMMENT=15;
    public static final int MULTIPLY=16;
    public static final int NUMBER=17;
    public static final int PLUS=18;
    public static final int R_PAREN=19;
    public static final int SINGLE_COMMENT=20;
    public static final int WS=21;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SimpleScriptLexer() {} 
    public SimpleScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g"; }

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:8:3: ( 'declare' | 'decl' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='d') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='e') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='c') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='l') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='a') ) {
                                alt1=1;
                            }
                            else {
                                alt1=2;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:9:3: 'declare'
                    {
                    match("declare"); 



                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:9:15: 'decl'
                    {
                    match("decl"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:13:3: ( ',' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:14:3: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:18:3: ( '=' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:19:3: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:23:3: ( '+' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:24:3: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:28:3: ( '-' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:29:3: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:33:3: ( '*' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:34:3: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:38:3: ( '/' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:39:3: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            int _type = EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:43:3: ( '**' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:44:3: '**'
            {
            match("**"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "L_PAREN"
    public final void mL_PAREN() throws RecognitionException {
        try {
            int _type = L_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:48:3: ( '(' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:49:3: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L_PAREN"

    // $ANTLR start "R_PAREN"
    public final void mR_PAREN() throws RecognitionException {
        try {
            int _type = R_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:53:3: ( ')' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:54:3: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R_PAREN"

    // $ANTLR start "DISPLAY"
    public final void mDISPLAY() throws RecognitionException {
        try {
            int _type = DISPLAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:58:3: ( 'display' | 'disp' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='d') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='i') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='s') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='p') ) {
                            int LA2_4 = input.LA(5);

                            if ( (LA2_4=='l') ) {
                                alt2=1;
                            }
                            else {
                                alt2=2;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:59:3: 'display'
                    {
                    match("display"); 



                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:59:15: 'disp'
                    {
                    match("disp"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISPLAY"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:63:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:64:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:64:8: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:64:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match("*/"); 



             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SINGLE_COMMENT"
    public final void mSINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:68:3: ( '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:69:3: '//' (~ ( '\\r' | '\\n' ) )* ( ( '\\r' )? '\\n' )*
            {
            match("//"); 



            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:69:8: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop4;
                }
            } while (true);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:69:24: ( ( '\\r' )? '\\n' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:69:25: ( '\\r' )? '\\n'
            	    {
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:69:25: ( '\\r' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\r') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:69:25: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }


            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_COMMENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:73:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:74:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:74:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:78:3: ( ( MINUS )? ( ( DIGIT )+ ( DOT ( DIGIT )+ )? | DOT ( DIGIT )+ ) )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:3: ( MINUS )? ( ( DIGIT )+ ( DOT ( DIGIT )+ )? | DOT ( DIGIT )+ )
            {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:3: ( MINUS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
                    {
                    if ( input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:10: ( ( DIGIT )+ ( DOT ( DIGIT )+ )? | DOT ( DIGIT )+ )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='.') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:11: ( DIGIT )+ ( DOT ( DIGIT )+ )?
                    {
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:11: ( DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:18: ( DOT ( DIGIT )+ )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='.') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:19: DOT ( DIGIT )+
                            {
                            mDOT(); 


                            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:23: ( DIGIT )+
                            int cnt10=0;
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
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
                            	    if ( cnt10 >= 1 ) break loop10;
                                        EarlyExitException eee =
                                            new EarlyExitException(10, input);
                                        throw eee;
                                }
                                cnt10++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:34: DOT ( DIGIT )+
                    {
                    mDOT(); 


                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:79:38: ( DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
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
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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
    // $ANTLR end "NUMBER"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:83:3: ( '.' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:84:3: '.'
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
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:88:3: ( ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' ) )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:89:3: ( ' ' | '\\r' | '\\t' | '\\f' | '\\n' )
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
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:93:3: ( '0' .. '9' )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:
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
        // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:8: ( DECLARE | COMMA | EQUALS | PLUS | MINUS | MULTIPLY | DIVIDE | EXP | L_PAREN | R_PAREN | DISPLAY | ML_COMMENT | SINGLE_COMMENT | ID | NUMBER | DOT | WS )
        int alt14=17;
        switch ( input.LA(1) ) {
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA14_14 = input.LA(3);

                if ( (LA14_14=='c') ) {
                    int LA14_23 = input.LA(4);

                    if ( (LA14_23=='l') ) {
                        switch ( input.LA(5) ) {
                        case 'a':
                            {
                            int LA14_27 = input.LA(6);

                            if ( (LA14_27=='r') ) {
                                int LA14_31 = input.LA(7);

                                if ( (LA14_31=='e') ) {
                                    int LA14_33 = input.LA(8);

                                    if ( ((LA14_33 >= '0' && LA14_33 <= '9')||(LA14_33 >= 'A' && LA14_33 <= 'Z')||LA14_33=='_'||(LA14_33 >= 'a' && LA14_33 <= 'z')) ) {
                                        alt14=14;
                                    }
                                    else {
                                        alt14=1;
                                    }
                                }
                                else {
                                    alt14=14;
                                }
                            }
                            else {
                                alt14=14;
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
                        case '_':
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
                            alt14=14;
                            }
                            break;
                        default:
                            alt14=1;
                        }

                    }
                    else {
                        alt14=14;
                    }
                }
                else {
                    alt14=14;
                }
                }
                break;
            case 'i':
                {
                int LA14_15 = input.LA(3);

                if ( (LA14_15=='s') ) {
                    int LA14_24 = input.LA(4);

                    if ( (LA14_24=='p') ) {
                        switch ( input.LA(5) ) {
                        case 'l':
                            {
                            int LA14_29 = input.LA(6);

                            if ( (LA14_29=='a') ) {
                                int LA14_32 = input.LA(7);

                                if ( (LA14_32=='y') ) {
                                    int LA14_34 = input.LA(8);

                                    if ( ((LA14_34 >= '0' && LA14_34 <= '9')||(LA14_34 >= 'A' && LA14_34 <= 'Z')||LA14_34=='_'||(LA14_34 >= 'a' && LA14_34 <= 'z')) ) {
                                        alt14=14;
                                    }
                                    else {
                                        alt14=11;
                                    }
                                }
                                else {
                                    alt14=14;
                                }
                            }
                            else {
                                alt14=14;
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
                        case '_':
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
                            alt14=14;
                            }
                            break;
                        default:
                            alt14=11;
                        }

                    }
                    else {
                        alt14=14;
                    }
                }
                else {
                    alt14=14;
                }
                }
                break;
            default:
                alt14=14;
            }

            }
            break;
        case ',':
            {
            alt14=2;
            }
            break;
        case '=':
            {
            alt14=3;
            }
            break;
        case '+':
            {
            alt14=4;
            }
            break;
        case '-':
            {
            int LA14_5 = input.LA(2);

            if ( (LA14_5=='.'||(LA14_5 >= '0' && LA14_5 <= '9')) ) {
                alt14=15;
            }
            else {
                alt14=5;
            }
            }
            break;
        case '*':
            {
            int LA14_6 = input.LA(2);

            if ( (LA14_6=='*') ) {
                alt14=8;
            }
            else {
                alt14=6;
            }
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=12;
                }
                break;
            case '/':
                {
                alt14=13;
                }
                break;
            default:
                alt14=7;
            }

            }
            break;
        case '(':
            {
            alt14=9;
            }
            break;
        case ')':
            {
            alt14=10;
            }
            break;
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
        case '_':
        case 'a':
        case 'b':
        case 'c':
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
            alt14=14;
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
            alt14=15;
            }
            break;
        case '.':
            {
            int LA14_12 = input.LA(2);

            if ( ((LA14_12 >= '0' && LA14_12 <= '9')) ) {
                alt14=15;
            }
            else {
                alt14=16;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt14=17;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 14, 0, input);

            throw nvae;

        }

        switch (alt14) {
            case 1 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:10: DECLARE
                {
                mDECLARE(); 


                }
                break;
            case 2 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:18: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 3 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:24: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 4 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:31: PLUS
                {
                mPLUS(); 


                }
                break;
            case 5 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:36: MINUS
                {
                mMINUS(); 


                }
                break;
            case 6 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:42: MULTIPLY
                {
                mMULTIPLY(); 


                }
                break;
            case 7 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:51: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 8 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:58: EXP
                {
                mEXP(); 


                }
                break;
            case 9 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:62: L_PAREN
                {
                mL_PAREN(); 


                }
                break;
            case 10 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:70: R_PAREN
                {
                mR_PAREN(); 


                }
                break;
            case 11 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:78: DISPLAY
                {
                mDISPLAY(); 


                }
                break;
            case 12 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:86: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 13 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:97: SINGLE_COMMENT
                {
                mSINGLE_COMMENT(); 


                }
                break;
            case 14 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:112: ID
                {
                mID(); 


                }
                break;
            case 15 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:115: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 16 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:122: DOT
                {
                mDOT(); 


                }
                break;
            case 17 :
                // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\lexer\\SimpleScriptLexer.g:1:126: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}