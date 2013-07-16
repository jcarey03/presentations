// $ANTLR 3.4 C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g 2012-05-06 12:53:13

  package exp.walker;
  
  import java.util.Map;
  import exp.model.ProgramState;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleScriptWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "DECLARE", "DIGIT", "DISPLAY", "DIVIDE", "DOT", "EQUALS", "EXP", "ID", "L_PAREN", "MINUS", "ML_COMMENT", "MULTIPLY", "NUMBER", "PLUS", "R_PAREN", "SINGLE_COMMENT", "WS"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SimpleScriptWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleScriptWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SimpleScriptWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g"; }


      private ProgramState programState;



    // $ANTLR start "script"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:19:1: script[Map<String, Double> constants] returns [ double result ] : ( declaration )* ( stmt )* ;
    public final double script(Map<String, Double> constants) throws RecognitionException {
        double result = 0.0;



            programState = new ProgramState(constants);
          
        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:26:3: ( ( declaration )* ( stmt )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:27:3: ( declaration )* ( stmt )*
            {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:27:3: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECLARE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:27:3: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_script67);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:27:16: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= DISPLAY && LA2_0 <= DIVIDE)||(LA2_0 >= EQUALS && LA2_0 <= ID)||LA2_0==MINUS||(LA2_0 >= MULTIPLY && LA2_0 <= PLUS)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:27:16: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_script70);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


                result = programState.getEvaluationResult();
              
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
    // $ANTLR end "script"



    // $ANTLR start "declaration"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:30:1: declaration : ^( DECLARE ID ( EQUALS NUMBER )? ) ;
    public final void declaration() throws RecognitionException {
        CommonTree NUMBER1=null;
        CommonTree ID2=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:31:3: ( ^( DECLARE ID ( EQUALS NUMBER )? ) )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:32:3: ^( DECLARE ID ( EQUALS NUMBER )? )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_declaration87); 

            match(input, Token.DOWN, null); 
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration89); 

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:32:16: ( EQUALS NUMBER )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUALS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:32:17: EQUALS NUMBER
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_declaration92); 

                    NUMBER1=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_declaration94); 

                    }
                    break;

            }


            match(input, Token.UP, null); 



                double value = 0.0;
                if((NUMBER1!=null?NUMBER1.getText():null) != null) {
                  value = Double.parseDouble((NUMBER1!=null?NUMBER1.getText():null));
                }
                programState.declareVariable((ID2!=null?ID2.getText():null), value);
              

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
    // $ANTLR end "declaration"



    // $ANTLR start "stmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:42:1: stmt : ( assignmentStmt | displayStmt | expressionStmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:43:3: ( assignmentStmt | displayStmt | expressionStmt )
            int alt4=3;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt4=1;
                }
                break;
            case DISPLAY:
                {
                alt4=2;
                }
                break;
            case DIVIDE:
            case EXP:
            case ID:
            case MINUS:
            case MULTIPLY:
            case NUMBER:
            case PLUS:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:44:3: assignmentStmt
                    {
                    pushFollow(FOLLOW_assignmentStmt_in_stmt116);
                    assignmentStmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:45:3: displayStmt
                    {
                    pushFollow(FOLLOW_displayStmt_in_stmt122);
                    displayStmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:46:3: expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_stmt128);
                    expressionStmt();

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
    // $ANTLR end "stmt"



    // $ANTLR start "assignmentStmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:49:1: assignmentStmt : ^( EQUALS ID arithExpression ) ;
    public final void assignmentStmt() throws RecognitionException {
        CommonTree ID3=null;
        double arithExpression4 =0.0;


        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:50:3: ( ^( EQUALS ID arithExpression ) )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:51:3: ^( EQUALS ID arithExpression )
            {
            match(input,EQUALS,FOLLOW_EQUALS_in_assignmentStmt145); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_assignmentStmt147); 

            pushFollow(FOLLOW_arithExpression_in_assignmentStmt149);
            arithExpression4=arithExpression();

            state._fsp--;


            match(input, Token.UP, null); 



                programState.updateVariable((ID3!=null?ID3.getText():null), arithExpression4);
                programState.setEvaluationResult(arithExpression4);
              

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
    // $ANTLR end "assignmentStmt"



    // $ANTLR start "displayStmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:58:1: displayStmt : ^( DISPLAY arithExpression ) ;
    public final void displayStmt() throws RecognitionException {
        double arithExpression5 =0.0;


        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:59:3: ( ^( DISPLAY arithExpression ) )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:60:3: ^( DISPLAY arithExpression )
            {
            match(input,DISPLAY,FOLLOW_DISPLAY_in_displayStmt170); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_arithExpression_in_displayStmt172);
            arithExpression5=arithExpression();

            state._fsp--;


            match(input, Token.UP, null); 



                double result = arithExpression5;
                programState.setEvaluationResult(result);
                System.out.println(String.format("Intermediate Result:\n  %f\n", result));
              

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
    // $ANTLR end "displayStmt"



    // $ANTLR start "expressionStmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:68:1: expressionStmt : arithExpression ;
    public final void expressionStmt() throws RecognitionException {
        double arithExpression6 =0.0;


        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:69:3: ( arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:70:3: arithExpression
            {
            pushFollow(FOLLOW_arithExpression_in_expressionStmt194);
            arithExpression6=arithExpression();

            state._fsp--;



                programState.setEvaluationResult(arithExpression6);
              

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
    // $ANTLR end "expressionStmt"



    // $ANTLR start "arithExpression"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:76:1: arithExpression returns [double result] : ( ^( PLUS op1= arithExpression op2= arithExpression ) | ^( MINUS op1= arithExpression op2= arithExpression ) | ^( MULTIPLY op1= arithExpression op2= arithExpression ) | ^( DIVIDE op1= arithExpression op2= arithExpression ) | ^( EXP op1= arithExpression op2= arithExpression ) | NUMBER | ID );
    public final double arithExpression() throws RecognitionException {
        double result = 0.0;


        CommonTree NUMBER7=null;
        CommonTree ID8=null;
        double op1 =0.0;

        double op2 =0.0;


        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:77:3: ( ^( PLUS op1= arithExpression op2= arithExpression ) | ^( MINUS op1= arithExpression op2= arithExpression ) | ^( MULTIPLY op1= arithExpression op2= arithExpression ) | ^( DIVIDE op1= arithExpression op2= arithExpression ) | ^( EXP op1= arithExpression op2= arithExpression ) | NUMBER | ID )
            int alt5=7;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt5=1;
                }
                break;
            case MINUS:
                {
                alt5=2;
                }
                break;
            case MULTIPLY:
                {
                alt5=3;
                }
                break;
            case DIVIDE:
                {
                alt5=4;
                }
                break;
            case EXP:
                {
                alt5=5;
                }
                break;
            case NUMBER:
                {
                alt5=6;
                }
                break;
            case ID:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:78:3: ^( PLUS op1= arithExpression op2= arithExpression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_arithExpression220); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithExpression_in_arithExpression226);
                    op1=arithExpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithExpression_in_arithExpression232);
                    op2=arithExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = op1 + op2; 

                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:79:3: ^( MINUS op1= arithExpression op2= arithExpression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_arithExpression248); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithExpression_in_arithExpression254);
                    op1=arithExpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithExpression_in_arithExpression260);
                    op2=arithExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = op1 - op2; 

                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:80:3: ^( MULTIPLY op1= arithExpression op2= arithExpression )
                    {
                    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_arithExpression275); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithExpression_in_arithExpression281);
                    op1=arithExpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithExpression_in_arithExpression287);
                    op2=arithExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = op1 * op2; 

                    }
                    break;
                case 4 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:81:3: ^( DIVIDE op1= arithExpression op2= arithExpression )
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_arithExpression299); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithExpression_in_arithExpression305);
                    op1=arithExpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithExpression_in_arithExpression311);
                    op2=arithExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = op1 / op2; 

                    }
                    break;
                case 5 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:82:3: ^( EXP op1= arithExpression op2= arithExpression )
                    {
                    match(input,EXP,FOLLOW_EXP_in_arithExpression325); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_arithExpression_in_arithExpression331);
                    op1=arithExpression();

                    state._fsp--;


                    pushFollow(FOLLOW_arithExpression_in_arithExpression337);
                    op2=arithExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                     result = Math.pow(op1, op2); 

                    }
                    break;
                case 6 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:83:3: NUMBER
                    {
                    NUMBER7=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_arithExpression353); 

                     result = Double.parseDouble((NUMBER7!=null?NUMBER7.getText():null)); 

                    }
                    break;
                case 7 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\walker\\SimpleScriptWalker.g:84:3: ID
                    {
                    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_arithExpression412); 

                     result = programState.getValue((ID8!=null?ID8.getText():null)); 

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
    // $ANTLR end "arithExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_script67 = new BitSet(new long[]{0x0000000000075DA2L});
    public static final BitSet FOLLOW_stmt_in_script70 = new BitSet(new long[]{0x0000000000075D82L});
    public static final BitSet FOLLOW_DECLARE_in_declaration87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaration89 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_EQUALS_in_declaration92 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NUMBER_in_declaration94 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignmentStmt_in_stmt116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_displayStmt_in_stmt122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_stmt128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_assignmentStmt145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignmentStmt147 = new BitSet(new long[]{0x0000000000075900L});
    public static final BitSet FOLLOW_arithExpression_in_assignmentStmt149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISPLAY_in_displayStmt170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithExpression_in_displayStmt172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arithExpression_in_expressionStmt194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_arithExpression220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression226 = new BitSet(new long[]{0x0000000000075900L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithExpression248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression254 = new BitSet(new long[]{0x0000000000075900L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULTIPLY_in_arithExpression275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression281 = new BitSet(new long[]{0x0000000000075900L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_arithExpression299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression305 = new BitSet(new long[]{0x0000000000075900L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_arithExpression325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression331 = new BitSet(new long[]{0x0000000000075900L});
    public static final BitSet FOLLOW_arithExpression_in_arithExpression337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_arithExpression353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arithExpression412 = new BitSet(new long[]{0x0000000000000002L});

}