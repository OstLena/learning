package Module2;

import java.math.BigDecimal;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.GregorianCalendar;
import java.util.Locale;

public class YearVariablesTask {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(1996, 2);
        byte allMonthCountButNotWinter = 9;
        System.out.println("1 " + allMonthCountButNotWinter);

//        short february1996DayCount = (short) yearMonth.lengthOfMonth();
        short february1996DayCount = 1996%4 == 0?29:28;
        System.out.println("2 " + february1996DayCount);

        Month monthFirst = Month.MARCH;
        Month monthSecond = Month.APRIL;
        Month monthThird = Month.MAY;
        int halfOfTotalSpringDayCount =
                (monthFirst.length(false) + monthSecond.length(false) + monthThird.length(false)) / 2;
        System.out.println("3 " + halfOfTotalSpringDayCount);
        float v = 6f;


        long yearSecondCount = 365 * 24 * 60 * 60L;
        System.out.println("4 " + yearSecondCount);

        float quarterOfMayDayCount = BigDecimal.valueOf(monthThird.length(false) / 4)
                .setScale(1).floatValue();
        System.out.println("5 " + quarterOfMayDayCount);

        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {

            int sum = YearMonth.of(1996, i).lengthOfMonth();
            if (sum > 30) {
                totalSum += sum;
            }
        }

        Double dayCountOfLongMonths = Double.valueOf(totalSum);
        System.out.println("6 " + dayCountOfLongMonths);

        Month monthChar = Month.of(4);
        String charValue = monthChar.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        char springLetter = charValue.toLowerCase(Locale.ROOT).charAt(2);
        System.out.println("7 " + springLetter);

        boolean isLeap1900 = new GregorianCalendar().isLeapYear(1990);
        System.out.println("8 " + isLeap1900);
    }
}

