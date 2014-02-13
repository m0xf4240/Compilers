package minijava.Typechecker;
import minijava.node.Token;

public class TypecheckerException extends RuntimeException {

    TypecheckerException (Token t, String s) {

	super ("[" + t.getLine() + "," + t.getPos() + "] " + s);

    }
}