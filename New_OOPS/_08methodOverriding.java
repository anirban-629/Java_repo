class a {
    public int a;

    public void seta(int a) {
        this.a = a;
        System.out.println("Set value of a in A is: "+a);
    }
}

class b extends a{

    @Override //for catching errors we use this

    public void seta(int a) {
        this.a = a;
        System.out.println("Set value of a in B is: "+a);
    }
}

public class _08methodOverriding {
    public static void main(String[] args) {
        a a=new a();
        a.seta(10);

        b b=new b();
        b.seta(20);
    }   
}
