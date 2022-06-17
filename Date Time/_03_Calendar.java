import java.util.Calendar;

public class _03_Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());

        // Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(c1.getTimeZone());

        System.out.println("Current year is :" + c.get(Calendar.YEAR));
        System.out.println("Current month is :" + c.get(Calendar.MONTH));
        System.out.println("Current day is :" + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :" + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :" + c.get(Calendar.MINUTE));
        System.out.println("Current second is :" + c.get(Calendar.SECOND));

        System.out.println(c.getWeeksInWeekYear());
        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR));

    }
}
