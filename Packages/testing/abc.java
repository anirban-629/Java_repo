package testing;

public class abc {
    private int ba = 100;
    public int a = 10;

    public void setval(int n) {
        this.a = n + ba;
    }

    public void getval() {
        System.out.println("Value given by you is: " + this.a);
}

    public static void main(String[] args) {

    }
}
