/*
Abstract class ->

1. In case of abstract class the methods we create which are called abstract methods we need to implement atleast one method of them and then we can create our custom methods as per our need.
2. We only can extend one class to create a class.

Interface

1. In case of interface the methods we create we need to implement atleast all the methods of the interface and then we can create our custom methods as per our need.
2. We can implement more thean one inteface to create a class.
*/
// ----------------------------------------------------------------------------------

interface in1{
    int a=100; // We can set this properties but we can't change it as it is a final.
    void meth1();
    void meth2();
}
interface in2{
    void meth3();
    void meth4();
}

class inclass1 implements in1,in2{

    public void allmeth(){
        System.out.println("All methods are available here");
    }

// Methods of interface 1
public void meth1(){
    System.out.println("This is method 1 of interface in1");
}
public void meth2(){
    System.out.println("This is method 2 of interface in1");
}

// Methods of interface 2
    public void meth3(){
        System.out.println("This is method 3 of interface in2");
    }
    public void meth4(){
        System.out.println("This is method 4 of interface in2");
    }
}

public class _12_interfaces {
    public static void main(String[] args) {
        System.out.println("Value of a int interaface 1: "+in1.a);
        // in1.a=1000123; //-->Throw a error
        // System.out.println("Value of a int interaface 1: "+in1.a);
        inclass1 intfc=new inclass1();
        intfc.meth1();
        intfc.meth2();
        intfc.meth3();
        intfc.meth4();
    }
}
