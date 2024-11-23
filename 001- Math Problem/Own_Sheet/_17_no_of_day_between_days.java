package Own_Sheet;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;

public class _17_no_of_day_between_days {
    public static void main(String[] args) {
        // Input dates
        int d1 = 17;
        int m1 = 07;
        int y1 = 2000;

        int d2 = 21;
        int m2 = 11;
        int y2 = 2024;

        // Use LocalDate for date representation
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        // Calculate days between dates
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        // Get day names
        DayOfWeek dayOfWeek1 = date1.getDayOfWeek();
        DayOfWeek dayOfWeek2 = date2.getDayOfWeek();

        // Print results
        System.out.println("First date: " + date1 + ", Day name: " + dayOfWeek1);
        System.out.println("Second date: " + date2 + ", Day name: " + dayOfWeek2);
        System.out.println("Number of days between: " + daysBetween);
    }
}
