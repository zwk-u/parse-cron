// Generated from D:/tools/workspace/demo/src/main/java/com/zwk/cron\Cron.g4 by ANTLR 4.9.1
package com.zwk.cron;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CronParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CronVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CronParser#cron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCron(CronParser.CronContext ctx);
	/**
	 * Visit a parse tree produced by the {@code starExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarExp(CronParser.StarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionExp(CronParser.QuestionExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastExp(CronParser.LastExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExp(CronParser.SetExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExp(CronParser.IntervalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stepExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepExp(CronParser.StepExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code workDayExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkDayExp(CronParser.WorkDayExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashExp(CronParser.HashExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CronParser#last}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(CronParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by {@link CronParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(CronParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link CronParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(CronParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CronParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(CronParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CronParser#workDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWorkDay(CronParser.WorkDayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CronParser#hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash(CronParser.HashContext ctx);
}
