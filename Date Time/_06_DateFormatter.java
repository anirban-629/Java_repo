import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _06_DateFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate1 = dt.format(df1);
        String myDate2 = dt.format(df2);

        System.out.println(dt);
        System.out.println(myDate1);
        System.out.println(myDate2);

    }
}
