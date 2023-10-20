class employee1{
    int a;
    employee1(int a){
        // a=a;
        this.a=a;
        System.out.println("Value of a: "+a);
    }
}

class employee2 extends employee1{
    employee2(int a){
        super(a);
        System.out.println("Constructor employee 1 "+a);
    }
    public void details(){
        System.out.println("CONSTRUCTOR");
    }
}

public class _07this_super {
    public static void main(String[] args) {
        // employee1 e1=new employee1(10);
        employee2 e2=new employee2(10);
        e2.details();
    }
}
