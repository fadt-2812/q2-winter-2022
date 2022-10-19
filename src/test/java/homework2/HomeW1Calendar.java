package homework2;

import homework1.Calendar;
import org.junit.jupiter.api.Test;

public class HomeW1Calendar {
    @Test
    public void workingWithCalendar() {
        Calendar firstCalendar = new Calendar();

        firstCalendar.setYear(2022);
        firstCalendar.setFormat('5');

        System.out.println("Happy newyear");
        System.out.println("Year:");
        System.out.println(firstCalendar.getYear());
        System.out.println("Format:");
        System.out.println(firstCalendar.getFormat());

    }
}
