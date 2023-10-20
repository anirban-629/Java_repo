@FunctionalInterface // -> Which interface has only one function
interface ano2 {
    void meth3(int code);
}

class lambdaExpr implements ano2 {

    @Override
    public void meth3(int code) {
        System.out.println("CODE : " + code);
    }

}

public class _09_Lambda {
    public static void main(String[] args) {

        // ano2 lambda1=new lambdaExpr();
        // lambda1.meth3(10000);

        ano2 lambda2 = (a) -> {
            System.out.println("CODE IN LAMBDA IS: " + a);
        };
        lambda2.meth3(500);
    }
}
