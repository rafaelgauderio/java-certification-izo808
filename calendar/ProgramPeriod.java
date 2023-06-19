package calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProgramPeriod {

    public static void main(String[] args) {
        System.out.println("Period represents year, months and days.\n" +
                "Periods are output with a P.\n" +
                "We can have more than 12 months and more than 365 days\n");

        // year, months, day
        Period period = Period.of(1995, 12, 17);
        System.out.println(period);
        System.out.println(Period.of(1,200, 370));

        LocalDate agora = LocalDate.now();
        Period tenDays = Period.ofDays(10);
        Period twoWeeks = Period.ofWeeks(2);
        Period fiveYears = Period.ofYears(5);

        DateTimeFormatter brazilFormat = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(agora.format(brazilFormat));
        System.out.println("Plus ten days: " + agora.plus(tenDays).format(brazilFormat));
        System.out.println("Minus ten days: " + agora.minus(tenDays).format(brazilFormat));
        System.out.println("Plus two weeks: " + agora.plus(twoWeeks).format(brazilFormat));
        System.out.println("Plus five years: " + agora.plus(fiveYears).format(brazilFormat));
        System.out.println(agora.format(brazilFormat) + " yet immutable");

        LocalDate nowPlusFiveYear = agora.plus(fiveYears);
        System.out.println(nowPlusFiveYear.format(brazilFormat));
    }
}
