package com.zwk.cron.impl;

import com.zwk.cron.CronExpressionContext;
import com.zwk.cron.TimeType;

import java.util.Calendar;

public class StarCronExpression extends BaseCronExpression {
    public StarCronExpression(TimeType timeType, String expr, CronExpressionContext context) {
        super(timeType, expr,context);
    }

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public boolean calculate(Calendar calendar) {
        return true;
    }
}
