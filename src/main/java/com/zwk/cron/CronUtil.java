package com.zwk.cron;

import java.util.Date;

public class CronUtil {
    public static Date getNextTime(String cron, Date date) {
        CronExpressionContext instance = CronExpressionContext.getInstance(cron);
        return instance.getNextTime(date);
    }

    public static boolean isNumerical(String str) {
        return str != null && str.chars().allMatch(Character::isDigit);
    }
}
