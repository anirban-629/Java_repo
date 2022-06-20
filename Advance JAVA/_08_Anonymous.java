interface ano1 {
    void meth1(String name);

    void meth2(int age);
}

class anoClas implements ano1 {
    @Override
    public void meth1(String name) {
        System.out.println("NAME: " + name);
    }

    @Override
    public void meth2(int age) {
        System.out.println("AGE: " + age);
    }
}

public class _08_Anonymous {
    public static void main(String[] args) {

        // ano1 anocls1=new anoClas();
        // anocls1.meth1("ANIRBAN");
        // anocls1.meth2(20);

        // Anonymous Class

        ano1 anocls2 = new ano1() {
            @Override
            public void meth1(String name) {
                System.out.println("NAME IN ANONYMOUS CLASS : " + name);
            }

            @Override
            public void meth2(int age) {
                System.out.println("AGE IN ANONYMOUS CLASS : " + age);
            }
        };
        anocls2.meth1("RAHUL");
        anocls2.meth2(25);
    }
}
