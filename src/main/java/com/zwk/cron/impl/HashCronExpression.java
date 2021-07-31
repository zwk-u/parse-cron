package com.zwk.cron.impl;

import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.ExpressionType;
import com.zwk.cron.TimeType;

import java.util.Calendar;

public class HashCronExpression extends BaseCronExpression {
    public HashCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr, context);
        if (!check()) {
            throw new RuntimeException(timeType.name() + " not valid! and expression: " + expr);
        }
    }

    private int week;
    private int dayOfWeek;


    @Override
    public boolean check() {
        if (!timeType.support(ExpressionType.HASH)) {
            return false;
        }
        String[] split = expr.split("#");
        dayOfWeek = Integer.parseInt(split[0]);
        week = Integer.parseInt(split[1]);
        return dayOfWeek <= 7 && week <= 5;
    }

    @Override
    public boolean calculate(Calendar calendar) {
        if (timeType != TimeType.DAY_OF_WEEK) {
            return false;
        }
        boolean result = true;
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        if (this.week < weekOfMonth) {
            result = false;
        }
        if (this.week == weekOfMonth && this.dayOfWeek < dayOfWeek) {
            result = false;
        }
        if (result) {
            int day = (this.week - weekOfMonth - 1) * 7 + 7 + this.dayOfWeek - dayOfWeek;
            calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + day);
            if (!(this.week == weekOfMonth && this.dayOfWeek == dayOfWeek)) {
                reset(calendar, TimeType.HOUR);
            }
        } else {
            calendar.add(Calendar.MONTH, 1);
            reset(calendar, TimeType.DAY_OF_MONTH);
        }
        return result;
    }
}
