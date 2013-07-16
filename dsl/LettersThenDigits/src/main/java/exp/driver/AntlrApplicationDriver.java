package exp.driver;

import java.io.BufferedInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import exp.lexer.LettersThenDigitsLexer;
import exp.parser.annotated.LettersThenDigitsParser;
import exp.parser.annotated.LettersThenDigitsParser.start_return;

public class AntlrApplicationDriver {

	public static void main(final String... args) throws IOException, RecognitionException {
		
		try(final BufferedInputStream bis = new BufferedInputStream
				(AntlrApplicationDriver.class.getResourceAsStream("sample.txt"))) {
			
			// decorate input stream with ANTLR stream
			final CharStream characterStream = new ANTLRInputStream(bis);
			
			// create lexer from input stream
			final LettersThenDigitsLexer lexer = new LettersThenDigitsLexer(characterStream);
			
			// create token stream from lexer for parser
			final TokenStream tokenStream = new CommonTokenStream(lexer);
			
			// create parser from token stream
			final LettersThenDigitsParser parser = new LettersThenDigitsParser(tokenStream);

			// parse and output
			final start_return result = parser.start("Hello!!!");
			System.out.println("Number of Letters: " + result.numLetters);
			System.out.println("Number of Digits: " + result.numDigits);
			
		}
	}
}
