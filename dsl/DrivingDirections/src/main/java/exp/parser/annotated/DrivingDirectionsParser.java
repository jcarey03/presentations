// $ANTLR 3.4 C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g 2012-05-06 21:03:59

  package exp.parser.annotated;
  
  import exp.model.DirectionBuilder;
  import exp.model.DirectionList;
  import exp.model.DirectionBuilderFactory;
  import exp.model.TurnDirection.TurnDirectionBuilder;
  import exp.model.TurnType;


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
    public String getGrammarFileName() { return "C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g"; }


      private DirectionList directionList = new DirectionList();
      private DirectionBuilder currDirectionBuilder;



    // $ANTLR start "directions"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:22:1: directions returns [DirectionList result] : ( direction )+ ;
    public final DirectionList directions() throws RecognitionException {
        DirectionList result = null;


        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:26:3: ( ( direction )+ )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:27:3: ( direction )+
            {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:27:3: ( direction )+
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
            	    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:27:3: direction
            	    {
            	    pushFollow(FOLLOW_direction_in_directions53);
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


                result = directionList;
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "directions"



    // $ANTLR start "direction"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:30:1: direction : ( turnDirection | exitDirection | arrivalDirection );
    public final void direction() throws RecognitionException {
        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:34:3: ( turnDirection | exitDirection | arrivalDirection )
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
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:35:3: turnDirection
                    {
                    pushFollow(FOLLOW_turnDirection_in_direction76);
                    turnDirection();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:36:3: exitDirection
                    {
                    pushFollow(FOLLOW_exitDirection_in_direction83);
                    exitDirection();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:37:3: arrivalDirection
                    {
                    pushFollow(FOLLOW_arrivalDirection_in_direction90);
                    arrivalDirection();

                    state._fsp--;


                    }
                    break;

            }

                directionList.add(currDirectionBuilder.build());
              
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
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:40:1: turnDirection : turn ONTO ( TOLLROAD )? LOCATION IN estimatedDistanceOrTime ;
    public final void turnDirection() throws RecognitionException {
        Token LOCATION2=null;
        Token TOLLROAD3=null;
        TurnType turn1 =null;


        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:41:3: ( turn ONTO ( TOLLROAD )? LOCATION IN estimatedDistanceOrTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:42:3: turn ONTO ( TOLLROAD )? LOCATION IN estimatedDistanceOrTime
            {
            pushFollow(FOLLOW_turn_in_turnDirection105);
            turn1=turn();

            state._fsp--;


            match(input,ONTO,FOLLOW_ONTO_in_turnDirection107); 

            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:42:13: ( TOLLROAD )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TOLLROAD) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:42:13: TOLLROAD
                    {
                    TOLLROAD3=(Token)match(input,TOLLROAD,FOLLOW_TOLLROAD_in_turnDirection109); 

                    }
                    break;

            }


            LOCATION2=(Token)match(input,LOCATION,FOLLOW_LOCATION_in_turnDirection112); 

            match(input,IN,FOLLOW_IN_in_turnDirection114); 

             
                currDirectionBuilder = DirectionBuilderFactory
                  .turn(turn1)
                  .onto((LOCATION2!=null?LOCATION2.getText():null));
                if((TOLLROAD3!=null?TOLLROAD3.getText():null) != null) {
                  ((TurnDirectionBuilder) currDirectionBuilder).tollroad();
                }
              

            pushFollow(FOLLOW_estimatedDistanceOrTime_in_turnDirection123);
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
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:54:1: exitDirection : EXIT AT exit= LOCATION ONTO nextLoc= LOCATION IN estimatedDistanceOrTime ;
    public final void exitDirection() throws RecognitionException {
        Token exit=null;
        Token nextLoc=null;

        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:55:3: ( EXIT AT exit= LOCATION ONTO nextLoc= LOCATION IN estimatedDistanceOrTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:56:3: EXIT AT exit= LOCATION ONTO nextLoc= LOCATION IN estimatedDistanceOrTime
            {
            match(input,EXIT,FOLLOW_EXIT_in_exitDirection138); 

            match(input,AT,FOLLOW_AT_in_exitDirection140); 

            exit=(Token)match(input,LOCATION,FOLLOW_LOCATION_in_exitDirection144); 

            match(input,ONTO,FOLLOW_ONTO_in_exitDirection146); 

            nextLoc=(Token)match(input,LOCATION,FOLLOW_LOCATION_in_exitDirection150); 

            match(input,IN,FOLLOW_IN_in_exitDirection152); 

             
                currDirectionBuilder = DirectionBuilderFactory
                  .exit((exit!=null?exit.getText():null))
                  .onto((nextLoc!=null?nextLoc.getText():null));
              

            pushFollow(FOLLOW_estimatedDistanceOrTime_in_exitDirection161);
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
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:65:1: arrivalDirection : ARRIVE AT LOCATION IN estimatedDistanceOrTime ;
    public final void arrivalDirection() throws RecognitionException {
        Token LOCATION4=null;

        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:66:3: ( ARRIVE AT LOCATION IN estimatedDistanceOrTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:67:3: ARRIVE AT LOCATION IN estimatedDistanceOrTime
            {
            match(input,ARRIVE,FOLLOW_ARRIVE_in_arrivalDirection177); 

            match(input,AT,FOLLOW_AT_in_arrivalDirection179); 

            LOCATION4=(Token)match(input,LOCATION,FOLLOW_LOCATION_in_arrivalDirection181); 

            match(input,IN,FOLLOW_IN_in_arrivalDirection183); 


                currDirectionBuilder = DirectionBuilderFactory
                  .arrive((LOCATION4!=null?LOCATION4.getText():null));
              

            pushFollow(FOLLOW_estimatedDistanceOrTime_in_arrivalDirection191);
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
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:75:1: turn returns [TurnType result] : ( U_TURN | TURN ( SLIGHT )? leftOrRight= ( LEFT | RIGHT ) );
    public final TurnType turn() throws RecognitionException {
        TurnType result = null;


        Token leftOrRight=null;
        Token SLIGHT5=null;

        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:76:3: ( U_TURN | TURN ( SLIGHT )? leftOrRight= ( LEFT | RIGHT ) )
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
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:77:3: U_TURN
                    {
                    match(input,U_TURN,FOLLOW_U_TURN_in_turn212); 


                        result = TurnType.U_TURN;
                      

                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:82:3: TURN ( SLIGHT )? leftOrRight= ( LEFT | RIGHT )
                    {
                    match(input,TURN,FOLLOW_TURN_in_turn226); 

                    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:82:8: ( SLIGHT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==SLIGHT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:82:8: SLIGHT
                            {
                            SLIGHT5=(Token)match(input,SLIGHT,FOLLOW_SLIGHT_in_turn228); 

                            }
                            break;

                    }


                    leftOrRight=(Token)input.LT(1);

                    if ( input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }



                        String slightValue = ((SLIGHT5!=null?SLIGHT5.getText():null) == null) ? "" : (SLIGHT5!=null?SLIGHT5.getText():null) + " ";
                        result = TurnType.valueOfByDisplayLabel(slightValue + (leftOrRight!=null?leftOrRight.getText():null));
                      

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
        return result;
    }
    // $ANTLR end "turn"



    // $ANTLR start "estimatedDistanceOrTime"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:89:1: estimatedDistanceOrTime : estimatedDistance OR estimatedTime ;
    public final void estimatedDistanceOrTime() throws RecognitionException {
        double estimatedDistance6 =0.0;

        double estimatedTime7 =0.0;


        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:90:3: ( estimatedDistance OR estimatedTime )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:91:3: estimatedDistance OR estimatedTime
            {
            pushFollow(FOLLOW_estimatedDistance_in_estimatedDistanceOrTime263);
            estimatedDistance6=estimatedDistance();

            state._fsp--;


            match(input,OR,FOLLOW_OR_in_estimatedDistanceOrTime265); 

            pushFollow(FOLLOW_estimatedTime_in_estimatedDistanceOrTime267);
            estimatedTime7=estimatedTime();

            state._fsp--;



                currDirectionBuilder
                  .in_miles(estimatedDistance6)
                  .in_minutes(estimatedTime7);
              

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
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:99:1: estimatedDistance returns [double result] : NONNEGATIVE_NUMBER MILES ;
    public final double estimatedDistance() throws RecognitionException {
        double result = 0.0;


        Token NONNEGATIVE_NUMBER8=null;

        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:100:3: ( NONNEGATIVE_NUMBER MILES )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:101:3: NONNEGATIVE_NUMBER MILES
            {
            NONNEGATIVE_NUMBER8=(Token)match(input,NONNEGATIVE_NUMBER,FOLLOW_NONNEGATIVE_NUMBER_in_estimatedDistance289); 

            match(input,MILES,FOLLOW_MILES_in_estimatedDistance291); 


                result = Double.parseDouble((NONNEGATIVE_NUMBER8!=null?NONNEGATIVE_NUMBER8.getText():null));
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "estimatedDistance"



    // $ANTLR start "estimatedTime"
    // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:107:1: estimatedTime returns [double result] : NONNEGATIVE_NUMBER MINUTES ;
    public final double estimatedTime() throws RecognitionException {
        double result = 0.0;


        Token NONNEGATIVE_NUMBER9=null;

        try {
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:108:3: ( NONNEGATIVE_NUMBER MINUTES )
            // C:\\development\\workspace\\DrivingDirections\\src\\main\\java\\exp\\parser\\annotated\\DrivingDirectionsParser.g:109:3: NONNEGATIVE_NUMBER MINUTES
            {
            NONNEGATIVE_NUMBER9=(Token)match(input,NONNEGATIVE_NUMBER,FOLLOW_NONNEGATIVE_NUMBER_in_estimatedTime313); 

            match(input,MINUTES,FOLLOW_MINUTES_in_estimatedTime315); 


                result = Double.parseDouble((NONNEGATIVE_NUMBER9!=null?NONNEGATIVE_NUMBER9.getText():null));
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "estimatedTime"

    // Delegated rules


 

    public static final BitSet FOLLOW_direction_in_directions53 = new BitSet(new long[]{0x0000000000C00212L});
    public static final BitSet FOLLOW_turnDirection_in_direction76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitDirection_in_direction83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrivalDirection_in_direction90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turn_in_turnDirection105 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ONTO_in_turnDirection107 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_TOLLROAD_in_turnDirection109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_turnDirection112 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_turnDirection114 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedDistanceOrTime_in_turnDirection123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_exitDirection138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AT_in_exitDirection140 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_exitDirection144 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ONTO_in_exitDirection146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_exitDirection150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_exitDirection152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedDistanceOrTime_in_exitDirection161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRIVE_in_arrivalDirection177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_AT_in_arrivalDirection179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LOCATION_in_arrivalDirection181 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_arrivalDirection183 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedDistanceOrTime_in_arrivalDirection191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_U_TURN_in_turn212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TURN_in_turn226 = new BitSet(new long[]{0x0000000000180800L});
    public static final BitSet FOLLOW_SLIGHT_in_turn228 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_set_in_turn233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_estimatedDistance_in_estimatedDistanceOrTime263 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_estimatedDistanceOrTime265 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_estimatedTime_in_estimatedDistanceOrTime267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONNEGATIVE_NUMBER_in_estimatedDistance289 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_MILES_in_estimatedDistance291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NONNEGATIVE_NUMBER_in_estimatedTime313 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_MINUTES_in_estimatedTime315 = new BitSet(new long[]{0x0000000000000002L});

}