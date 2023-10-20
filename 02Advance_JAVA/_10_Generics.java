import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

class myGen<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public myGen(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

public class _10_Generics {
    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();
        a1.add("Strings");
        a1.add(10);
        a1.add(20);
        a1.add(new Scanner(System.in));

        // int a=a1.get(1); //-> This will throw an error
        int a = (int) a1.get(1);
        // System.out.println(a);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(10);
        a2.add(20);
        a2.add(30);
        a2.add(40);
        int b = a2.get(0);
        // System.out.println(b);



        myGen<String, Integer> gn1 = new myGen(100,"ANIRBAN",20);
        
        // System.out.println(gn1.getT1());
        // System.out.println(gn1.getVal());
        // System.out.println(gn1.getT2());
        
        gn1.setT1("ABC");
        gn1.setT2(1000);
        gn1.setVal(650050);

        System.out.println(gn1.getT1());     
        System.out.println(gn1.getT2());
        System.out.println(gn1.getVal());
    }
}
