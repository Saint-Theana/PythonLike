package com.sainttheana.pythonlike;



import com.sainttheana.pythonlike.antlr4.PythonLikeLexer;
import com.sainttheana.pythonlike.antlr4.PythonLikeParser;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main
{
	public static void main(String[] k) throws IOException, ClassNotFoundException
	{
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("test.py"));
        PythonLikeLexer lexer = new PythonLikeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonLikeParser parser = new PythonLikeParser(tokens);
		//parser.removeErrorListeners();
		//parser.addErrorListener(new ErroListener());
		ParseTree tree = parser.program();
		Interpretor  y = new Interpretor();
		y.visit(tree);
		y.callFunction("main",((Object)k));

//		MyListener listener = new MyListener();
//        // The .program() method is the root node of the grammar specified in
//        // the .g4 file.
//        
//		ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(listener , tree);
//		InterpreterVisitor y = new InterpreterVisitor();
//		y.visit(tree);
//		
		

//		CodeBuilder sb = new CodeBuilder();
		lebel1:for (Token token:tokens.getTokens())
		{
			//System.out.println(token.toString());
		}
//			switch (token.getType())
//			{
//				case PythonLikeLexer.Semicolon:
//					sb.append(";\n");
//					sb.insertIdent();
//					continue lebel1;
//				case PythonLikeLexer.LeftBigQuote:
//					sb.append("\n");
//					sb.insertIdent();
//					sb.append("{");
//					sb.append("\n");
//					sb.increaseIdent(1);
//					sb.insertIdent();
//					continue lebel1;
//				case PythonLikeLexer.RightBigQuote:
//					sb.decreaseIdent(1);
//					sb.deleteIdent(1);
//					sb.append("}");
//					sb.append("\n");
//					if(sb.ident()==0){
//						sb.append("\n");
//					}
//					sb.insertIdent();
//					continue lebel1;
//				case PythonLikeLexer.WhiteSpace:
//					continue lebel1;
////				case PythonLikeLexer.EOL:
////					continue lebel1;
////				case PythonLikeLexer.LineComment:
////					sb.append(token.getText() + "\n");
////					sb.insertIdent();
////					continue lebel1;
////				case PythonLikeLexer.Else_If:
////					sb.append("else if");
////					continue;
////				case PythonLikeLexer.Function:
////					sb.append("\nfunction ");
////					continue;
////				case PythonLikeLexer.IMPORT:
////					sb.append("import ");
////					continue;
//					
//			}
//			sb.append(token.getText());
//		}
//
		//System.out.println(sb.toString());

		//System.exit(0);




	
		
	}


	
	
	
	
	static class CodeBuilder
	{
		private StringBuilder sb;

		private int ident;
		
		public CodeBuilder(){
			sb=new StringBuilder();
			ident=0;
		}

		public int ident(){
			return ident;
		}
		
		public void append(String p0)
		{
			sb.append(p0);
		}
		
		
		public void increaseIdent(int ident){
			this.ident+=ident;
		}
		
		public void decreaseIdent(int ident){
			this.ident-=ident;
		}
		
		public void insertIdent(){
			sb.append(createIdent(ident));
		}
		
		public void deleteIdent(int count){
			sb.delete(sb.length()-count*4,sb.length());
		}

		@Override
		public String toString()
		{
			return sb.toString();
		}
		
		
		
		private String createIdent(int count)
		{
			//System.out.println(count);
			String g="";
			int i =0;
			while (i < count)
			{
				g += "    ";
				i += 1;
			}
			return g;
		}
	}
}
