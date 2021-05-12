package com.sainttheana.pythonlike;

import org.antlr.v4.runtime.ANTLRErrorListener;
import java.util.BitSet;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Parser;

public class ErroListener implements ANTLRErrorListener
{

	@Override
	public void syntaxError(Recognizer<?, ?> p1, Object p2, int p3, int p4, String p5, RecognitionException p6)
	{
		System.out.println("at line "+p6.getOffendingToken().getLine()+" : "+p6.getOffendingToken().getText()+ " expecting "+p6.getExpectedTokens().toString(p1.getTokenNames()));
		throw new RuntimeException();
	}

	@Override
	public void reportAmbiguity(Parser p1, DFA p2, int p3, int p4, boolean p5, BitSet p6, ATNConfigSet p7)
	{
	}

	@Override
	public void reportAttemptingFullContext(Parser p1, DFA p2, int p3, int p4, BitSet p5, ATNConfigSet p6)
	{
	}

	@Override
	public void reportContextSensitivity(Parser p1, DFA p2, int p3, int p4, int p5, ATNConfigSet p6)
	{
	}
	
}
