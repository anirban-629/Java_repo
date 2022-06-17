// https://codewithharry.com/videos/java-tutorials-for-beginners-100/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _05_TimeAPI{
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}