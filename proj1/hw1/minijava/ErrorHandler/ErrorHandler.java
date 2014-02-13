package minijava.ErrorHandler;
import minijava.lexer.*;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PushbackReader;

import minijava.node.*;

public class ErrorHandler {

    String filename;

    public ErrorHandler (String filename) {
		this.filename=filename;
    }

    public String getLongMessage(String s) {
		String[] locus = s.replaceAll("(?i)(\\[)(.+?)(\\])(.+)", "$2").split(",");//regex to extract the numbers inside the brackets
		System.out.println("The error was detected at line "+locus[0]+", column "+locus[1]+".\nHere is line "+locus[0]+". The caret mark (^) indicates where the error was detected.");
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));// the FileReader constructor can take a String filename
			String line="";
			for (int i=0 ; i<Integer.parseInt(locus[0]); i++){//get line locus[0]
				line=reader.readLine();
			}
			System.out.println(line.replaceAll("(\\t)", " "));//replace tabs
			System.out.println(String.format("%"+locus[1]+"s","^"));//draw caret
		} catch (Exception e){
			System.out.println("Error reading File "+filename+".");
		}
		throw new UnsupportedOperationException();
    }
}
