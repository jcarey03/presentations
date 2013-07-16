package exp.driver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;

import exp.lexer.SimpleScriptLexer;
import exp.walker.SimpleScriptWalker;

public class AntlrApplicationDriver {

	public static void main(final String... args) throws IOException, RecognitionException {

		final String script = "calc.txt";
//		final String script = "volume.txt";
//		final String script = "loan.txt";
		
		try(final BufferedInputStream bis = new BufferedInputStream(
				AntlrApplicationDriver.class.getResourceAsStream(script))) {
			
			// create token stream from lexed input stream for parser
			final CommonTokenStream tokenStream = createTokenStream(bis);
			
			///////////////////////
			// Parsed Token List //
			///////////////////////
			
			// create one-dimensional tree (e.g., list) of parsed tokens
			final Tree parsedTokenList = createParsedTokenList(tokenStream);
			
			// output parsed token list
			System.out.println(String.format("Parsed Tokens:\n  %s\n", parsedTokenList.toStringTree()));
			
			// reset token stream so it can be parsed again
			tokenStream.reset();
			
			/////////
			// AST //
			/////////
			
			// create abstract syntax tree
			final Tree ast = createAst(tokenStream);
			
			// output AST
			System.out.println(String.format("Abstract Syntax Tree:\n  %s\n", ast.toStringTree()));

			////////////
			// Walker //
			////////////
			
			// create walker
			final SimpleScriptWalker walker = createWalker(ast);
	
			// initialize input arguments and walk
			final Map<String, Double> constants = new HashMap<>();
			constants.put("PI", Math.PI);
			final double result = walker.script(constants);
			
			// output result of walking
			System.out.println(String.format("Evaluation Result:\n  %f", result));

		}
	}
	
	private static CommonTokenStream createTokenStream(final InputStream is) throws IOException {
		
		// decorate input stream with ANTLR stream
		final CharStream characterStream = new ANTLRInputStream(is);

		// create lexer from input stream
		final SimpleScriptLexer lexer = new SimpleScriptLexer(characterStream);
		
		// create token stream from lexer for parser
		return new CommonTokenStream(lexer);
		
	}
	
	private static Tree createParsedTokenList(final CommonTokenStream tokenStream) throws RecognitionException {
		
		// create "raw" parser from token stream
		final exp.parser.raw.SimpleScriptParser rawParser = new exp.parser.raw.SimpleScriptParser(tokenStream);
		
		// return token list as a one-dimensional tree
		return  (Tree) rawParser.script().getTree();
		
	}

	private static Tree createAst(final CommonTokenStream tokenStream) throws RecognitionException {
		
		// create "annotated" parser from token stream
		final exp.parser.annotated.SimpleScriptParser parser = new exp.parser.annotated.SimpleScriptParser(tokenStream);
		
		// return ast
		return (Tree) parser.script().getTree();
		
	}
	
	private static SimpleScriptWalker createWalker(final Tree ast) {
		
		// create node stream from AST for walker
		final TreeNodeStream nodeStream = new CommonTreeNodeStream(ast);
		
		// create walker
		return new SimpleScriptWalker(nodeStream);
		
	}
	
}
