package com.zwk.cron;

import java.util.EnumSet;

public enum TimeType {
    /*
     * 秒 0-59 , - * /
     * 分 0-59 , - * /
     * 小时 0-23 , - * /
     * 日期 1-31 , - * ? / L W C
     * 月份 1-12 或者 JAN-DEC , - * /
     * 星期 1-7 或者 SUN-SAT , - * ? / L C #
     * 年（可选） 留空, 1970-2099 , - * /
     * */
    SECOND {
        @Override
        public boolean validate(int start, int end) {
            return start >= 0 && end <= 59;
        }
    },
    MINUTE {
        @Override
        public boolean validate(int start, int end) {
            return start >= 0 && end <= 59;
        }
    },
    HOUR {
        @Override
        public boolean validate(int start, int end) {
            return start >= 0 && end <= 23;
        }
    },
    DAY_OF_MONTH {
        {
            set.add(ExpressionType.QUESTION);
            set.add(ExpressionType.LAST);
            set.add(ExpressionType.WORK_DAY);
        }

        @Override
        public boolean validate(int start, int end) {
            return start >= 1 && end <= 31;
        }
    },
    MONTH {
        @Override
        public boolean validate(int start, int end) {
            return start >= 1 && end <= 12;
        }
    },
    DAY_OF_WEEK {
        {
            set.add(ExpressionType.QUESTION);
            set.add(ExpressionType.LAST);
            set.add(ExpressionType.HASH);
            set.add(ExpressionType.WORK_DAY);
        }

        @Override
        public boolean validate(int start, int end) {
            return start >= 1 && end <= 7;
        }
    },
    YEAR {
        @Override
        public boolean validate(int start, int end) {
            return true;
        }
    };

    EnumSet<ExpressionType> set = EnumSet.of(ExpressionType.STAR, ExpressionType.SET, ExpressionType.INTERVAL, ExpressionType.STEP);

    public boolean support(ExpressionType type) {
        return set.contains(type);
    }

    public boolean validate(int start, int end) {
        return false;
    }
}
