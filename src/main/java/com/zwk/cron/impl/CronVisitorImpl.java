package com.zwk.cron.impl;

import com.zwk.cron.*;

public class CronVisitorImpl extends CronBaseVisitor<CronExpression> {

    private CronExpressionContext context = new CronExpressionContext();
    private TimeType timeType;


    @Override
    public CronExpression visitCron(CronParser.CronContext ctx) {
        visit(ctx.second, TimeType.SECOND);
        visit(ctx.minute, TimeType.MINUTE);
        visit(ctx.hour, TimeType.HOUR);
        visit(ctx.dayOfMonth, TimeType.DAY_OF_MONTH);
        visit(ctx.month, TimeType.MONTH);
        visit(ctx.dayOfWeek, TimeType.DAY_OF_WEEK);
        if (ctx.year != null) {
            visit(ctx.year, TimeType.YEAR);
        }
        context.check();
        return null;
    }

    @Override
    public CronExpression visitSetExp(CronParser.SetExpContext ctx) {
        return new SetCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitStarExp(CronParser.StarExpContext ctx) {
        return new StarCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitQuestionExp(CronParser.QuestionExpContext ctx) {
        if (!(this.timeType == TimeType.DAY_OF_MONTH || this.timeType == TimeType.DAY_OF_WEEK)) {
            throw new RuntimeException("only day of month or day of week can be '?'");
        }
        return new QuestionCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitIntervalExp(CronParser.IntervalExpContext ctx) {
        return new IntervalCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitStepExp(CronParser.StepExpContext ctx) {
        return new StepCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitLastExp(CronParser.LastExpContext ctx) {
        return new LastCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitWorkDayExp(CronParser.WorkDayExpContext ctx) {
        return new WorkDayCronExpression(this.timeType, ctx.getText(), this.context);
    }

    @Override
    public CronExpression visitHashExp(CronParser.HashExpContext ctx) {
        return new HashCronExpression(this.timeType, ctx.getText(), this.context);
    }

    public void visit(CronParser.CommonContext ctx, TimeType type) {
        this.timeType = type;
        switch (type) {
            case SECOND:
                context.setSecondCronExpression(visit(ctx));
                break;
            case MINUTE:
                context.setMinuteCronExpression(visit(ctx));
                break;
            case HOUR:
                context.setHourCronExpression(visit(ctx));
                break;
            case DAY_OF_MONTH:
                context.setDayOfMonthCronExpression(visit(ctx));
                break;
            case MONTH:
                context.setMonthCronExpression(visit(ctx));
                break;
            case DAY_OF_WEEK:
                context.setDayOfWeekCronExpression(visit(ctx));
                break;
            case YEAR:
                context.setYearCronExpression(visit(ctx));
                break;
        }
    }

    public CronExpressionContext getContext() {
        return context;
    }
}
