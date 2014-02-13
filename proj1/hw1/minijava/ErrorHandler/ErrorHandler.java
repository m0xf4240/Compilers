package minijava.ErrorHandler;
//import minijava.lexer.*;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//import minijava.node.*;

public class ErrorHandler {

    String filename;

    public ErrorHandler (String filename) {
	this.filename=filename;
    }

    /*=====================================
      Prints more informative error message
      ====================================*/
    public String getLongMessage(String s) {

	System.out.println("\nError during parsing: " +s);
	int end = s.indexOf("]");
	String[] markers = s.substring(1,end).split(",");
	int line = Integer.valueOf(markers[0]);
	int column = Integer.valueOf(markers[1]);
	System.out.println("Error was found on Line "+line+", Column "+column);
       
	try {
	    System.out.println(filename);
	    BufferedReader file = new BufferedReader(new FileReader(filename));
	    int i = 0;
	    String errorLine=null;
	    while (i<line) {
		errorLine=file.readLine();
		i++;
	    }
	    String temp = errorLine;
	    while (temp.startsWith("\t")) {
		    column=column+5;
		    temp=temp.substring(1,errorLine.length());
	    }
	    System.out.println(errorLine);
	    String mark=new String(" ");
	    i=0;
	    while (i<column) {
		mark = mark.concat(" ");
		i++;
	    }	    
	    mark = mark.concat("^");
	    System.out.println(mark);
	}
	catch (IOException e) {
	    System.out.println(e);
	}
		
	return "BREAK";
    }
}
