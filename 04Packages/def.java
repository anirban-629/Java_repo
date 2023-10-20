import testing.abc;

class check extends abc {
    public void meth1() {
        System.out.println(a);
        // System.out.println(b);//---> This will throw an error as it's a Private
        System.out.println(c);
        // System.out.println(d); //---> This will throw an error as it's a default
    }
}

public class def {
    public static void main(String[] args) {
        abc te = new abc();
        te.setval(10);
        te.getval();
        System.out.println(te.a);
        // System.out.println(te.b); //---> This will throw an error as it's a Private
        // System.out.println(te.c); //---> This will throw an error as it's a protected
        // System.out.println(te.d); //---> This will throw an error as it's a default

        check abcd=new check();
        abcd.meth1();
    }
}
