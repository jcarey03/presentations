package exp.driver;

import java.io.BufferedInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import exp.lexer.DrivingDirectionsLexer;
import exp.model.DirectionList;
import exp.parser.annotated.DrivingDirectionsParser;

public class AntlrApplicationDriver {

	public static void main(final String... args) throws IOException, RecognitionException {
		
		try(final BufferedInputStream bis = new BufferedInputStream(
				AntlrApplicationDriver.class.getResourceAsStream("directions.txt"))) {
			
			// decorate input stream with ANTLR stream
			final CharStream characterStream = new ANTLRInputStream(bis);
			
			// create lexer from input stream
			final DrivingDirectionsLexer lexer = new DrivingDirectionsLexer(characterStream);
			
			// create token stream from lexer for parser
			final TokenStream tokenStream = new CommonTokenStream(lexer);
			
			// create parser from token stream
			final DrivingDirectionsParser parser = new DrivingDirectionsParser(tokenStream);
			
			// parse and output
			final DirectionList directionList = parser.directions();
			System.out.println(directionList.toString());
			
		}
	}
}
