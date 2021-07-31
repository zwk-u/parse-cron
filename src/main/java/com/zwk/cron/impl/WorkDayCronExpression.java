package com.zwk.cron.impl;

import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.CronUtil;
import com.zwk.cron.ExpressionType;
import com.zwk.cron.TimeType;

import java.util.Calendar;

public class WorkDayCronExpression extends BaseCronExpression {
    private boolean lastWorkDay;
    private int dayOfMonth;

    public WorkDayCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr, context);
        if (!check()) {
            throw new RuntimeException(timeType.name() + " not valid! and expression: " + expr);
        }
    }

    @Override
    public boolean check() {
        if (!timeType.support(ExpressionType.WORK_DAY)) {
            return false;
        }
        if ("lw".equalsIgnoreCase(expr)) {
            lastWorkDay = true;
            return true;
        }
        String s = expr.substring(0, expr.length() - 1);
        if (!CronUtil.isNumerical(s)) {
            return false;
        }
        dayOfMonth = Integer.parseInt(s);
        return dayOfMonth >= 1 && dayOfMonth <= 31;
    }

    @Override
    public boolean calculate(Calendar calendar) {
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int currentYear = calendar.get(Calendar.YEAR);
        if (lastWorkDay) {
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 0);
            if (dayOfMonth != calendar.get(Calendar.DAY_OF_MONTH)) {
                reset(calendar, TimeType.HOUR);
            }
            return true;
        }
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeInMillis(calendar.getTimeInMillis());
        calendar1.add(Calendar.MONTH, 1);
        calendar1.set(Calendar.DAY_OF_MONTH, 0);
        if (calendar1.get(Calendar.DAY_OF_MONTH) < this.dayOfMonth) {
            calendar.add(Calendar.MONTH, 1);
            if (calendar.get(Calendar.YEAR) != currentYear) {
                reset(calendar, TimeType.MONTH);
            } else {
                reset(calendar, TimeType.DAY_OF_MONTH);
            }
            return false;
        }
        calendar1.set(Calendar.DAY_OF_MONTH, this.dayOfMonth);
        int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1) {
            calendar1.add(Calendar.DAY_OF_MONTH, 1);
        }
        if (dayOfWeek == 7) {
            calendar1.add(Calendar.DAY_OF_MONTH, -1);
        }
        if (calendar1.get(Calendar.MONTH) != month) {
            reset(calendar, TimeType.DAY_OF_MONTH);
            return false;
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
        if (calendar.get(Calendar.DAY_OF_MONTH) != dayOfMonth) {
            reset(calendar, TimeType.HOUR);
        }
        calendar.setTimeInMillis(calendar1.getTimeInMillis());
        return true;
    }
}
