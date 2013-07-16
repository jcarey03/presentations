// $ANTLR 3.4 C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g 2012-05-06 12:53:16

  package exp.parser.annotated;


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
    public String getGrammarFileName() { return "C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g"; }


    public static class script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "script"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:12:1: script : ( declaration )* ( stmt )* ;
    public final SimpleScriptParser.script_return script() throws RecognitionException {
        SimpleScriptParser.script_return retval = new SimpleScriptParser.script_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleScriptParser.declaration_return declaration1 =null;

        SimpleScriptParser.stmt_return stmt2 =null;



        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:13:3: ( ( declaration )* ( stmt )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:14:3: ( declaration )* ( stmt )*
            {
            root_0 = (Object)adaptor.nil();


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:14:3: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECLARE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:14:3: declaration
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


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:14:16: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DISPLAY||(LA2_0 >= ID && LA2_0 <= L_PAREN)||LA2_0==NUMBER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:14:16: stmt
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:17:1: declaration : DECLARE ID ( COMMA ID )* ( EQUALS NUMBER )? -> ( ^( DECLARE ID ( EQUALS NUMBER )? ) )+ ;
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
        RewriteRuleTokenStream stream_DECLARE=new RewriteRuleTokenStream(adaptor,"token DECLARE");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:18:3: ( DECLARE ID ( COMMA ID )* ( EQUALS NUMBER )? -> ( ^( DECLARE ID ( EQUALS NUMBER )? ) )+ )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:19:3: DECLARE ID ( COMMA ID )* ( EQUALS NUMBER )?
            {
            DECLARE3=(Token)match(input,DECLARE,FOLLOW_DECLARE_in_declaration64);  
            stream_DECLARE.add(DECLARE3);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_declaration66);  
            stream_ID.add(ID4);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:19:14: ( COMMA ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:19:15: COMMA ID
            	    {
            	    COMMA5=(Token)match(input,COMMA,FOLLOW_COMMA_in_declaration69);  
            	    stream_COMMA.add(COMMA5);


            	    ID6=(Token)match(input,ID,FOLLOW_ID_in_declaration71);  
            	    stream_ID.add(ID6);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:19:26: ( EQUALS NUMBER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EQUALS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:19:27: EQUALS NUMBER
                    {
                    EQUALS7=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_declaration76);  
                    stream_EQUALS.add(EQUALS7);


                    NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_declaration78);  
                    stream_NUMBER.add(NUMBER8);


                    }
                    break;

            }


            // AST REWRITE
            // elements: ID, NUMBER, DECLARE, EQUALS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 20:3: -> ( ^( DECLARE ID ( EQUALS NUMBER )? ) )+
            {
                if ( !(stream_ID.hasNext()||stream_DECLARE.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_DECLARE.hasNext() ) {
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:21:3: ^( DECLARE ID ( EQUALS NUMBER )? )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    stream_DECLARE.nextNode()
                    , root_1);

                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:21:16: ( EQUALS NUMBER )?
                    if ( stream_NUMBER.hasNext()||stream_EQUALS.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_EQUALS.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_NUMBER.nextNode()
                        );

                    }
                    stream_NUMBER.reset();
                    stream_EQUALS.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ID.reset();
                stream_DECLARE.reset();

            }


            retval.tree = root_0;

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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:24:1: stmt : ( assignmentStmt | displayStmt | expressionStmt );
    public final SimpleScriptParser.stmt_return stmt() throws RecognitionException {
        SimpleScriptParser.stmt_return retval = new SimpleScriptParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleScriptParser.assignmentStmt_return assignmentStmt9 =null;

        SimpleScriptParser.displayStmt_return displayStmt10 =null;

        SimpleScriptParser.expressionStmt_return expressionStmt11 =null;



        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:25:3: ( assignmentStmt | displayStmt | expressionStmt )
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
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:26:3: assignmentStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignmentStmt_in_stmt116);
                    assignmentStmt9=assignmentStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentStmt9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:27:3: displayStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_displayStmt_in_stmt122);
                    displayStmt10=displayStmt();

                    state._fsp--;

                    adaptor.addChild(root_0, displayStmt10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:28:3: expressionStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressionStmt_in_stmt128);
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:31:1: assignmentStmt : ID EQUALS ^ arithExpression ;
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
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:32:3: ( ID EQUALS ^ arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:33:3: ID EQUALS ^ arithExpression
            {
            root_0 = (Object)adaptor.nil();


            ID12=(Token)match(input,ID,FOLLOW_ID_in_assignmentStmt144); 
            ID12_tree = 
            (Object)adaptor.create(ID12)
            ;
            adaptor.addChild(root_0, ID12_tree);


            EQUALS13=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignmentStmt146); 
            EQUALS13_tree = 
            (Object)adaptor.create(EQUALS13)
            ;
            root_0 = (Object)adaptor.becomeRoot(EQUALS13_tree, root_0);


            pushFollow(FOLLOW_arithExpression_in_assignmentStmt149);
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:36:1: displayStmt : DISPLAY ^ arithExpression ;
    public final SimpleScriptParser.displayStmt_return displayStmt() throws RecognitionException {
        SimpleScriptParser.displayStmt_return retval = new SimpleScriptParser.displayStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DISPLAY15=null;
        SimpleScriptParser.arithExpression_return arithExpression16 =null;


        Object DISPLAY15_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:37:3: ( DISPLAY ^ arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:38:3: DISPLAY ^ arithExpression
            {
            root_0 = (Object)adaptor.nil();


            DISPLAY15=(Token)match(input,DISPLAY,FOLLOW_DISPLAY_in_displayStmt165); 
            DISPLAY15_tree = 
            (Object)adaptor.create(DISPLAY15)
            ;
            root_0 = (Object)adaptor.becomeRoot(DISPLAY15_tree, root_0);


            pushFollow(FOLLOW_arithExpression_in_displayStmt168);
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:41:1: expressionStmt : arithExpression ;
    public final SimpleScriptParser.expressionStmt_return expressionStmt() throws RecognitionException {
        SimpleScriptParser.expressionStmt_return retval = new SimpleScriptParser.expressionStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SimpleScriptParser.arithExpression_return arithExpression17 =null;



        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:42:3: ( arithExpression )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:43:3: arithExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arithExpression_in_expressionStmt183);
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:46:1: arithExpression : multExpression ( ( PLUS ^| MINUS ^) multExpression )* ;
    public final SimpleScriptParser.arithExpression_return arithExpression() throws RecognitionException {
        SimpleScriptParser.arithExpression_return retval = new SimpleScriptParser.arithExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS19=null;
        Token MINUS20=null;
        SimpleScriptParser.multExpression_return multExpression18 =null;

        SimpleScriptParser.multExpression_return multExpression21 =null;


        Object PLUS19_tree=null;
        Object MINUS20_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:47:3: ( multExpression ( ( PLUS ^| MINUS ^) multExpression )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:48:3: multExpression ( ( PLUS ^| MINUS ^) multExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpression_in_arithExpression199);
            multExpression18=multExpression();

            state._fsp--;

            adaptor.addChild(root_0, multExpression18.getTree());

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:48:18: ( ( PLUS ^| MINUS ^) multExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MINUS||LA7_0==PLUS) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:48:19: ( PLUS ^| MINUS ^) multExpression
            	    {
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:48:19: ( PLUS ^| MINUS ^)
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==PLUS) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==MINUS) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:48:20: PLUS ^
            	            {
            	            PLUS19=(Token)match(input,PLUS,FOLLOW_PLUS_in_arithExpression203); 
            	            PLUS19_tree = 
            	            (Object)adaptor.create(PLUS19)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS19_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:48:28: MINUS ^
            	            {
            	            MINUS20=(Token)match(input,MINUS,FOLLOW_MINUS_in_arithExpression208); 
            	            MINUS20_tree = 
            	            (Object)adaptor.create(MINUS20)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MINUS20_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpression_in_arithExpression212);
            	    multExpression21=multExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpression21.getTree());

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
    // $ANTLR end "arithExpression"


    public static class multExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpression"
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:51:1: multExpression : expExpression ( ( MULTIPLY ^| DIVIDE ^) expExpression )* ;
    public final SimpleScriptParser.multExpression_return multExpression() throws RecognitionException {
        SimpleScriptParser.multExpression_return retval = new SimpleScriptParser.multExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULTIPLY23=null;
        Token DIVIDE24=null;
        SimpleScriptParser.expExpression_return expExpression22 =null;

        SimpleScriptParser.expExpression_return expExpression25 =null;


        Object MULTIPLY23_tree=null;
        Object DIVIDE24_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:52:3: ( expExpression ( ( MULTIPLY ^| DIVIDE ^) expExpression )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:53:3: expExpression ( ( MULTIPLY ^| DIVIDE ^) expExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expExpression_in_multExpression229);
            expExpression22=expExpression();

            state._fsp--;

            adaptor.addChild(root_0, expExpression22.getTree());

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:53:17: ( ( MULTIPLY ^| DIVIDE ^) expExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DIVIDE||LA9_0==MULTIPLY) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:53:18: ( MULTIPLY ^| DIVIDE ^) expExpression
            	    {
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:53:18: ( MULTIPLY ^| DIVIDE ^)
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==MULTIPLY) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==DIVIDE) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:53:19: MULTIPLY ^
            	            {
            	            MULTIPLY23=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_multExpression233); 
            	            MULTIPLY23_tree = 
            	            (Object)adaptor.create(MULTIPLY23)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MULTIPLY23_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:53:31: DIVIDE ^
            	            {
            	            DIVIDE24=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multExpression238); 
            	            DIVIDE24_tree = 
            	            (Object)adaptor.create(DIVIDE24)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIVIDE24_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expExpression_in_multExpression242);
            	    expExpression25=expExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expExpression25.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:56:1: expExpression : atom ( EXP ^ atom )* ;
    public final SimpleScriptParser.expExpression_return expExpression() throws RecognitionException {
        SimpleScriptParser.expExpression_return retval = new SimpleScriptParser.expExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXP27=null;
        SimpleScriptParser.atom_return atom26 =null;

        SimpleScriptParser.atom_return atom28 =null;


        Object EXP27_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:57:3: ( atom ( EXP ^ atom )* )
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:58:3: atom ( EXP ^ atom )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_atom_in_expExpression261);
            atom26=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom26.getTree());

            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:58:8: ( EXP ^ atom )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EXP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:58:9: EXP ^ atom
            	    {
            	    EXP27=(Token)match(input,EXP,FOLLOW_EXP_in_expExpression264); 
            	    EXP27_tree = 
            	    (Object)adaptor.create(EXP27)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(EXP27_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_expExpression267);
            	    atom28=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom28.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:61:1: atom : ( ID | NUMBER | L_PAREN ! arithExpression R_PAREN !);
    public final SimpleScriptParser.atom_return atom() throws RecognitionException {
        SimpleScriptParser.atom_return retval = new SimpleScriptParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID29=null;
        Token NUMBER30=null;
        Token L_PAREN31=null;
        Token R_PAREN33=null;
        SimpleScriptParser.arithExpression_return arithExpression32 =null;


        Object ID29_tree=null;
        Object NUMBER30_tree=null;
        Object L_PAREN31_tree=null;
        Object R_PAREN33_tree=null;

        try {
            // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:62:3: ( ID | NUMBER | L_PAREN ! arithExpression R_PAREN !)
            int alt11=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt11=1;
                }
                break;
            case NUMBER:
                {
                alt11=2;
                }
                break;
            case L_PAREN:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:63:3: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID29=(Token)match(input,ID,FOLLOW_ID_in_atom293); 
                    ID29_tree = 
                    (Object)adaptor.create(ID29)
                    ;
                    adaptor.addChild(root_0, ID29_tree);


                    }
                    break;
                case 2 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:64:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();


                    NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom299); 
                    NUMBER30_tree = 
                    (Object)adaptor.create(NUMBER30)
                    ;
                    adaptor.addChild(root_0, NUMBER30_tree);


                    }
                    break;
                case 3 :
                    // C:\\development\\workspace\\SimpleScript\\src\\main\\java\\exp\\parser\\annotated\\SimpleScriptParser.g:65:3: L_PAREN ! arithExpression R_PAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    L_PAREN31=(Token)match(input,L_PAREN,FOLLOW_L_PAREN_in_atom305); 

                    pushFollow(FOLLOW_arithExpression_in_atom308);
                    arithExpression32=arithExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, arithExpression32.getTree());

                    R_PAREN33=(Token)match(input,R_PAREN,FOLLOW_R_PAREN_in_atom310); 

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
    public static final BitSet FOLLOW_assignmentStmt_in_stmt116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_displayStmt_in_stmt122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_stmt128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStmt144 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUALS_in_assignmentStmt146 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_arithExpression_in_assignmentStmt149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISPLAY_in_displayStmt165 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_arithExpression_in_displayStmt168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithExpression_in_expressionStmt183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpression_in_arithExpression199 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_PLUS_in_arithExpression203 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_MINUS_in_arithExpression208 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_multExpression_in_arithExpression212 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_expExpression_in_multExpression229 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_MULTIPLY_in_multExpression233 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_DIVIDE_in_multExpression238 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_expExpression_in_multExpression242 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_atom_in_expExpression261 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_EXP_in_expExpression264 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_atom_in_expExpression267 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ID_in_atom293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_PAREN_in_atom305 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_arithExpression_in_atom308 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_R_PAREN_in_atom310 = new BitSet(new long[]{0x0000000000000002L});

}