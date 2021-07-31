package com.zwk.cron.impl;

import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.CronUtil;
import com.zwk.cron.ExpressionType;
import com.zwk.cron.TimeType;

import java.util.Calendar;
import java.util.Map;

public class IntervalCronExpression extends BaseCronExpression {

    private int start;
    private int end;


    public IntervalCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr, context);
        if (!check()) {
            throw new RuntimeException(timeType.name() + " not valid! and expression: " + expr);
        }
    }

    @Override
    public boolean check() {
        if (!timeType.support(ExpressionType.INTERVAL)) {
            return false;
        }
        String[] split = expr.split("-");
        if (CronUtil.isNumerical(split[0])) {
            if (!CronUtil.isNumerical(split[1])) {
                return false;
            }
            start = Integer.parseInt(split[0]);
            end = Integer.parseInt(split[1]);
        } else {
            Map<String, Integer> map = getMap();
            if (map == null) {
                return false;
            }
            Integer index = map.get(split[0]);
            if (index == null) {
                return false;
            }
            start = index;
            index = map.get(split[1]);
            if (index == null) {
                return false;
            }
            end = index;
        }
        if (start >= end) {
            return false;
        }
        return timeType.validate(start, end);
    }

    @Override
    public boolean calculate(Calendar calendar) {
        boolean result = true;
        int field = -1;
        switch (timeType) {
            case SECOND:
                int second = calendar.get(Calendar.SECOND);
                if (invalid(second)) {
                    result = false;
                    calendar.add(Calendar.MINUTE, 1);
                    reset(calendar, TimeType.SECOND);
                } else {
                    calendar.set(Calendar.SECOND, getField(second));
                }
                break;
            case MINUTE:
                int minute = calendar.get(Calendar.MINUTE);
                if (invalid(minute)) {
                    result = false;
                    calendar.add(Calendar.HOUR_OF_DAY, 1);
                    reset(calendar, TimeType.MINUTE);
                } else {
                    field = getField(minute);
                    calendar.set(Calendar.MINUTE, field);
                    if (field != minute) {
                        reset(calendar, TimeType.SECOND);
                    }
                }
                break;
            case HOUR:
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                if (invalid(hour)) {
                    result = false;
                    calendar.add(Calendar.DAY_OF_MONTH, 1);
                    reset(calendar, TimeType.HOUR);
                } else {
                    field = getField(hour);
                    calendar.set(Calendar.HOUR_OF_DAY, field);
                    if (field != hour) {
                        reset(calendar, TimeType.MINUTE);
                    }
                }
                break;
            case DAY_OF_MONTH:
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                if (invalid(dayOfMonth)) {
                    result = false;
                    calendar.add(Calendar.MONTH, 1);
                    reset(calendar, TimeType.DAY_OF_MONTH);
                } else {
                    field = getField(dayOfMonth);
                    calendar.set(Calendar.DAY_OF_MONTH, field);
                    if (field != dayOfMonth) {
                        reset(calendar, TimeType.HOUR);
                    }
                }
                break;
            case MONTH:
                int month = calendar.get(Calendar.MONTH);
                if (invalid(month)) {
                    result = false;
                    calendar.add(Calendar.YEAR, 1);
                    reset(calendar, TimeType.MONTH);
                } else {
                    field = getField(month);
                    calendar.set(Calendar.MONTH, field);
                    if (field != month) {
                        reset(calendar, TimeType.DAY_OF_MONTH);
                    }
                }
                break;
            case DAY_OF_WEEK:
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                int currentMonth = calendar.get(Calendar.MONTH);
                if (invalid(dayOfWeek)) {
                    result = false;
                    int day = start + 7 - dayOfWeek;
                    calendar.add(Calendar.DAY_OF_MONTH, day);
                    reset(calendar, TimeType.HOUR);
                } else {
                    int day = calendar.get(Calendar.DAY_OF_MONTH);
                    if (dayOfWeek < start) {
                        day += start - dayOfWeek;
                    }
                    calendar.set(Calendar.DAY_OF_MONTH, day);
                    if (start > dayOfWeek) {
                        reset(calendar, TimeType.HOUR);
                    }
                }
                if (calendar.get(Calendar.MONTH) != currentMonth) {
                    result = false;
                    reset(calendar, TimeType.DAY_OF_MONTH);
                }
                break;
            case YEAR:
                int year = calendar.get(Calendar.YEAR);
                if (invalid(year)) {
                    return false;
                } else {
                    field = getField(year);
                    calendar.set(Calendar.YEAR, field);
                    if (field != year) {
                        reset(calendar, TimeType.MONTH);
                    }
                }
                break;
        }
        return result;
    }

    private boolean invalid(int i) {
        return i > end;
    }

    private int getField(int field) {
        if (field < start) {
            field = start;
        }
        return field;
    }
}
