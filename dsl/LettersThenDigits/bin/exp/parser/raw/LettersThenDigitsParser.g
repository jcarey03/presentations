parser grammar LettersThenDigitsParser;

options {
  tokenVocab = LettersThenDigitsLexer;
}

@header {
  package exp.parser.raw;
}

start
    :
    LETTER+ DIGIT*
    ;  