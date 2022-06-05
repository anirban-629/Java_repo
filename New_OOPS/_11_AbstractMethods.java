abstract class phone{
    public void description(){
        System.out.println("This is method named Description");
    }
    abstract public void name1();
    abstract public void ram();
}

class samsung extends phone{
    public void name1(){
        System.out.println("Samsung");
    }
    public void ram(){
        System.out.println("6gb");
    }

    public void description(){
        System.out.println("Samsung Description"); //----> ONLY MAKING THIS METHOD WILL THROW A ERROR  AS IT EXTENDES A BASE ABSTRACT CLASS AND NO ABSTRACT METHODS ARE CALLED HERE.
    }
}

abstract class realme extends phone{    // ---> Made  by the abstract class phone 
    public void description(){
        System.out.println("RealMe"); 
    }
}

public class _11_AbstractMethods {
    public static void main(String[] args) {
        // phone p=new phone(); //---> Throw error as it is a abstract class.
        samsung s=new samsung();
        s.name1();
        s.ram();
        s.description();

        // realme r=new realMe(); //Throw error as it is a abstract class.
    }
}
