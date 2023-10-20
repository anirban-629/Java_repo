class Super{
    public void meth1(){
        System.out.println("This is Method 1 in Super Class");
    }
    public void meth2(){
        System.out.println("This is Method 2 in Super Class");
    }
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("This is Method 2 in Sub Class");
    }
    public void meth3(){
        System.out.println("This is Method 3 in Sub Class");
    }

}

public class _09_DynamicMethodDispatch {
    public static void main(String[] args) {

        // Allowed

        // Super s1=new Super();
        // Sub s2=new Sub();
        // s1.meth1();
        // s1.meth2();
        // s2.meth2();
        // s2.meth3();

        Super s3=new Sub(); //Allowed
        // Sub s3=new Super(); //Not allowed
        s3.meth1(); // Allowed beacuse its a method of super class
        s3.meth2(); // Allowed beacuse its a method of super class as well as sub class as it's overriden
        // s3.meth3(); //Not allowed because reference is phone 

    }        
}
