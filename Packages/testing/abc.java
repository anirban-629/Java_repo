package testing;


public class abc {
    public int ans;
    public int a = 10;
    private int b = 100;
    protected int c=1000;
    int d=10000;

    public void setval(int n) {
        this.ans = n + 500;
    }

    public void getval() {
        System.out.println("Value given by you is: " + this.ans);
}

    public static void main(String[] args) {

    }
}
