// Generated from PythonLike.g4 by ANTLR 4.8

package com.sainttheana.pythonlike.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonLikeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonLikeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonLikeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PythonLikeParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonLikeParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(PythonLikeParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PythonLikeParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PythonLikeParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PythonLikeParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#foreach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_stmt(PythonLikeParser.Foreach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PythonLikeParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(PythonLikeParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PythonLikeParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PythonLikeParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(PythonLikeParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#selfcrease_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfcrease_stmt(PythonLikeParser.Selfcrease_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assigndecrese_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigndecrese_stmt(PythonLikeParser.Assigndecrese_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assignincrese_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignincrese_stmt(PythonLikeParser.Assignincrese_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(PythonLikeParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PythonLikeParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PythonLikeParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#quoteExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoteExpr(PythonLikeParser.QuoteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(PythonLikeParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PythonLikeParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assignIncrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIncrease(PythonLikeParser.AssignIncreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#assignDecrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDecrease(PythonLikeParser.AssignDecreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PythonLikeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#sufix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSufix(PythonLikeParser.SufixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(PythonLikeParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#variableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(PythonLikeParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#newobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewobject(PythonLikeParser.NewobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PythonLikeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PythonLikeParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#selfIncrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfIncrease(PythonLikeParser.SelfIncreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#selfDecrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfDecrease(PythonLikeParser.SelfDecreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(PythonLikeParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonLikeParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#arrayaccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayaccess(PythonLikeParser.ArrayaccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#classpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasspath(PythonLikeParser.ClasspathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(PythonLikeParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#md}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMd(PythonLikeParser.MdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(PythonLikeParser.AsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonLikeParser#cp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp(PythonLikeParser.CpContext ctx);
}