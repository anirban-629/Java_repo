package testing;
import testing.abc;
public class insdpckg {
    public static void main(String[] args) {
        abc ab=new abc();
        System.out.println(ab.a);
        // System.out.println(ab.b); //-> It's not acceptable as its a private
        System.out.println(ab.c);
        System.out.println(ab.d);
    }
}
