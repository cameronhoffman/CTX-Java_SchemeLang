// Generated from /Users/phil/NetBeansProjects/Calc/Expr2.g4 by ANTLR 4.2.2

package calc;
import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Expr2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Expr2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Expr2Parser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(@NotNull Expr2Parser.AtomExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link Expr2Parser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(@NotNull Expr2Parser.EvalContext ctx);

	/**
	 * Visit a parse tree produced by {@link Expr2Parser#multiplyExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExp(@NotNull Expr2Parser.MultiplyExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link Expr2Parser#additionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExp(@NotNull Expr2Parser.AdditionExpContext ctx);
}