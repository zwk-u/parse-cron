package com.zwk.cron.impl;

import com.zwk.cron.CronExpression;
import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.TimeType;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseCronExpression implements CronExpression {
    protected TimeType timeType;
    protected String expr;
    protected CronExpressionContext context;
    protected CronExpression parent;
    protected CronExpression child;
    protected static Map<String, Integer> weekOfDays = new HashMap<>();
    protected static Map<String, Integer> months = new HashMap<>();

    public BaseCronExpression(TimeType timeType, String expr,CronExpressionContext context) {
        this.timeType = timeType;
        this.expr = expr;
        this.context = context;
    }

    @Override
    public String getExpr() {
        return expr;
    }

    @Override
    public CronExpression getParent() {
        return parent;
    }

    @Override
    public void setParent(CronExpression parent) {
        this.parent = parent;
    }

    @Override
    public CronExpression getChild() {
        return child;
    }

    @Override
    public void setChild(CronExpression child) {
        this.child = child;
    }

    protected void reset(Calendar calendar, TimeType type) {
        switch (type) {
            case MONTH:
                calendar.set(Calendar.MONTH, 0);
            case DAY_OF_MONTH:
                calendar.set(Calendar.DAY_OF_MONTH, 1);
            case HOUR:
                calendar.set(Calendar.HOUR_OF_DAY, 0);
            case MINUTE:
                calendar.set(Calendar.MINUTE, 0);
            case SECOND:
                calendar.set(Calendar.SECOND, 0);
        }
    }

    protected Map<String, Integer> getMap() {
        Map<String, Integer> map = null;
        switch (timeType) {
            case DAY_OF_WEEK:
                map = weekOfDays;
                break;
            case MONTH:
                map = months;
                break;
        }
        return map;
    }

    static {
        months.put("JAN", 0);
        months.put("FEB", 1);
        months.put("MAR", 2);
        months.put("APR", 3);
        months.put("MAY", 4);
        months.put("JUN", 5);
        months.put("JUL", 6);
        months.put("AUG", 7);
        months.put("SEP", 8);
        months.put("OCT", 9);
        months.put("NOV", 10);
        months.put("DEC", 11);

        weekOfDays.put("SUN", 1);
        weekOfDays.put("MON", 2);
        weekOfDays.put("TUE", 3);
        weekOfDays.put("WED", 4);
        weekOfDays.put("THU", 5);
        weekOfDays.put("FRI", 6);
        weekOfDays.put("SAT", 7);
    }
}
