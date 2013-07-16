// $ANTLR 3.4 C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g 2012-05-06 12:53:15

  package exp.parser.raw;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SimpleScriptParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SimpleScriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SimpleScriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SimpleScriptParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g"; }


    public static class script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "script"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:12:1: script : ( declaration )* ( stmt )* ;
    public final SimpleScriptParser.script_return script() throws RecognitionException {
        SimpleScriptParser.script_return retval = new SimpleScriptParser.script_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleScriptParser.declaration_return declaration1 =null;

        SimpleScriptParser.stmt_return stmt2 =null;



        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:13:3: ( ( declaration )* ( stmt )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:14:3: ( declaration )* ( stmt )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:14:3: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECLARE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:14:3: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_script45);
            	    declaration1=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:14:16: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DISPLAY||(LA2_0 >= ID && LA2_0 <= L_PAREN)||LA2_0==NUMBER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:14:16: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_script48);
            	    stmt2=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "script"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:17:1: declaration : DECLARE ID ( COMMA ID )* ( EQUALS NUMBER )? ;
    public final SimpleScriptParser.declaration_return declaration() throws RecognitionException {
        SimpleScriptParser.declaration_return retval = new SimpleScriptParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DECLARE3=null;
        Token ID4=null;
        Token COMMA5=null;
        Token ID6=null;
        Token EQUALS7=null;
        Token NUMBER8=null;

        Object DECLARE3_tree=null;
        Object ID4_tree=null;
        Object COMMA5_tree=null;
        Object ID6_tree=null;
        Object EQUALS7_tree=null;
        Object NUMBER8_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:18:3: ( DECLARE ID ( COMMA ID )* ( EQUALS NUMBER )? )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:19:3: DECLARE ID ( COMMA ID )* ( EQUALS NUMBER )?
            {
            root_0 = (Object)adaptor.nil();


            DECLARE3=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declaration64); 
            DECLARE3_tree = 
            (Object)adaptor.create(DECLARE3)
            ;
            adaptor.addChild(root_0, DECLARE3_tree);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_declaration66); 
            ID4_tree = 
            (Object)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:19:14: ( COMMA ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:19:15: COMMA ID
            	    {
            	    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration69); 
            	    COMMA5_tree = 
            	    (Object)adaptor.create(COMMA5)
            	    ;
            	    adaptor.addChild(root_0, COMMA5_tree);


            	    ID6=(Token)match(input,ID,FOLLOW_ID_in_declaration71); 
            	    ID6_tree = 
            	    (Object)adaptor.create(ID6)
            	    ;
            	    adaptor.addChild(root_0, ID6_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:19:26: ( EQUALS NUMBER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EQUALS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:19:27: EQUALS NUMBER
                    {
                    EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_declaration76); 
                    EQUALS7_tree = 
                    (Object)adaptor.create(EQUALS7)
                    ;
                    adaptor.addChild(root_0, EQUALS7_tree);


                    NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_declaration78); 
                    NUMBER8_tree = 
                    (Object)adaptor.create(NUMBER8)
                    ;
                    adaptor.addChild(root_0, NUMBER8_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:22:1: stmt : ( assignmentStmt | displayStmt | expressionStmt );
    public final SimpleScriptParser.stmt_return stmt() throws RecognitionException {
        SimpleScriptParser.stmt_return retval = new SimpleScriptParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleScriptParser.assignmentStmt_return assignmentStmt9 =null;

        SimpleScriptParser.displayStmt_return displayStmt10 =null;

        SimpleScriptParser.expressionStmt_return expressionStmt11 =null;



        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:23:3: ( assignmentStmt | displayStmt | expressionStmt )
            int alt5=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EQUALS) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1 >= DISPLAY && LA5_1 <= DIVIDE)||(LA5_1 >= EXP && LA5_1 <= MINUS)||(LA5_1 >= MULTIPLY && LA5_1 <= PLUS)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case DISPLAY:
                {
                alt5=2;
                }
                break;
            case L_PAREN:
            case NUMBER:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:24:3: assignmentStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignmentStmt_in_stmt96);
                    assignmentStmt9=assignmentStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentStmt9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:25:3: displayStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_displayStmt_in_stmt102);
                    displayStmt10=displayStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, displayStmt10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:26:3: expressionStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressionStmt_in_stmt108);
                    expressionStmt11=expressionStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStmt11.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class assignmentStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentStmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:29:1: assignmentStmt : ID EQUALS arithExpression ;
    public final SimpleScriptParser.assignmentStmt_return assignmentStmt() throws RecognitionException {
        SimpleScriptParser.assignmentStmt_return retval = new SimpleScriptParser.assignmentStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID12=null;
        Token EQUALS13=null;
        SimpleScriptParser.arithExpression_return arithExpression14 =null;


        Object ID12_tree=null;
        Object EQUALS13_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:30:3: ( ID EQUALS arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:31:3: ID EQUALS arithExpression
            {
            root_0 = (Object)adaptor.nil();


            ID12=(Token)match(input,ID,FOLLOW_ID_in_assignmentStmt124); 
            ID12_tree = 
            (Object)adaptor.create(ID12)
            ;
            adaptor.addChild(root_0, ID12_tree);


            EQUALS13=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignmentStmt126); 
            EQUALS13_tree = 
            (Object)adaptor.create(EQUALS13)
            ;
            adaptor.addChild(root_0, EQUALS13_tree);


            pushFollow(FOLLOW_arithExpression_in_assignmentStmt128);
            arithExpression14=arithExpression();

            state._fsp--;

            adaptor.addChild(root_0, arithExpression14.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentStmt"


    public static class displayStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "displayStmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:34:1: displayStmt : DISPLAY arithExpression ;
    public final SimpleScriptParser.displayStmt_return displayStmt() throws RecognitionException {
        SimpleScriptParser.displayStmt_return retval = new SimpleScriptParser.displayStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DISPLAY15=null;
        SimpleScriptParser.arithExpression_return arithExpression16 =null;


        Object DISPLAY15_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:35:3: ( DISPLAY arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:36:3: DISPLAY arithExpression
            {
            root_0 = (Object)adaptor.nil();


            DISPLAY15=(Token)match(input,DISPLAY,FOLLOW_DISPLAY_in_displayStmt144); 
            DISPLAY15_tree = 
            (Object)adaptor.create(DISPLAY15)
            ;
            adaptor.addChild(root_0, DISPLAY15_tree);


            pushFollow(FOLLOW_arithExpression_in_displayStmt146);
            arithExpression16=arithExpression();

            state._fsp--;

            adaptor.addChild(root_0, arithExpression16.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "displayStmt"


    public static class expressionStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionStmt"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:39:1: expressionStmt : arithExpression ;
    public final SimpleScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SimpleScriptParser.expressionStmt_return retval = new SimpleScriptParser.expressionStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleScriptParser.arithExpression_return arithExpression17 =null;



        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:40:3: ( arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:41:3: arithExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithExpression_in_expressionStmt161);
            arithExpression17=arithExpression();

            state._fsp--;

            adaptor.addChild(root_0, arithExpression17.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionStmt"


    public static class arithExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithExpression"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:44:1: arithExpression : multExpression ( ( PLUS | MINUS ) multExpression )* ;
    public final SimpleScriptParser.arithExpression_return arithExpression() throws RecognitionException {
        SimpleScriptParser.arithExpression_return retval = new SimpleScriptParser.arithExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set19=null;
        SimpleScriptParser.multExpression_return multExpression18 =null;

        SimpleScriptParser.multExpression_return multExpression20 =null;


        Object set19_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:45:3: ( multExpression ( ( PLUS | MINUS ) multExpression )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:46:3: multExpression ( ( PLUS | MINUS ) multExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpression_in_arithExpression177);
            multExpression18=multExpression();

            state._fsp--;

            adaptor.addChild(root_0, multExpression18.getTree());

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:46:18: ( ( PLUS | MINUS ) multExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MINUS||LA6_0==PLUS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:46:19: ( PLUS | MINUS ) multExpression
            	    {
            	    set19=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set19)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multExpression_in_arithExpression188);
            	    multExpression20=multExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpression20.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithExpression"


    public static class multExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpression"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:49:1: multExpression : expExpression ( ( MULTIPLY | DIVIDE ) expExpression )* ;
    public final SimpleScriptParser.multExpression_return multExpression() throws RecognitionException {
        SimpleScriptParser.multExpression_return retval = new SimpleScriptParser.multExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set22=null;
        SimpleScriptParser.expExpression_return expExpression21 =null;

        SimpleScriptParser.expExpression_return expExpression23 =null;


        Object set22_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:50:3: ( expExpression ( ( MULTIPLY | DIVIDE ) expExpression )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:51:3: expExpression ( ( MULTIPLY | DIVIDE ) expExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expExpression_in_multExpression205);
            expExpression21=expExpression();

            state._fsp--;

            adaptor.addChild(root_0, expExpression21.getTree());

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:51:17: ( ( MULTIPLY | DIVIDE ) expExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DIVIDE||LA7_0==MULTIPLY) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:51:18: ( MULTIPLY | DIVIDE ) expExpression
            	    {
            	    set22=(Token)input.LT(1);

            	    if ( input.LA(1)==DIVIDE||input.LA(1)==MULTIPLY ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set22)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_expExpression_in_multExpression216);
            	    expExpression23=expExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expExpression23.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpression"


    public static class expExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expExpression"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:54:1: expExpression : atom ( EXP atom )* ;
    public final SimpleScriptParser.expExpression_return expExpression() throws RecognitionException {
        SimpleScriptParser.expExpression_return retval = new SimpleScriptParser.expExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXP25=null;
        SimpleScriptParser.atom_return atom24 =null;

        SimpleScriptParser.atom_return atom26 =null;


        Object EXP25_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:55:3: ( atom ( EXP atom )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:56:3: atom ( EXP atom )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_atom_in_expExpression235);
            atom24=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom24.getTree());

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:56:8: ( EXP atom )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EXP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:56:9: EXP atom
            	    {
            	    EXP25=(Token)match(input,EXP,FOLLOW_EXP_in_expExpression238); 
            	    EXP25_tree = 
            	    (Object)adaptor.create(EXP25)
            	    ;
            	    adaptor.addChild(root_0, EXP25_tree);


            	    pushFollow(FOLLOW_atom_in_expExpression240);
            	    atom26=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expExpression"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:59:1: atom : ( ID | NUMBER | L_PAREN arithExpression R_PAREN );
    public final SimpleScriptParser.atom_return atom() throws RecognitionException {
        SimpleScriptParser.atom_return retval = new SimpleScriptParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID27=null;
        Token NUMBER28=null;
        Token L_PAREN29=null;
        Token R_PAREN31=null;
        SimpleScriptParser.arithExpression_return arithExpression30 =null;


        Object ID27_tree=null;
        Object NUMBER28_tree=null;
        Object L_PAREN29_tree=null;
        Object R_PAREN31_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:60:3: ( ID | NUMBER | L_PAREN arithExpression R_PAREN )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case NUMBER:
                {
                alt9=2;
                }
                break;
            case L_PAREN:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:61:3: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID27=(Token)match(input,ID,FOLLOW_ID_in_atom266); 
                    ID27_tree = 
                    (Object)adaptor.create(ID27)
                    ;
                    adaptor.addChild(root_0, ID27_tree);


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:62:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER28=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom272); 
                    NUMBER28_tree = 
                    (Object)adaptor.create(NUMBER28)
                    ;
                    adaptor.addChild(root_0, NUMBER28_tree);


                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\raw\\SimpleScriptParser.g:63:3: L_PAREN arithExpression R_PAREN
                    {
                    root_0 = (Object)adaptor.nil();


                    L_PAREN29=(Token)match(input,L_PAREN,FOLLOW_L_PAREN_in_atom278); 
                    L_PAREN29_tree = 
                    (Object)adaptor.create(L_PAREN29)
                    ;
                    adaptor.addChild(root_0, L_PAREN29_tree);


                    pushFollow(FOLLOW_arithExpression_in_atom280);
                    arithExpression30=arithExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpression30.getTree());

                    R_PAREN31=(Token)match(input,R_PAREN,FOLLOW_R_PAREN_in_atom282); 
                    R_PAREN31_tree = 
                    (Object)adaptor.create(R_PAREN31)
                    ;
                    adaptor.addChild(root_0, R_PAREN31_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_script45 = new BitSet(new long[]{0x00000000000230A2L});
    public static final BitSet FOLLOW_stmt_in_script48 = new BitSet(new long[]{0x0000000000023082L});
    public static final BitSet FOLLOW_DECLARE_in_declaration64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_declaration66 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_COMMA_in_declaration69 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_declaration71 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_EQUALS_in_declaration76 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_NUMBER_in_declaration78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStmt_in_stmt96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_displayStmt_in_stmt102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_stmt108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStmt124 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_assignmentStmt126 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_arithExpression_in_assignmentStmt128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISPLAY_in_displayStmt144 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_arithExpression_in_displayStmt146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpression_in_expressionStmt161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpression_in_arithExpression177 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_set_in_arithExpression180 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_multExpression_in_arithExpression188 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_expExpression_in_multExpression205 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_set_in_multExpression208 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_expExpression_in_multExpression216 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_atom_in_expExpression235 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_EXP_in_expExpression238 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_atom_in_expExpression240 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ID_in_atom266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_PAREN_in_atom278 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_arithExpression_in_atom280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_R_PAREN_in_atom282 = new BitSet(new long[]{0x0000000000000002L});

}