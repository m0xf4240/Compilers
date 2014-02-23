package minijava.Typechecker;

import minijava.node.*;
import minijava.Type.*;
import java.util.*;

public class Typechecker {

	Start root;

	HashMap<String,Type> typeMap;
	HashMap<String,Var>  classVarMap;
	List<Method>         methodList;

	public Typechecker (Start s) {
		root = s;

		typeMap = new HashMap<String,Type>();
		typeMap.put ("int", Type.intType);
		typeMap.put ("String", Type.stringType);
		typeMap.put ("void", Type.voidType);
		typeMap.put ("boolean", Type.booleanType);

		classVarMap = new HashMap<String,Var>();
		methodList = new LinkedList<Method>();
	}

	public void phase1() {
		(new Phase1(this)).process(root);
	}

	public void createClassVar(String name, Type type, Token tok) {

		if (type.equals(this.typeMap.get("void"))){
			throw new TypecheckerException(tok, "void is an invalid type for the variable "+name);
		}

		if (this.classVarMap.get(name)!=null){
			throw new TypecheckerException(tok, "Duplicate variable "+name);	
		}	

		this.classVarMap.put(name, new Var(type, tok));
	}

	public void createMethod(String name, Type returnType, List<Type> paramTypes, Token tok) {
		for (Type t:paramTypes){
			if (t.equals(this.typeMap.get("void"))){
				throw new TypecheckerException(tok, "void is an invalid type for a parameter of the method "+name);
			}
		}
		Method thisMethod = new Method(returnType, paramTypes, tok);
		Method[] methodArray = methodList.toArray(new Method[methodList.size()]);

		for (int i=0; i<methodArray.length; i++){
			if (thisMethod.toString().equals(methodArray[i].toString())){
				throw new TypecheckerException(tok, "Duplicate method "+thisMethod.toString());
			}
		}

		this.methodList.add(thisMethod);
	}

	public Type getType(AType aType) {
		Token id = aType.getId();
		int emptydim = aType.getEmptydim().size();
		//case 1: primitive
		//This only gets the base type, ignoring dim wrt arrays
		Type rType = this.typeMap.get(aType.getId().getText()); //rType is Type to return
		Type baseType = this.typeMap.get(aType.getId().getText()); 	
		//case 2: new simple Type
		if (rType==null){ //TODO:edit here to allow custom classes.
			throw new TypecheckerException(aType.getId(), "You cannot create a new class Type.");
		}
		//case 3: existing ArrayType with existing base Type
		// this will be handled with a trivial replacement in case 4 in makeArrayType()
		String s = aType.toString().trim()+" ";
		//case 4: new ArrayType with existing base Type
		if (emptydim != 0){ // recursively make smaller dimensioned arrays bc int[][] is just an array of int[]
			if (baseType.equals(this.typeMap.get("void"))){ //void array is impossible
				throw new TypecheckerException(aType.getId(), aType+"is an invalid type");	
			}
			for (int i=1; i<=emptydim; i++){		
				rType = makeArrayType(baseType,i);
			}		
		}
		//case 5: new ArrayType with new base Type
		//throw error, see case 3
		//case 6: existing ArrayType with new base Type
		//not possible
		return rType;
	}
	public Type getType(TId idToken) {
		Type rType = this.typeMap.get(idToken.toString().trim()); //returnType
		if (rType == null){
			throw new TypecheckerException(idToken, idToken+"cannot be resolved to a type");			
		}
		return rType;
	}

	public Type makeArrayType(Type t, int ed) {
		ArrayType newType = new ArrayType(t,ed);
		typeMap.put(newType.toString(),newType); //if this already exists, it gets replaced trivially	
		return newType;
	}

}
