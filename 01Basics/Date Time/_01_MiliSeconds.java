public class _01_MiliSeconds {
    public static void main(String[] args) {
        System.out.println("No of Miliseconds passed sincem 1970: " + System.currentTimeMillis());
        System.out.println("No of Seconds passed sincem 1970    : " + System.currentTimeMillis() / 1000);
        System.out.println("No of Minutes passed sincem 1970    : " + System.currentTimeMillis() / 1000 / 3600);
        System.out.println("No of Hours passed sincem 1970      : " + System.currentTimeMillis() / 1000 / 3600 / 24);
        System.out.println("No of Years passed sincem 1970      : " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
    }
}
