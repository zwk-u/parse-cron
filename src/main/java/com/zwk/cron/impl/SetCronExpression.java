package com.zwk.cron.impl;


import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.CronUtil;
import com.zwk.cron.ExpressionType;
import com.zwk.cron.TimeType;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class SetCronExpression extends BaseCronExpression {
    private List<Integer> values = new ArrayList<>();

    public SetCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr, context);
        if (!check()) {
            throw new RuntimeException(timeType.name() + " not valid! and expression: " + expr);
        }
    }

    @Override
    public boolean check() {
        if (!timeType.support(ExpressionType.SET)) {
            return false;
        }
        String[] split = expr.split(",");
        String first = split[0];
        if (CronUtil.isNumerical(first)) {
            for (String s : split) {
                int val = Integer.parseInt(s);
                if (timeType.validate(val, val)) {
                    values.add(val);
                } else {
                    return false;
                }
            }
        } else {
            Map<String, Integer> map = getMap();
            if (map == null) {
                return false;
            }
            for (String s : split) {
                Integer i = map.get(s);
                if (i == null) {
                    return false;
                }
                values.add(i);
            }
        }
        int a = -1;
        for (Integer value : values) {
            if (a == -1) {
                a = value;
                continue;
            }
            if (a > value) {
                return false;
            }
            a = value;
        }
        return true;
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
                } else {
                    calendar.set(Calendar.SECOND, field);
                }
                break;
            case MINUTE:
                int minute = calendar.get(Calendar.MINUTE);
                field = getField(minute);
                if (field == -1) {
                    calendar.add(Calendar.HOUR_OF_DAY, 1);
                    reset(calendar, TimeType.MINUTE);
                    return false;
                } else {
                    calendar.set(Calendar.MINUTE, field);
                    if (field != minute) {
                        reset(calendar, TimeType.SECOND);
                    }
                }
                break;
            case HOUR:
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                field = getField(hour);
                if (field == -1) {
                    calendar.add(Calendar.DAY_OF_MONTH, 1);
                    reset(calendar, TimeType.HOUR);
                    return false;
                } else {
                    calendar.set(Calendar.HOUR_OF_DAY, field);
                    if (field != hour) {
                        reset(calendar, TimeType.MINUTE);
                    }
                }
                break;
            case DAY_OF_MONTH:
                int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                field = getField(dayOfMonth);
                if (field == -1) {
                    calendar.add(Calendar.MONTH, 1);
                    reset(calendar, TimeType.DAY_OF_MONTH);
                    return false;
                } else {
                    calendar.set(Calendar.DAY_OF_MONTH, field);
                    if (field != dayOfMonth) {
                        reset(calendar, TimeType.HOUR);
                    }
                }
                break;
            case MONTH:
                int month = calendar.get(Calendar.MONTH);
                field = getField(month);
                if (field == -1) {
                    calendar.add(Calendar.YEAR, 1);
                    reset(calendar, TimeType.MONTH);
                    return false;
                } else {
                    calendar.set(Calendar.MONTH, field);
                    if (field != month) {
                        reset(calendar, TimeType.DAY_OF_MONTH);
                    }
                }
                break;
            case DAY_OF_WEEK:
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                int currentMonth = calendar.get(Calendar.MONTH);
                int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                field = getField(dayOfWeek);
                int day = 0;
                if (field == -1) {
                    day = values.get(0) + 7 - dayOfWeek;
                } else {
                    day = field - dayOfWeek;
                }
                calendar.add(Calendar.DAY_OF_MONTH, day);
                if (calendar.get(Calendar.MONTH) != currentMonth) {
                    reset(calendar, TimeType.DAY_OF_MONTH);
                    return false;
                }
                if (calendar.get(Calendar.DAY_OF_MONTH) != currentDayOfMonth) {
                    reset(calendar, TimeType.HOUR);
                }
                break;
            case YEAR:
                int year = calendar.get(Calendar.YEAR);
                field = getField(year);
                if (field == -1) {
                    return false;
                } else {
                    calendar.set(Calendar.YEAR, field);
                    if (field != year) {
                        reset(calendar, TimeType.MONTH);
                    }
                }
                break;
        }
        return true;
    }

    private int getField(int field) {
        for (Integer value : values) {
            if (value >= field) {
                return value;
            }
        }
        return -1;
    }
}
