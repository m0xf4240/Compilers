package minijava.Typechecker;

import java.util.List;
import minijava.Type.Type;
import minijava.node.Token;


public class Method {
	
	public Type returnType;
	public List<Type> paramTypes;
	Token tok;
	
	public Method(Type returnType, List<Type> paramTypes, Token tok){
		this.returnType=returnType;
		this.paramTypes=paramTypes;
		this.tok=tok;
	}

	public Type getReturnType() {
		return returnType;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}

	public List<Type> getParamTypes() {
		return paramTypes;
	}

	public void setParamTypes(List<Type> paramTypes) {
		this.paramTypes = paramTypes;
	}

	public Token getTok() {
		return tok;
	}

	public void setTok(Token tok) {
		this.tok = tok;
	}

	@Override
	public String toString() {
		return "Method [returnType=" + returnType + ", tok=" + tok + ", paramTypes=" + paramTypes + "]";
	}
}

	
