package minijava;

import java.io.*;

import minijava.ErrorHandler.*;
import minijava.lexer.*;
import minijava.node.*;
import minijava.parser.*;
import minijava.Typechecker.*;

public class Main2 {
    
    public static void main(String[] args){

	ErrorHandler errorHandler = null;

	try{
	    if (args.length != 1) {
		System.err.println("Usage: java Main filename");
		System.exit(1);
	    }

	    String filename = args[0];
	    
	    if (!(filename.substring(filename.length()-5).equals(".java"))) {
		System.err.println ("Filename must have suffix .java");
		return;
	    }

	    String fileBaseName = filename.substring(0,filename.length()-5);

	    Reader in = new FileReader(filename);
	    errorHandler = new ErrorHandler(filename);

	    Lexer l = new Lexer(new PushbackReader(in, 1024));
	    Parser p = new Parser(l);
	    Start start = p.parse();
	    Typechecker typechecker = new Typechecker(start);
	    typechecker.phase1();
	}
	catch(LexerException e) {
	    System.err.println(e);
	    System.err.println(errorHandler.getLongMessage(e.getMessage()));
	}
	catch(ParserException e) {
	    System.err.println(e);
	    System.err.println(errorHandler.getLongMessage(e.getMessage()));
	}
	catch(TypecheckerException e) {
	    System.err.println(e);
	    System.err.println(errorHandler.getLongMessage(e.getMessage()));
	}
	catch(Exception e){
	    throw new RuntimeException(e);
	}
    }
}