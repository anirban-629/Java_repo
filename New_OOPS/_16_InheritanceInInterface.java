interface i1{
    void meth1();
    void meth2();
}
interface i2 extends i1{
    void meth3();
    void meth4();
}

class i12 implements i2{
    public void meth1(){System.out.println("METHOD 1");}
    public void meth2(){System.out.println("METHOD 2");}
    public void meth3(){System.out.println("METHOD 3");}
    public void meth4(){System.out.println("METHOD 4");}
}

public class _16_InheritanceInInterface {
    public static void main(String[] args) {
        i12 cl =new i12();
        cl.meth1();
        cl.meth2();
        cl.meth3();
        cl.meth4();
    }
}
