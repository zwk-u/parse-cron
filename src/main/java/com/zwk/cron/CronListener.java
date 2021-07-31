// Generated from D:/tools/workspace/demo/src/main/java/com/zwk/cron\Cron.g4 by ANTLR 4.9.1
package com.zwk.cron;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CronParser}.
 */
public interface CronListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CronParser#cron}.
	 * @param ctx the parse tree
	 */
	void enterCron(CronParser.CronContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#cron}.
	 * @param ctx the parse tree
	 */
	void exitCron(CronParser.CronContext ctx);
	/**
	 * Enter a parse tree produced by the {@code starExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterStarExp(CronParser.StarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code starExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitStarExp(CronParser.StarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterQuestionExp(CronParser.QuestionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitQuestionExp(CronParser.QuestionExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lastExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterLastExp(CronParser.LastExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lastExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitLastExp(CronParser.LastExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterSetExp(CronParser.SetExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitSetExp(CronParser.SetExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExp(CronParser.IntervalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExp(CronParser.IntervalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stepExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterStepExp(CronParser.StepExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stepExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitStepExp(CronParser.StepExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code workDayExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterWorkDayExp(CronParser.WorkDayExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code workDayExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitWorkDayExp(CronParser.WorkDayExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void enterHashExp(CronParser.HashExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashExp}
	 * labeled alternative in {@link CronParser#common}.
	 * @param ctx the parse tree
	 */
	void exitHashExp(CronParser.HashExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CronParser#last}.
	 * @param ctx the parse tree
	 */
	void enterLast(CronParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#last}.
	 * @param ctx the parse tree
	 */
	void exitLast(CronParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CronParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(CronParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(CronParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link CronParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(CronParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(CronParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CronParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(CronParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(CronParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CronParser#workDay}.
	 * @param ctx the parse tree
	 */
	void enterWorkDay(CronParser.WorkDayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#workDay}.
	 * @param ctx the parse tree
	 */
	void exitWorkDay(CronParser.WorkDayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CronParser#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(CronParser.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link CronParser#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(CronParser.HashContext ctx);
}
