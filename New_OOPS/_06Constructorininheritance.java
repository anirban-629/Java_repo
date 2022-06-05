class base{
    public String name;
    public base(){
        System.out.println("This is Base");
    }
    public base(String name0){
        this.name=name0;
        System.out.println("Name in Base: "+name);
    }
}

class derived1 extends base{
    public String name;
    public derived1(){
        System.out.println("This derived1");
    }
    public derived1(String name0,String name1){
        super(name0);
        this.name=name1;
        System.out.println("Name derived1: "+name);
    }
}

class derived2 extends derived1{
    public String name;
    public derived2(){
        System.out.println("This is derived2");
    }
    public derived2(String name0,String name1,String name2){
        super(name0,name1);
        this.name=name2;
        System.out.println("Name in derived2: "+name);
    }
}

public class _06Constructorininheritance {
    public static void main(String[] args) {

        // base b=new base();
        // base b=new base("Anirban");

        // derived1 d1=new derived1();
        // derived1 d1=new derived1("Anirban","Rahul");

        // derived2 d2=new derived2();
        // derived2 d2=new derived2("Anirban","Rahul","Babai");

    }
}
