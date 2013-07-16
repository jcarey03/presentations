// $ANTLR 3.4 C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g 2012-05-06 12:53:07

  package exp.parser.raw;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DrivingDirectionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRIVE", "AT", "DBL_QUOTE", "DIGIT", "DOT", "EXIT", "IN", "LEFT", "LOCATION", "MILES", "MINUTES", "NONNEGATIVE_NUMBER", "ONTO", "OR", "QUOTE", "RIGHT", "SLIGHT", "TOLLROAD", "TURN", "U_TURN", "WS"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DrivingDirectionsParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DrivingDirectionsParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DrivingDirectionsParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g"; }



    // $ANTLR start "directions"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:11:1: directions : ( direction )+ ;
    public final void directions() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:12:3: ( ( direction )+ )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:13:3: ( direction )+
            {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:13:3: ( direction )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ARRIVE||LA1_0==EXIT||(LA1_0 >= TURN && LA1_0 <= U_TURN)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:13:3: direction
            	    {
            	    pushFollow(FOLLOW_direction_in_directions36);
            	    direction();

            	    state._fsp--;


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
    // $ANTLR end "directions"



    // $ANTLR start "direction"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:16:1: direction : ( turnDirection | exitDirection | arrivalDirection );
    public final void direction() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:17:3: ( turnDirection | exitDirection | arrivalDirection )
            int alt2=3;
            switch ( input.LA(1) ) {
            case TURN:
            case U_TURN:
                {
                alt2=1;
                }
                break;
            case EXIT:
                {
                alt2=2;
                }
                break;
            case ARRIVE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:18:3: turnDirection
                    {
                    pushFollow(FOLLOW_turnDirection_in_direction52);
                    turnDirection();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:19:3: exitDirection
                    {
                    pushFollow(FOLLOW_exitDirection_in_direction59);
                    exitDirection();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:20:3: arrivalDirection
                    {
                    pushFollow(FOLLOW_arrivalDirection_in_direction66);
                    arrivalDirection();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "direction"



    // $ANTLR start "turnDirection"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:23:1: turnDirection : turn ONTO ( TOLLROAD )? LOCATION IN estimatedDistanceOrTime ;
    public final void turnDirection() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:24:3: ( turn ONTO ( TOLLROAD )? LOCATION IN estimatedDistanceOrTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:25:3: turn ONTO ( TOLLROAD )? LOCATION IN estimatedDistanceOrTime
            {
            pushFollow(FOLLOW_turn_in_turnDirection81);
            turn();

            state._fsp--;


            match(input,ONTO,FOLLOW_ONTO_in_turnDirection83); 

            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:25:13: ( TOLLROAD )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TOLLROAD) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:25:13: TOLLROAD
                    {
                    match(input,TOLLROAD,FOLLOW_TOLLROAD_in_turnDirection85); 

                    }
                    break;

            }


            match(input,LOCATION,FOLLOW_LOCATION_in_turnDirection88); 

            match(input,IN,FOLLOW_IN_in_turnDirection90); 

            pushFollow(FOLLOW_estimatedDistanceOrTime_in_turnDirection92);
            estimatedDistanceOrTime();

            state._fsp--;


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
    // $ANTLR end "turnDirection"



    // $ANTLR start "exitDirection"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:28:1: exitDirection : EXIT AT LOCATION ONTO LOCATION IN estimatedDistanceOrTime ;
    public final void exitDirection() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:29:3: ( EXIT AT LOCATION ONTO LOCATION IN estimatedDistanceOrTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:30:3: EXIT AT LOCATION ONTO LOCATION IN estimatedDistanceOrTime
            {
            match(input,EXIT,FOLLOW_EXIT_in_exitDirection107); 

            match(input,AT,FOLLOW_AT_in_exitDirection109); 

            match(input,LOCATION,FOLLOW_LOCATION_in_exitDirection111); 

            match(input,ONTO,FOLLOW_ONTO_in_exitDirection113); 

            match(input,LOCATION,FOLLOW_LOCATION_in_exitDirection115); 

            match(input,IN,FOLLOW_IN_in_exitDirection117); 

            pushFollow(FOLLOW_estimatedDistanceOrTime_in_exitDirection119);
            estimatedDistanceOrTime();

            state._fsp--;


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
    // $ANTLR end "exitDirection"



    // $ANTLR start "arrivalDirection"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:33:1: arrivalDirection : ARRIVE AT LOCATION IN estimatedDistanceOrTime ;
    public final void arrivalDirection() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:34:3: ( ARRIVE AT LOCATION IN estimatedDistanceOrTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:35:3: ARRIVE AT LOCATION IN estimatedDistanceOrTime
            {
            match(input,ARRIVE,FOLLOW_ARRIVE_in_arrivalDirection135); 

            match(input,AT,FOLLOW_AT_in_arrivalDirection137); 

            match(input,LOCATION,FOLLOW_LOCATION_in_arrivalDirection139); 

            match(input,IN,FOLLOW_IN_in_arrivalDirection141); 

            pushFollow(FOLLOW_estimatedDistanceOrTime_in_arrivalDirection143);
            estimatedDistanceOrTime();

            state._fsp--;


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
    // $ANTLR end "arrivalDirection"



    // $ANTLR start "turn"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:38:1: turn : ( U_TURN | TURN ( SLIGHT )? ( LEFT | RIGHT ) );
    public final void turn() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:39:3: ( U_TURN | TURN ( SLIGHT )? ( LEFT | RIGHT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==U_TURN) ) {
                alt5=1;
            }
            else if ( (LA5_0==TURN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:40:3: U_TURN
                    {
                    match(input,U_TURN,FOLLOW_U_TURN_in_turn160); 

                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:42:3: TURN ( SLIGHT )? ( LEFT | RIGHT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_turn170); 

                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:42:8: ( SLIGHT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==SLIGHT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:42:8: SLIGHT
                            {
                            match(input,SLIGHT,FOLLOW_SLIGHT_in_turn172); 

                            }
                            break;

                    }


                    if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

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
    // $ANTLR end "turn"



    // $ANTLR start "estimatedDistanceOrTime"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:45:1: estimatedDistanceOrTime : estimatedDistance OR estimatedTime ;
    public final void estimatedDistanceOrTime() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:46:3: ( estimatedDistance OR estimatedTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:47:3: estimatedDistance OR estimatedTime
            {
            pushFollow(FOLLOW_estimatedDistance_in_estimatedDistanceOrTime201);
            estimatedDistance();

            state._fsp--;


            match(input,OR,FOLLOW_OR_in_estimatedDistanceOrTime203); 

            pushFollow(FOLLOW_estimatedTime_in_estimatedDistanceOrTime205);
            estimatedTime();

            state._fsp--;


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
    // $ANTLR end "estimatedDistanceOrTime"



    // $ANTLR start "estimatedDistance"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:50:1: estimatedDistance : NONNEGATIVE_NUMBER MILES ;
    public final void estimatedDistance() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:51:3: ( NONNEGATIVE_NUMBER MILES )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:52:3: NONNEGATIVE_NUMBER MILES
            {
            match(input,NONNEGATIVE_NUMBER,FOLLOW_NONNEGATIVE_NUMBER_in_estimatedDistance220); 

            match(input,MILES,FOLLOW_MILES_in_estimatedDistance222); 

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
    // $ANTLR end "estimatedDistance"



    // $ANTLR start "estimatedTime"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:55:1: estimatedTime : NONNEGATIVE_NUMBER MINUTES ;
    public final void estimatedTime() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:56:3: ( NONNEGATIVE_NUMBER MINUTES )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\raw\\DrivingDirectionsParser.g:57:3: NONNEGATIVE_NUMBER MINUTES
            {
            match(input,NONNEGATIVE_NUMBER,FOLLOW_NONNEGATIVE_NUMBER_in_estimatedTime237); 

            match(input,MINUTES,FOLLOW_MINUTES_in_estimatedTime239); 

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
    // $ANTLR end "estimatedTime"

    // Delegated rules


 

    public static final BitSet FOLLOW_direction_in_directions36 = new BitSet(new long[]{0x0000000000C00212L});
    public static final BitSet FOLLOW_turnDirection_in_direction52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitDirection_in_direction59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrivalDirection_in_direction66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turn_in_turnDirection81 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ONTO_in_turnDirection83 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_TOLLROAD_in_turnDirection85 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_turnDirection88 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_turnDirection90 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedDistanceOrTime_in_turnDirection92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitDirection107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AT_in_exitDirection109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_exitDirection111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ONTO_in_exitDirection113 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_exitDirection115 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_exitDirection117 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedDistanceOrTime_in_exitDirection119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRIVE_in_arrivalDirection135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AT_in_arrivalDirection137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_arrivalDirection139 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_arrivalDirection141 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedDistanceOrTime_in_arrivalDirection143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_U_TURN_in_turn160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_turn170 = new BitSet(new long[]{0x0000000000180800L});
    public static final BitSet FOLLOW_SLIGHT_in_turn172 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_turn175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_estimatedDistance_in_estimatedDistanceOrTime201 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_estimatedDistanceOrTime203 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedTime_in_estimatedDistanceOrTime205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONNEGATIVE_NUMBER_in_estimatedDistance220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_MILES_in_estimatedDistance222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONNEGATIVE_NUMBER_in_estimatedTime237 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MINUTES_in_estimatedTime239 = new BitSet(new long[]{0x0000000000000002L});

}