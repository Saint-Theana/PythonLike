package com.sainttheana.pythonlike.exception;

import org.antlr.v4.runtime.ParserRuleContext;

public class ErroPointorException extends RuntimeException
{
	public ErroPointorException(String in,ParserRuleContext ctx){
		super(in+" \nat: line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+" "+ctx.getText());
		
	}
}
