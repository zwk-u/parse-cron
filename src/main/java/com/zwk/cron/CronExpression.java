package com.zwk.cron;

import java.util.Calendar;

public interface CronExpression {

    boolean check();

    String getExpr();

    CronExpression getParent();

    void setParent(CronExpression parent);

    CronExpression getChild();

    void setChild(CronExpression child);

    default boolean up(Calendar calendar) {
        if (getParent() == null) {
            return calculate(calendar);
        }
        return getParent().up(calendar) && calculate(calendar);
    }

    default boolean down(Calendar calendar) {
        if (!calculate(calendar)) {
            if (!up(calendar)) {
                return false;
            }
            return down(calendar);
        }
        if (getChild() == null) {
            return true;
        }
        return getChild().down(calendar);
    }

    boolean calculate(Calendar calendar);

}
