class incls {
    String n;
    incls(String name) {
        this.n = name;
        System.out.println("Name: " + this.n);
    }
}

interface in1 {
    int a = 100; // We can set this properties but we can't change it as it is a final.

    void meth1();

    void meth2();
}

interface in2 {
    void meth3();

    void meth4();
}

class inclass1 extends incls implements in1, in2 {
     
    inclass1(String a){
        super(a);
    }

    public void allmeth() {
        System.out.println("All methods are available here");
    }

    public void meth1() {
        System.out.println("This is method 1 of interface in1");
    }

    public void meth2() {
        System.out.println("This is method 2 of interface in1");
    }

    public void meth3() {
        System.out.println("This is method 3 of interface in2");
    }

    public void meth4() {
        System.out.println("This is method 4 of interface in2");
    }
}

public class _13_interfaces2 {
    public static void main(String[] args) {
        System.out.println("Value of a int interaface 1: " + in1.a);
        // in1.a=1000123; //-->Throw a errors
        System.out.println("Value of a int interaface 1: " + in1.a);
        inclass1 intfc = new inclass1("Anirban");
        intfc.meth1();
        intfc.meth2();
        intfc.meth3();
        intfc.meth4();
    }
}
