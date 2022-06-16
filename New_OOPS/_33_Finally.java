class UnknownResult extends Exception {
    @Override
    public String toString() {
        return "INFINITY";
    }

    @Override
    public String getMessage() {
        return "INFINITY";
    }
}

public class _33_Finally {

    public static int abc(int a, int b) {
            try {
                int c;
                c=a/b;
                return c;
            } catch (Exception e) {
                System.out.println("ERROR: "+e);
            } finally{
                System.out.println("THIS IS FINALLY BLOCK");
            }

        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(abc(10,2));
    }
}
