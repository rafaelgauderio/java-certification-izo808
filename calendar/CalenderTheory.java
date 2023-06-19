package calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CalenderTheory {

    public static void main(String[] args) {
        System.out.println("LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, Periodo are IMMUTABLE.\n" +
                "Do no 'new' a class in the date or time API.\n" +
                "Use factory creation methods as new(), of(), parse().\n");

        LocalDate agoraDate = LocalDate.now();
        LocalTime agoraTime = LocalTime.now();
        LocalDateTime agoraDateAndTime = LocalDateTime.of(agoraDate, agoraTime);
        System.out.println("Date today is " + agoraDate);
        System.out.println("Time today is " + agoraTime);
        System.out.println("Date and time today is " + agoraDateAndTime);

        //year, month, day of the month
        System.out.println("\nLocalDate");
        LocalDate dateOfBirth = LocalDate.of(1982, 12, 17);
        LocalDate dateOfBirth02 = LocalDate.parse("1982-12-17");
        System.out.println(dateOfBirth);
        System.out.println(dateOfBirth02);

        System.out.println("\nLocaTime");
        // your, minute, second
        LocalTime gameBegins = LocalTime.of(16,0);
        LocalTime gameEnds = LocalTime.of(18,30,00);
        System.out.println("Game begins at " + gameBegins);
        System.out.println("Game ends at " + gameEnds);





    }
}
