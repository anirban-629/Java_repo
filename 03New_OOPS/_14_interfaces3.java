class c1{
    void meth1(){System.out.println("Meth 1");}
    void meth2(){System.out.println("Meth 2");}
}

interface i1{
    void a();
    void b();
    private void c(){System.out.println("This is Private we can't use it directly");}
    default void d(){
        c(); //-> call of the private method here is acceptable...
        System.out.println("This is usage of default");
    }
}

class c2 extends c1 implements i1{
    public void a(){System.out.println("METHOD A");}
    public void b(){System.out.println("METHOD B");}

    // public void d(){System.out.println("METHOD OVERRIDE C");}
}

public class _14_interfaces3 {
    public static void main(String[] args) {
        c2 cls=new c2();
        cls.a();
        cls.b();
        // cls.c(); // -> This throws a error as it is a private method
        cls.d();
        cls.meth1();
        cls.meth2();
    }
}
