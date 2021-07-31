grammar Cron;

cron: second = common minute = common hour = common dayOfMonth = common month = common dayOfWeek = common year = common? EOF;


common:  STAR           #starExp
        | QUESTION      #questionExp
        | last          #lastExp
        | set           #setExp
        | interval      #intervalExp
        | step          #stepExp
        | workDay       #workDayExp
        | hash          #hashExp

        ;

last: ID LAST
        | LAST;

step: (ID | STAR) '/' ID;

set: ID (',' ID)*;

interval: ID '-' ID;


workDay: ID WORK | LAST WORK;

hash: ID HASH ID;

ID: INT| WEEKDAY | MONTH;

WEEKDAY: SUN
        | MON
        | TUE
        | WED
        | THU
        | FRI
        | SAT
        ;
MONTH: JAN
     | FEB
     | MAR
     | APR
     | MAY
     | JUN
     | JUL
     | AUG
     | SEP
     | OCT
     | NOV
     | DEC
     ;


INT:[0-9]+;

STAR: '*';

QUESTION:'?';


LAST:'L' |'l';

WORK: 'W' | 'w';

HASH:'#';

SUN:'SUN' | 'sun';

MON:'MON' | 'mon';

TUE:'TUE' | 'tue';

WED:'WED' | 'wed';

THU:'THU' | 'thu';

FRI:'FRI' | 'fri';

SAT:'SAT' | 'sat';

JAN:'JAN' | 'jan';

FEB:'FEB' | 'feb';

MAR:'MAR' | 'mar';

APR:'APR' | 'apr';

MAY:'MAY' | 'may';

JUN:'JUN' | 'jun';

JUL:'JUL' | 'jul';

AUG:'AUG' | 'aug';

SEP:'SEP' | 'sep';

OCT:'OCT' | 'oct';

NOV:'NOV' | 'nov';

DEC:'DEC' | 'dec';


WS: [ \t\r\n] -> skip;
