package com.zwk.cron.impl;

import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.ExpressionType;
import com.zwk.cron.TimeType;

import java.util.Calendar;

public class LastCronExpression extends BaseCronExpression {
    private int dayOfWeek = -1;

    public LastCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr ,context);
        if (!check()) {
            throw new RuntimeException(timeType.name() + " not valid! and expression: " + expr);
        }
    }

    @Override
    public boolean check() {
        if (!timeType.support(ExpressionType.LAST)) {
            return false;
        }
        if (timeType == TimeType.DAY_OF_MONTH) {
            return "l".equalsIgnoreCase(expr);
        }
        if (timeType == TimeType.DAY_OF_WEEK) {
            String s = expr.substring(0, expr.length() - 1);
            dayOfWeek = Integer.parseInt(s);
            return dayOfWeek <= 7;
        }
        return false;
    }


    @Override
    public boolean calculate(Calendar calendar) {
        if (timeType == TimeType.DAY_OF_MONTH) {
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 0);
            return true;
        }
        if (timeType == TimeType.DAY_OF_WEEK) {
            int currentYear = calendar.get(Calendar.YEAR);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTimeInMillis(calendar.getTimeInMillis());
            calendar1.add(Calendar.MONTH, 1);
            calendar1.set(Calendar.DAY_OF_MONTH, 0);
            while (calendar1.get(Calendar.DAY_OF_WEEK) != dayOfWeek) {
                calendar1.add(Calendar.DAY_OF_MONTH, -1);
            }
            if (calendar1.compareTo(calendar) < 0) {
                calendar.add(Calendar.MONTH, 1);
                if (calendar.get(Calendar.YEAR) != currentYear) {
                    reset(calendar, TimeType.MONTH);
                } else {
                    reset(calendar, TimeType.DAY_OF_MONTH);
                }
                return false;
            }
            calendar.setTimeInMillis(calendar1.getTimeInMillis());
        }
        return true;
    }
}
