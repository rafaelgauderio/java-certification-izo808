package calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormattindDatesAndTimes {

    public static void main(String[] args) {
        System.out.println("\nCustom format string for personal customisation.\n" +
                "M means month and m meand minutes");

        LocalDate birthDate = LocalDate.of(1982, Month.DECEMBER, 17);
        System.out.println(birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

        LocalTime birthTime = LocalTime.of(12,30);
        System.out.println(birthTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        LocalDateTime birthDateTime = LocalDateTime.of(birthDate, birthTime);
        System.out.println(birthDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("\nCustom formatting dates");
        System.out.println("d = day of the month");
        System.out.println("D = day of the year");
        System.out.println("E = day of the week");
        DateTimeFormatter fomart01 = DateTimeFormatter.ofPattern("dd-M-yy");
        DateTimeFormatter fomart02 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fomart03 = DateTimeFormatter.ofPattern("dd-MMM-yyyy E");
        DateTimeFormatter fomart04 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy E D");
        System.out.println(birthDate.format(fomart01));
        System.out.println(birthDate.format(fomart02));
        System.out.println(birthDate.format(fomart03));
        System.out.println(birthDate.format(fomart04));

    }

}
