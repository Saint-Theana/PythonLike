package com.sainttheana.pythonlike.function;


import com.sainttheana.pythonlike.Interpretor;
import com.sainttheana.pythonlike.antlr4.PythonLikeParser;
import com.sainttheana.pythonlike.environment.NestedEnv;
import com.sainttheana.pythonlike.exception.ReturnException;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ScriptFunction extends AbstractFunction
{

	public PythonLikeParser.SuiteContext suite;


	@Override public Object invoke(Object[] values)
	{
		//vxscriptParser.
		NestedEnv functionenv=new NestedEnv(environment);
		int index =0;
		for(Object value:values){
			functionenv.put(arguments.get(index).getText(),value);
			index+=1;
		}
		Interpretor h = new Interpretor(functionenv);
		try{
		    h.visitSuite(suite);
		}catch(ReturnException e){
			return e.obj;
		}
		return null;
	}

	

	@Override
	public int numOfParameters()
	{
		return arguments.size();
	}
	

	public List<TerminalNode> arguments;

	
	public NestedEnv environment;
	
	public ScriptFunction(){
		
	}

	
	
}
