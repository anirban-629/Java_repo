import java.util.Date;

public class _02_Date {
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());  
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getHours());
        System.out.println(d.getTime());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(1900+d.getYear());
    }
}
