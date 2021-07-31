package com.zwk.cron.impl;

import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.ExpressionType;
import com.zwk.cron.TimeType;

import java.util.Calendar;
import java.util.Objects;

public class StepCronExpression extends BaseCronExpression {
    private int start;
    private int step;

    public StepCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr, context);
        if (!check()) {
            throw new RuntimeException(timeType.name() + " not valid! and expression: " + expr);
        }
    }

    @Override
    public boolean check() {
        if (!timeType.support(ExpressionType.STEP)) {
            return false;
        }
        String[] split = expr.split("/");
        if (Objects.equals("*", split[0])) {
            start = 0;
        } else {
            start = Integer.parseInt(split[0]);
        }
        step = Integer.parseInt(split[1]);
        return timeType.validate(step, step) && timeType.validate(start, start);
    }

    @Override
    public boolean calculate(Calendar calendar) {
        int field = -1;
        switch (timeType) {
            case SECOND:
                int second = calendar.get(Calendar.SECOND);
                field = getField(second);
                if (field == -1) {
                    calendar.add(Calendar.MINUTE, 1);
                    reset(calendar, TimeType.SECOND);
                    return false;
                }
                calendar.set(Calendar.SECOND, field);
                break;
            case MINUTE:
                int minute = calendar.get(Calendar.MINUTE);
                field = getField(minute);
                if (field == -1) {
                    calendar.add(Calendar.HOUR_OF_DAY, 1);
                    reset(calendar, TimeType.MINUTE);
                    return false;
                }
                calendar.set(Calendar.MINUTE, field);
                if (field != minute) {
                    reset(calendar, TimeType.SECOND);
                }
                break;
            case HOUR:
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                field = getField(hour);
                if (field == -1) {
                    calendar.add(Calendar.DAY_OF_MONTH, 1);
                    reset(calendar, TimeType.HOUR);
                    return false;
                }
                calendar.set(Calendar.HOUR_OF_DAY, field);
                if (field != hour) {
                    reset(calendar, TimeType.MINUTE);
                }
                break;
            case DAY_OF_MONTH:
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                int currentMonth = calendar.get(Calendar.MONTH);
                field = getField(field);
                if (field == -1) {
                    calendar.add(Calendar.MONTH, 1);
                    reset(calendar, TimeType.DAY_OF_MONTH);
                    return false;
                }
                calendar.set(Calendar.DAY_OF_MONTH, field);
                if (calendar.get(Calendar.DAY_OF_MONTH) != currentMonth) {
                    reset(calendar, TimeType.DAY_OF_MONTH);
                    return false;
                }
                if (dayOfMonth != field) {
                    reset(calendar, TimeType.HOUR);
                }
                break;
            case MONTH:
                int month = calendar.get(Calendar.MONTH);
                field = getField(month);
                if (field == -1) {
                    calendar.add(Calendar.YEAR, 1);
                    reset(calendar, TimeType.MONTH);
                    return false;
                }
                calendar.set(Calendar.MONTH, field);
            case DAY_OF_WEEK:
                int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                int currentMonth1 = calendar.get(Calendar.MONTH);
                while (true) {
                    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                    field = getField(dayOfWeek);
                    if (field == -1) {
                        calendar.add(Calendar.DAY_OF_MONTH, 8 - dayOfWeek);
                    } else {
                        calendar.set(Calendar.DAY_OF_MONTH, currentDayOfMonth + field - dayOfWeek);
                        break;
                    }
                    if (calendar.get(Calendar.MONTH) != currentMonth1) {
                        reset(calendar, TimeType.DAY_OF_MONTH);
                        return false;
                    }
                }
                if (calendar.get(Calendar.DAY_OF_MONTH) != currentDayOfMonth) {
                    reset(calendar, TimeType.HOUR);
                }
                break;
            case YEAR:
                int year = calendar.get(Calendar.YEAR);
                field = getField(year);
                calendar.set(Calendar.YEAR, field);
                if (field != year) {
                    reset(calendar, TimeType.MONTH);
                }
                break;
        }
        return true;
    }

    private int getField(int field) {
        if (start == -1) {
            field = field + step;
            if (timeType.validate(field, field)) {
                return field;
            } else {
                return -1;
            }
        }
        if (field < start) {
            return start;
        }
        int i = 1;
        int a = -1;
        while (true) {
            a = start + step * i++;
            if (timeType.validate(a, a)) {
                if (a >= field) {
                    field = a;
                    return field;
                }
            } else {
                break;
            }
        }
        return -1;
    }
}
