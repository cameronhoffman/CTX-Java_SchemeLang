// Generated from /Users/phil/NetBeansProjects/Calc/Expr2.g4 by ANTLR 4.2.2

package calc;
import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Expr2Parser}.
 */
public interface Expr2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Expr2Parser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(@NotNull Expr2Parser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(@NotNull Expr2Parser.AtomExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link Expr2Parser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(@NotNull Expr2Parser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(@NotNull Expr2Parser.EvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Expr2Parser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(@NotNull Expr2Parser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(@NotNull Expr2Parser.MultiplyExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link Expr2Parser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(@NotNull Expr2Parser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr2Parser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(@NotNull Expr2Parser.AdditionExpContext ctx);
}