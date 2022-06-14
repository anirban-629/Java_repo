class NegRadiusException extends Exception {
    @Override
    public String toString() {
        return "Negative Radius not allowed";
    }

    @Override
    public String getMessage() {
        return "Negative Radius not allowed";
    }
}

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

public class _31_Throw_Throws {
    public static int divide(int a, int b) throws UnknownResult {
        int c = a / b;
        return c;
    }

    public static double area(int r) throws NegRadiusException {
        double ar = Math.PI * r * r;
        return ar;
    }

    public static void main(String[] args) {
        // int divide;
        double result;
        // try {
        //     divide = divide(10, 0);
        //     System.out.println("DIVIDE: " + divide);
        // } catch (UnknownResult e1) {
        //     System.out.println(e1.getMessage());
        // }
        
        try {
            result=area(-10);
            System.out.println("AREA: "+result);
        } catch (NegRadiusException e2) {
            System.out.println(e2.getMessage());
        }
    }
}
