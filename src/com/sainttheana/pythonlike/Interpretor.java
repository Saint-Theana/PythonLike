package com.sainttheana.pythonlike;



import com.sainttheana.pythonlike.antlr4.PythonLikeBaseVisitor;
import com.sainttheana.pythonlike.antlr4.PythonLikeParser;
import com.sainttheana.pythonlike.environment.NestedEnv;
import com.sainttheana.pythonlike.exception.BreakException;
import com.sainttheana.pythonlike.exception.ContinueException;
import com.sainttheana.pythonlike.exception.ErroPointorException;
import com.sainttheana.pythonlike.exception.InvocationEceptionWraper;
import com.sainttheana.pythonlike.exception.ReturnException;
import com.sainttheana.pythonlike.function.AbstractFunction;
import com.sainttheana.pythonlike.function.ScriptFunction;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.lang.reflect.Array;

public class Interpretor extends PythonLikeBaseVisitor<Object>
{
	NestedEnv env;

	HashMap<String,PythonLikeParser.SuiteContext> dic=new HashMap<String,PythonLikeParser.SuiteContext>();


	public Interpretor(NestedEnv e)
	{
		env = e;

	}

	public Interpretor()
	{
		env = new NestedEnv();
	}


	@Override public Object visitProgram(PythonLikeParser.ProgramContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 *
	 */

	private String subActualString(TerminalNode stringLiteral)
	{
		String y = stringLiteral.getText().substring(1, stringLiteral.getText().length() - 1);
		//System.out.println("ooooo "+y);
		//System.out.println("vvvvv "+y.replaceAll("\\\"", "\""));
		return y.replaceAll("\\\\\"", "\"");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitStmt(PythonLikeParser.StmtContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIf_stmt(PythonLikeParser.If_stmtContext ctx)
	{
        List<PythonLikeParser.IfBlockContext> g = ctx.ifBlock();
		for (PythonLikeParser.IfBlockContext one:g)
		{
			Object y =visitExpr(one.quoteExpr().expr());
			if (!(y instanceof Boolean))
			{
				throw new ErroPointorException("if expr must return bool", ctx);
			}
			if ((boolean)y)
			{
				return visitSuite(one.suite());
			}
		}
		if (ctx.suite() != null)
		{
			return visitSuite(ctx.suite());
		}
		return null; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIfBlock(PythonLikeParser.IfBlockContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAssign_stmt(PythonLikeParser.Assign_stmtContext ctx)
	{
		visitAssign(ctx.assign());
		return null;
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitWhile_stmt(PythonLikeParser.While_stmtContext ctx)
	{

		Object y = visitExpr(ctx.expr());
		if (!(y instanceof Boolean))
		{
			throw new ErroPointorException("must return boolean", ctx);
		}
		while ((Boolean)y)
		{
			try
			{
				visitSuite(ctx.suite());
			}
			catch (BreakException e)
			{
				break;
			}
			catch (ContinueException e)
			{
				continue;
			}
			y = visitExpr(ctx.expr());
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFor_stmt(PythonLikeParser.For_stmtContext ctx)
	{

		visitAssign(ctx.assign());
		Object y = visitExpr(ctx.expr());
		if (!(y instanceof Boolean))
		{
			throw new ErroPointorException("must return boolean", ctx);
		}
		while ((Boolean)y)
		{
			try
			{
				visitSuite(ctx.suite());
			}
			catch (BreakException e)
			{
				break;
			}
			visitAssignable(ctx.assignable());
			y = visitExpr(ctx.expr());
		}

		return null; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitBreak_stmt(PythonLikeParser.Break_stmtContext ctx)
	{
		throw new BreakException();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitContinue_stmt(PythonLikeParser.Continue_stmtContext ctx)
	{
		throw new ContinueException();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitReturn_stmt(PythonLikeParser.Return_stmtContext ctx)
	{
		if (ctx.expr() == null)
		{
			throw new ReturnException(null);
		}
		throw new ReturnException(visit(ctx.expr()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExpr_stmt(PythonLikeParser.Expr_stmtContext ctx)
	{
		visitExpr(ctx.expr());
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFunction_stmt(PythonLikeParser.Function_stmtContext ctx)
	{
		ScriptFunction function = new ScriptFunction();//创建函数
		if (ctx.arguments() != null)
		{
	        function.arguments = ctx.arguments().NAME();
		}
		else
		{
			function.arguments = new ArrayList<TerminalNode>();
		}
		function.suite = ctx.suite();
		function.environment = env;
		env.put(ctx.NAME().getText(), function);
		//System.out.println("visitFunctionStatement " + ctx.NAME().getText());
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArguments(PythonLikeParser.ArgumentsContext ctx)
	{
		return visitChildren(ctx);
	}

	
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitForeach_stmt(PythonLikeParser.Foreach_stmtContext ctx) { 
	
		String name =  ctx.NAME().getText();
		Object h=visitExpr(ctx.expr());
		//System.out.println(h.getClass());
		if (h.getClass().isArray())
		{

			for (int i =0;i < Array.getLength(h);i += 1)
			{
				env.put(name, Array.get(h, i));
				try
				{
					visitSuite(ctx.suite());
				}
				catch (BreakException e)
				{
					break;
				}catch(ContinueException e){
					continue;
				}
			}
		}
		else if (List.class.isAssignableFrom(h.getClass()))
		{
			List aaa = (List) h;
			for (int i =0;i < aaa.size();i += 1)
			{
				env.put(name, aaa.get(i));
				try
				{
					visitSuite(ctx.suite());
				}
				catch (BreakException e)
				{
					break;
				}
			}
		}
		else
		{
			throw new ErroPointorException("Foreach must be Array or list", ctx);
		}
		return null;
	
	}
	
	
	@Override public Object visitImport_stmt(PythonLikeParser.Import_stmtContext ctx)
	{
		String className = ctx.classpath().getText();
		//System.out.println("import " + className);
		try
		{
			Class h = Class.forName(className);
			String[] split=className.split("\\.");
			//System.out.println(split[split.length - 1]);
			env.put(split[split.length - 1], h);
			return h;
		}
		catch (ClassNotFoundException e)
		{
			throw new ErroPointorException("class " + className + " not foumd", ctx);
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSuite(PythonLikeParser.SuiteContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitQuoteExpr(PythonLikeParser.QuoteExprContext ctx)
	{

		return visitExpr(ctx.expr());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExpr(PythonLikeParser.ExprContext ctx)
	{
		if (ctx.OPEN_PAREN() != null)//小括号里的
		{
			return visitExpr(ctx.expr(0));
		}
		else if (ctx.OR() != null)
		{
			Object a =visitExpr(ctx.expr(0));
			//System.out.println(a);
			if (!(a instanceof Boolean))
			{
				throw new ErroPointorException("not supported.", ctx);
			}
			Object b=visitExpr(ctx.expr(1));
			if (!(b instanceof Boolean))
			{
				throw new ErroPointorException("not supported.", ctx);
			}
			return (Boolean)a || (Boolean)b;
		}
		else if (ctx.AND() != null)
		{
			Object a =visitExpr(ctx.expr(0));
			//System.out.println(a);
			if (!(a instanceof Boolean))
			{
				throw new ErroPointorException("not supported.", ctx);
			}
			Object b=visitExpr(ctx.expr(1));
			if (!(b instanceof Boolean))
			{
				throw new ErroPointorException("not supported.", ctx);
			}
			return (Boolean)a && (Boolean)b;
		}
		else if (ctx.Reverse() != null)
		{
			Object ret = visitExpr(ctx.expr(0));
			if (!(ret instanceof Boolean))
			{
				throw new ErroPointorException("not supported.", ctx);
			}
			String op = ctx.Reverse().getText();
			switch (op)
			{
				case "!":{
						if (ret instanceof Boolean)
						{
							return !(boolean)ret;
						}
					}
			}
			throw new ErroPointorException("not supported.", ctx);
		}
		else if (ctx.md() != null)
		{
			Object a = visitExpr(ctx.expr(0));
			String op = ctx.md().getText();
			Object b = visitExpr(ctx.expr(1));
			//System.out.println(op);
			switch (op)
			{
				case "*":
					if (a instanceof String || b instanceof String)
					{//其中一个是string 直接拼上去
						throw new ErroPointorException("operation " + a.getClass().getTypeName() + " " + op + " " + b.getClass().getTypeName() + " was not allowed", ctx);
					}
					else if (isNumber(a) && isNumber(b))
					{
						return Calculator.calculateNumberMul(a, b); 

					}
					else
					{//两个未知的，直接拼上去
						throw new ErroPointorException("operation " + a.getClass().getTypeName() + " " + op + " " + b.getClass().getTypeName() + " was not allowed", ctx);
					}
				case "/":
					if (isNumber(a) && isNumber(b))
					{
						return Calculator.calculateNumberDiv(a, b);
					}
					else
					{//两个未知的，直接拼上去
						throw new ErroPointorException("operation " + a.getClass().getTypeName() + " " + op + " " + b.getClass().getTypeName() + " was not allowed", ctx);
					}
			}
			throw new ErroPointorException("not supported.", ctx);
		}
		else if (ctx.as() != null)
		{

			Object a = visitExpr(ctx.expr(0));
			//System.out.println(a);

			String op = ctx.as().getText();
			Object b = visitExpr(ctx.expr(1));
			switch (op)
			{
				case "+":
					if (a instanceof String || b instanceof String)
					{//其中一个是string 直接拼上去
						return a + "" + b;
					}
					else if (isNumber(a) && isNumber(b))
					{
						return Calculator.calculateNumberPlus(a, b);

					}
					else
					{//两个未知的，直接拼上去
						return a + "" + b;
					}
				case "-":
					if (isNumber(a) && isNumber(b))
					{
						return Calculator.calculateNumberReduce(a, b);
					}
			}
			throw new ErroPointorException("not supported.", ctx);
		}
		else if (ctx.cp() != null)
		{
			Object a = visitExpr(ctx.expr(0));
			//System.out.println("fffff" + a);

			Object b = visitExpr(ctx.expr(1));
			//System.out.println("fffff" + b);
			String op = ctx.cp().getText();
			if (a == null || b == null)
			{
				switch (op)
				{
					case "!=":
						return a != b;
					case "==" :
						return a == b;
					default:{
							throw new ErroPointorException("operation " + op + " betwin null and object was not allowed", ctx);
						}
				}
			}
			if (!isNumber(a) || !isNumber(b))
			{
				throw new ErroPointorException("compare betwen " + a.getClass().getTypeName() + " and " + b.getClass().getTypeName() + " was not allowed", ctx);
			}
			BigDecimal l = new BigDecimal(a + "");
			BigDecimal r = new BigDecimal(b + "");
			switch (op)
			{
				case "<":
					return l.compareTo(r) == -1;
				case ">":
					return l.compareTo(r) == 1;
				case ">=":
					return l.compareTo(r) == 1 || l.compareTo(r) == 0;
				case "<=":
					return l.compareTo(r) == -1 || l.compareTo(r) == 0;
				case "!=":
					return l.compareTo(r) != 0;
				case "==" :
					return l.compareTo(r) == 0;
				default:{
						throw new ErroPointorException("operation " + op + " was not allowed", ctx);
					}
			}

		}
		else if (ctx.sufix() != null)
		{
			Object a =visitExpr(ctx.expr(0));

			//System.out.println("cccc" + a);
			PythonLikeParser.SufixContext y=ctx.sufix();
			//System.out.println("sufix " + y.getText());
			if (y.arrayaccess() != null)
			{
				if (a == null)
				{
					throw new ErroPointorException("try to get element from null", ctx);
				}
				if (a.getClass().isArray())
				{
					Object[] h = (Object[]) a;
					Object index=visitExpr(y.arrayaccess().expr());
					//System.out.println("kkkkkkkkkkkk     "+index);
					if (!isNumber(index))
					{
						throw new ErroPointorException("index must be number", ctx);
					}
					if (index instanceof Integer)
					{
						//System.out.println("rrrrrrrr    "+h);
						//System.out.println("rrrrrrrr    "+h);
						//System.out.println("ffffffff    " + h[((Integer)index).intValue()]);
						return h[((Integer)index).intValue()];
					}
					else if (index instanceof Long)
					{
						return h[((Long)index).intValue()];
					}
					else if (index instanceof Short)
					{
						return h[((Short)index).intValue()];
					}
					else if (index instanceof Byte)
					{
						return h[((Byte)index).intValue()];
					}
				}
				else if (a instanceof String)
				{
					Object index=visitExpr(y.arrayaccess().expr());
					if (isNumber(index))
					{
						try
						{
							JSONArray h = new JSONArray((String)a);
							if (index instanceof Integer)
							{

								return h.get(((Integer)index).intValue());
							}
							else if (index instanceof Long)
							{
								return h.get(((Long)index).intValue());
							}
							else if (index instanceof Short)
							{
								return h.get(((Short)index).intValue());
							}
							else if (index instanceof Byte)
							{
								return h.get(((Byte)index).intValue());
							}

						}
						catch (JSONException e)
						{
							throw new ErroPointorException("erro get from json", ctx);
						}
					}
					else if (index instanceof String)
					{
						try
						{
							JSONObject h = new JSONObject((String)a);
							return h.get((String)index);
						}
						catch (JSONException e)
						{
							throw new ErroPointorException("erro get from json", ctx);
						}
					}
					else
					{
						throw new ErroPointorException("try to get element from json but with wrong key type", ctx);
					}
				}
				else if (a instanceof JSONObject)
				{
					Object index=visitExpr(y.arrayaccess().expr());
					if (isNumber(index))
					{

						throw new ErroPointorException("jsonobject cannot index by number", ctx);

					}
					else if (index instanceof String)
					{
						try
						{
							JSONObject h = (JSONObject)a;
							return h.get((String)index);
						}
						catch (JSONException e)
						{
							throw new ErroPointorException("erro get from json", ctx);
						}
					}
					else
					{
						throw new ErroPointorException("try to get element from json but with wrong key type", ctx);
					}
				}
				else if (a instanceof JSONArray)
				{
					Object index=visitExpr(y.arrayaccess().expr());
					if (isNumber(index))
					{
						try
						{
							JSONArray h = (JSONArray)a;
							if (index instanceof Integer)
							{

								return h.get(((Integer)index).intValue());
							}
							else if (index instanceof Long)
							{
								return h.get(((Long)index).intValue());
							}
							else if (index instanceof Short)
							{
								return h.get(((Short)index).intValue());
							}
							else if (index instanceof Byte)
							{
								return h.get(((Byte)index).intValue());
							}

						}
						catch (JSONException e)
						{
							throw new ErroPointorException("erro get from json", ctx);
						}
					}
					else if (index instanceof String)
					{
						throw new ErroPointorException("jsonarray cannot index by string", ctx);

					}
					else
					{
						throw new ErroPointorException("try to get element from json but with wrong key type", ctx);
					}
				}
				else
				{
					throw new ErroPointorException("try to get element from unsupported object type.(supports array and json)", ctx);
				}

			}
			else if (y.member() != null)
			{
				PythonLikeParser.MemberContext member=y.member();
				//System.out.println("member " + member.getText());
				try
				{
					if (member.OPEN_PAREN() != null)
					{//方法调用
						String methodName=member.NAME().getText();
						if (a instanceof Class)//
						{
							List<Object> args = new ArrayList<Object>();
							PythonLikeParser.ValuesContext values=member.values();
							if (values != null)
							{
								for (PythonLikeParser.ExprContext exp:values.expr())
								{
									//System.out.println(exp.getText());
									args.add(visitExpr(exp));
								}
							}
							//Class[] paramtype = new Class[args.size()];
							Object[] param=new Object[args.size()];
							for (int u=0;u < args.size();u += 1)
							{
								//System.out.println(args.get(u));
								//paramtype[u] = args.get(u).getClass();
								param[u] = args.get(u);
							}
							Method perfectMethod= tryFindPerfectMethod(((Class)a), methodName, param, ctx);
							if (perfectMethod == null)
							{
								throw new ErroPointorException("failed to find a perfect match", ctx);
							}
							return perfectMethod.invoke(null, param);
						}
						else
						{
							List<Object> args = new ArrayList<Object>();
							PythonLikeParser.ValuesContext values=member.values();
							Object[] param=new Object[0];
							//Class[] paramtype=new Class[0];
							if (values != null)
							{
								for (PythonLikeParser.ExprContext exp:values.expr())
								{
									Object h =visitExpr(exp);
									//System.out.println(h);
									args.add(h);
								}
							}
							if (args.size() != 0)
							{
								//System.out.println(args.size());
								param = new Object[args.size()];
								//paramtype = new Class[args.size()];
								for (int u=0;u < args.size();u += 1)
								{
									//System.out.println(args.get(u));
									param[u] = args.get(u);
									//paramtype[u] = args.get(u).getClass();
									//System.out.println("arg "+param[u]);
								}
							}

							Method perfectMethod= tryFindPerfectMethod(a.getClass(), methodName, param, ctx);
							if (perfectMethod == null)
							{
								throw new ErroPointorException("failed to find a perfect match", ctx);
							}
							return perfectMethod.invoke(a, param);
						}
					}
					else
					{//成员调用

						String memberName=member.NAME().getText();
						//System.out.println("memberName:  " + memberName);
						if (a instanceof Class)
						{//类的静态成员引用
							Field k=((Class)a).getField(memberName);
							k.setAccessible(true);
							return k.get(null);
						}
						else
						{

							Field k=a.getClass().getField(memberName);
							k.setAccessible(true);
							return k.get(a);
						}
					}
				}
				catch (InvocationTargetException e)
				{
					//e.getCause().printStackTrace();
					throw  new InvocationEceptionWraper(e.getCause());
				}
				catch (SecurityException e)
				{
					e.printStackTrace();
					throw new ErroPointorException(e.getMessage(), ctx);
				}
				catch (NoSuchFieldException e)
				{
					e.printStackTrace();
					throw new ErroPointorException(e.getMessage(), ctx);
				}
				catch (IllegalAccessException e)
				{
					e.printStackTrace();
					throw new ErroPointorException(e.getMessage(), ctx);
				}
				catch (IllegalArgumentException e)
				{
					e.printStackTrace();
					throw new ErroPointorException(e.getMessage(), ctx);
				}
			}
			else if (y.argument() != null)
			{
				if (a == null)
				{
					throw new ErroPointorException("try to call a function that does not exist", ctx);
				}
				//System.out.println("yyyyy");
				List<Object> values = new ArrayList<Object>();
				if (y.argument().values() != null)
				{
					for (PythonLikeParser.ExprContext value:y.argument().values().expr())
					{
						values.add(visit(value));
					}
				}
				return callFunction(a, values.toArray(), ctx);
			}
		}

		else if (ctx.primaryExpr() != null)
		{
			return visitPrimaryExpr(ctx.primaryExpr());
		}
		throw new ErroPointorException("unknown erro", ctx);
	}

	private Method tryFindPerfectMethod(Class currentObject, String methodName, Object[] param, ParserRuleContext ctx)
	{
		List<Method> methods = new ArrayList<Method>();
		for (Method y :((Class)currentObject).getMethods())
		{
			if (y.getName().equals(methodName) && y.getParameterTypes().length == 0 && param.length == 0)
			{
				return y;
			}
			if (y.getName().equals(methodName) && y.getParameterTypes().length == param.length)
			{
				if (trymatchPerfectParam(y.getParameterTypes(), param, ctx))
				{
					return y;
				}
				else if (trymatchParam(y.getParameterTypes(), param, ctx))
				{
					methods.add(y);
				}
			}
		}
		if (methods.size() == 0)
		{
			return null;
		}
		return methods.get(0);
	}


	@Override public Object visitNewobject(PythonLikeParser.NewobjectContext ctx)
	{


		Object y = env.get(ctx.NAME().getText());
		if (y == null)
		{
			throw new ErroPointorException("cannot new an Object by null.", ctx);
		}
		else if (!(y instanceof Class))
		{
			throw new ErroPointorException("Object nust be new by Class.", ctx);
		}
		List<Object> args = new ArrayList<Object>();
		if (ctx.values() != null)
		{
			for (PythonLikeParser.ExprContext a: ctx.values().expr())
			{
				args.add(visit(a));
			}
		}
		try
		{

			//Class[] paramtype = new Class[args.size()];
			Object[] param=new Object[args.size()];
			for (int u=0;u < args.size();u += 1)
			{
				//paramtype[u] = args.get(u).getClass();
				param[u] = args.get(u);

			}
			//System.out.println(param.length);
			//System.out.println("param" + param[0]);


			Constructor perfectConstructor= tryFindPerfectConstructor(((Class)y), param, ctx);
			//System.out.println(perfectConstructor.toGenericString());
			if (perfectConstructor == null)
			{
				throw new ErroPointorException("param does not match any constructor", ctx);
			}
			return perfectConstructor.newInstance(param);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Writer stringWriter = new StringWriter();
			e.printStackTrace(new PrintWriter(stringWriter));
			throw new ErroPointorException("objecrt " + args.get(0) + " failed to create" + stringWriter.toString(), ctx);
		}
	}


	private Constructor tryFindPerfectConstructor(Class class_, Object[] paramtype, ParserRuleContext ctx)
	{
		List<Constructor> methods = new ArrayList<Constructor>();
		for (Constructor y :class_.getConstructors())
		{

			if (y.getParameterTypes().length == paramtype.length)
			{
				if (trymatchPerfectParam(y.getParameterTypes(), paramtype, ctx))
				{
					return y;
				}
				else if (trymatchParam(y.getParameterTypes(), paramtype, ctx))
				{
					methods.add(y);
				}
			}
		}
		if (methods.size() == 0)
		{
			return null;
		}
		return methods.get(0);
	}





	private boolean trymatchParam(Class[] parameterTypes, Object[] param, ParserRuleContext ctx)
	{
		for (int i=0;i < parameterTypes.length;i += 1)
		{
			if (param[i] == null)
			{
				throw new ErroPointorException("cannot find a mathod because parammeter was null", ctx);
			}

			if (parameterTypes[i].getName().equals("int") && param[i].getClass().getName().equals("java.lang.Integer"))
			{
				continue;
			}
			else if (parameterTypes[i].getName().equals("long") && param[i].getClass().getName().equals("java.lang.Long"))
			{
				continue;
			}
			else if (parameterTypes[i].getName().equals("float") && param[i].getClass().getName().equals("java.lang.Float"))
			{
				continue;
			}
			if (!parameterTypes[i].isAssignableFrom(param[i].getClass()))
			{
				return false;
			}
		}
		return true;
	}

	private boolean trymatchPerfectParam(Class<?>[] parameterTypes, Object[] param, ParserRuleContext ctx)
	{

		for (int i=0;i < parameterTypes.length;i += 1)
		{
			if (param[i] == null)
			{
				throw new ErroPointorException("cannot find a mathod because parammeter was null", ctx);
			}
			//System.out.println(parameterTypes[i].getName() + " " + param[i].getClass().getName() + " " + parameterTypes[i].isAssignableFrom(param[i].getClass()));
			if (parameterTypes[i].getName().equals("int") && param[i].getClass().getName().equals("java.lang.Integer"))
			{
				continue;
			}
			else if (parameterTypes[i].getName().equals("long") && param[i].getClass().getName().equals("java.lang.Long"))
			{
				continue;
			}
			else if (parameterTypes[i].getName().equals("float") && param[i].getClass().getName().equals("java.lang.Float"))
			{
				continue;
			}
			if (!parameterTypes[i].getName().equals(param[i].getClass().getName()))
			{

				return false;
			}
		}
		return true;
	}


	public Object callFunction(ScriptFunction h, ParserRuleContext ctx, Object... values)
	{
		//System.out.println(h);
		if (h == null)
		{
			throw new ErroPointorException("try to call a function that does not exist.", ctx);
		}
		else if (!(h instanceof ScriptFunction))
		{
			throw new ErroPointorException("try to call a value that is not a function.", ctx);
		}
		ScriptFunction function =  h;
		//System.out.println(values.length + "");
		//System.out.println(function.arguments.size() + "");
		if (values.length != function.arguments.size())
		{
			throw new ErroPointorException("try to call a function which's parameter count does not match value count.", ctx);
		}
		return function.invoke(values);
	}

	public Object callFunction(String name, Object... values)
	{
		Object h = env.get(name);
		if (h == null)
		{
			throw new RuntimeException("try to call a function " + name + " that does not exist.");
		}
		else if (h instanceof AbstractFunction)
		{
			AbstractFunction function = (AbstractFunction) h;
			//System.out.println(values.length + "");

			if (values.length != function.numOfParameters())
			{
				throw new RuntimeException("try to call a function which's parameter count does not match value count.");
			}
			return function.invoke(values);
		}
		else
		{
			throw new RuntimeException("try to call a value that is not a function.");
		}
	}

	private Object callFunction(Object h, Object[] values, ParserRuleContext ctx)
	{

		if (h instanceof AbstractFunction)
		{
			AbstractFunction function = (AbstractFunction) h;

			if (values.length != function.numOfParameters())
			{
				throw new ErroPointorException("try to call a function which's parameter count does not match value count.", ctx);
			}
			return function.invoke(values);
		}
//		else if (h instanceof JavaFunction)
//		{
//			JavaFunction function = (JavaFunction) h;
//			//System.out.println(values.length + "");
//			//System.out.println(function.arguments.size() + "");
//			if (values.length != function.numOfParameters())
//			{
//				throw new ErroPointorException("try to call a function which's parameter count does not match value count.");
//			}
//			return function.invoke(values);
//		}
		else
		{
			throw new ErroPointorException("try to call a value that is not a function.", ctx);
		}
	}


	private boolean isNumber(Object a)
	{
		return a instanceof Integer || a instanceof Long || a instanceof Short || a instanceof Float || a instanceof Byte || a instanceof Double;
	}

	@Override public Object visitSelfIncrease(PythonLikeParser.SelfIncreaseContext ctx)
	{
		Object b=env.get(ctx.NAME().getText());
		if (b == null)
		{
			throw new ErroPointorException("null cannot self increase", ctx);
		}
		if (isNumber(b))
		{
			Object y =Calculator.calculateNumberPlus(b, 1);
			env.put(ctx.NAME().getText(), y);
		}
		else
		{
			throw new ErroPointorException("only number can self increase", ctx);

		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSelfDecrease(PythonLikeParser.SelfDecreaseContext ctx)
	{ 
		Object b=env.get(ctx.NAME().getText());
		if (b == null)
		{
			throw new ErroPointorException("null cannot self decrease", ctx);
		}
		if (isNumber(b))
		{
			Object y =Calculator.calculateNumberReduce(b, 1);
			env.put(ctx.NAME().getText(), y);
		}
		else
		{
			throw new ErroPointorException("only number can self decrease", ctx);

		}

		return null;
	}

	
	

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSufix(PythonLikeParser.SufixContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMember(PythonLikeParser.MemberContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArgument(PythonLikeParser.ArgumentContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArrayaccess(PythonLikeParser.ArrayaccessContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitValues(PythonLikeParser.ValuesContext ctx)
	{
		return visitChildren(ctx);
	}



	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitPrimaryExpr(PythonLikeParser.PrimaryExprContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVariableExpr(PythonLikeParser.VariableExprContext ctx)
	{
		if (ctx.NAME() != null)
		{
			return env.get(ctx.NAME().getText());
		}
		else if (ctx.NUMBER() != null)
		{
			return Long.parseLong(ctx.NUMBER().getText());
		}
		else if (ctx.NullPoint() != null)
		{
			return null;
		}
		else if (ctx.STRING() != null)
		{
			return subActualString(ctx.STRING());
		}
		else if (ctx.Boolean() != null)
		{
			return Boolean.parseBoolean(ctx.Boolean().getText());
		}
		else if (ctx.array() != null)
		{
			if (ctx.array().element() == null)
			{
				return new Object[0];
			}
			Object[] objs = new Object[ctx.array().element().expr().size()];
			int count =0;
			Object currentObject=null;
			for (PythonLikeParser.ExprContext expression:ctx.array().element().expr())
			{
				Object newobj = visitExpr(expression);
				if (currentObject == null)
				{
					currentObject = newobj;
					objs[count] = newobj;
				}
				else if (!currentObject.getClass().isInstance(newobj))
				{
					throw new IllegalStateException("elememt must be the same type");
				}
				else
				{
					objs[count] = newobj;
					//System.out.println(newobj);
				}
			    currentObject = newobj;
				count += 1;
			}
			//System.out.println("qqqqqqqqq     "+objs.length);
			return objs;
		}
		//未完成
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAssign(PythonLikeParser.AssignContext ctx)
	{
		env.put(ctx.NAME().getText(), visitExpr(ctx.expr()));
		return null;
	}



	@Override public Object visitAssignIncrease(PythonLikeParser.AssignIncreaseContext ctx)
	{ 
		Object b=env.get(ctx.NAME().getText());
		if (b == null)
		{
			throw new ErroPointorException("null cannot self increase", ctx);
		}
		if (isNumber(b))
		{
			Object a =visitExpr(ctx.expr());
			if (isNumber(a))
			{
				Object y =Calculator.calculateNumberPlus(b, a);
			    env.put(ctx.NAME().getText(), y);
				return null;
			}
			else
			{
				Object y =b + "" + a;
			    env.put(ctx.NAME().getText(), y);
				return null;
			}

		}
		else
		{
			Object a =visitExpr(ctx.expr());
			Object y =b + "" + a;
			env.put(ctx.NAME().getText(), y);
			return null;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAssignDecrease(PythonLikeParser.AssignDecreaseContext ctx)
	{
		Object b=env.get(ctx.NAME().getText());
		if (b == null)
		{
			throw new ErroPointorException("null cannot self decrease", ctx);
		}
		if (isNumber(b))
		{
			Object a =visitExpr(ctx.expr());
			if (isNumber(a))
			{
				Object y =Calculator.calculateNumberReduce(b, a);
			    env.put(ctx.NAME().getText(), y);
				return null;
			}
			else
			{
				throw new ErroPointorException("only can decrease a number", ctx);
			}

		}
		else
		{
			throw new ErroPointorException("only number can self decrease", ctx);
		}
	}




	@Override public Object visitArray(PythonLikeParser.ArrayContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitElement(PythonLikeParser.ElementContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitMd(PythonLikeParser.MdContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAs(PythonLikeParser.AsContext ctx)
	{
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitCp(PythonLikeParser.CpContext ctx)
	{
		return visitChildren(ctx);
	}





}



