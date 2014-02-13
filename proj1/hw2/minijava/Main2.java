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
	    System.out.println("[M1]");
	   /* Token t;
	    do {
	    	t = l.next();
	    } while (!(t instanceof EOF));*/
	    System.out.println("[M2]"+l);
	    Parser p = new Parser(l);
	    
	    System.out.println("[M3]"+p);
	    Start start = p.parse();
	    System.out.println("[M4]"+start);
	    System.out.println("[M4]"+start.getPProgram());
	    System.out.println("[M4P]"+((AProgram)start.getPProgram()).getPublic());
	    System.out.println("[M4C]"+((AProgram)start.getPProgram()).getClasstok());
	    System.out.println("[M4]"+((AProgram)start.getPProgram()).getId());
	    System.out.println("[M4L]"+((AProgram)start.getPProgram()).getLbrace());
	    //System.out.println("[M4M]"+((AProgram)start.getPProgram()).getMaindecl());
	    System.out.print("[M4M]");
	    for (PMaindecl e:((AProgram)start.getPProgram()).getMaindecl()){
	    	System.out.println("\t"+e);
	    }
	    System.out.println("[M4R]"+((AProgram)start.getPProgram()).getRbrace());
	    System.out.println("[M4E]"+start.getEOF());
	    Typechecker typechecker = new Typechecker(start);
	    System.out.println("[M5]"+typechecker);
	    typechecker.phase1();
	    
	    System.out.println("[M6]"+start.getEOF().getLine());
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