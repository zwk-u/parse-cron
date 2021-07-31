package com.zwk.cron;

import com.zwk.cron.impl.CronVisitorImpl;
import com.zwk.cron.impl.QuestionCronExpression;
import com.zwk.cron.impl.StarCronExpression;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

public class CronExpressionContext {
    private String cron;
    private CronExpression start;
    private CronExpression secondCronExpression;
    private CronExpression minuteCronExpression;
    private CronExpression hourCronExpression;
    private CronExpression dayOfMonthCronExpression;
    private CronExpression monthCronExpression;
    private CronExpression dayOfWeekCronExpression;
    private CronExpression yearCronExpression;

    public String getCron() {
        if (cron == null) {
            StringJoiner joiner = new StringJoiner(" ");
            joiner.add(secondCronExpression.getExpr());
            joiner.add(minuteCronExpression.getExpr());
            joiner.add(hourCronExpression.getExpr());
            joiner.add(dayOfMonthCronExpression.getExpr());
            joiner.add(monthCronExpression.getExpr());
            joiner.add(dayOfWeekCronExpression.getExpr());
            if (yearCronExpression != null) {
                joiner.add(yearCronExpression.getExpr());
            }
            cron = joiner.toString();
        }
        return cron;
    }

    public void setSecondCronExpression(CronExpression secondCronExpression) {
        this.secondCronExpression = secondCronExpression;
    }

    public void setMinuteCronExpression(CronExpression minuteCronExpression) {
        this.minuteCronExpression = minuteCronExpression;
    }

    public void setHourCronExpression(CronExpression hourCronExpression) {
        this.hourCronExpression = hourCronExpression;
    }

    public void setDayOfMonthCronExpression(CronExpression dayOfMonthCronExpression) {
        this.dayOfMonthCronExpression = dayOfMonthCronExpression;
    }

    public void setMonthCronExpression(CronExpression monthCronExpression) {
        this.monthCronExpression = monthCronExpression;
    }

    public void setDayOfWeekCronExpression(CronExpression dayOfWeekCronExpression) {
        this.dayOfWeekCronExpression = dayOfWeekCronExpression;
    }

    public void setYearCronExpression(CronExpression yearCronExpression) {
        this.yearCronExpression = yearCronExpression;
    }

    public void check() {
        if (dayOfWeekCronExpression instanceof StarCronExpression
                && dayOfMonthCronExpression instanceof StarCronExpression) {
            throw new RuntimeException("day of month or day of week both was '*'");
        }
        if (dayOfWeekCronExpression instanceof QuestionCronExpression
                && dayOfMonthCronExpression instanceof QuestionCronExpression) {
            throw new RuntimeException("day of month or day of week both was '?'");
        }
        start = monthCronExpression;
        secondCronExpression.setParent(minuteCronExpression);
        minuteCronExpression.setParent(hourCronExpression);
        minuteCronExpression.setChild(secondCronExpression);
        hourCronExpression.setChild(minuteCronExpression);
        if (dayOfMonthCronExpression instanceof StarCronExpression
                || dayOfMonthCronExpression instanceof QuestionCronExpression) {
            hourCronExpression.setParent(dayOfWeekCronExpression);
            dayOfWeekCronExpression.setParent(monthCronExpression);
            dayOfWeekCronExpression.setChild(hourCronExpression);
            monthCronExpression.setChild(dayOfWeekCronExpression);
        } else {
            hourCronExpression.setParent(dayOfMonthCronExpression);
            dayOfMonthCronExpression.setParent(monthCronExpression);
            dayOfMonthCronExpression.setChild(hourCronExpression);
            monthCronExpression.setChild(dayOfMonthCronExpression);
        }
        monthCronExpression.setParent(yearCronExpression);
        if (yearCronExpression != null) {
            yearCronExpression.setChild(monthCronExpression);
            start = yearCronExpression;
        }
    }

    public Date getNextTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime() + 1000);
        calendar.set(Calendar.MILLISECOND, 0);
        boolean getOne = start.down(calendar);
        if (getOne) {
            return new Date(calendar.getTimeInMillis());
        }
        return null;
    }

    public static CronExpressionContext getInstance(String cron) {
        CharStream charStream = CharStreams.fromString(cron);
        CronLexer lexer = new CronLexer(charStream);
        CommonTokenStream input = new CommonTokenStream(lexer);
        CronParser parser = new CronParser(input);
        CronVisitorImpl cronVisitor = new CronVisitorImpl();
        cronVisitor.visitCron(parser.cron());
        return cronVisitor.getContext();
    }
}
