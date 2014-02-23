package minijava.Typechecker;

import minijava.Type.Type;
import minijava.node.Token;

public class Var {

	public Type type;
	public Token tok;
	
	/**
	 * 
	 * @param type
	 * @param tok
	 */
	public Var(Type type, Token tok) {
		this.type=type;
		this.tok=tok;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Token getTok() {
		return tok;
	}

	public void setTok(Token tok) {
		this.tok = tok;
	}

	@Override
	public String toString() {
		return "Var [type=" + type + ", tok=" + tok + "]";
	}
	
}
