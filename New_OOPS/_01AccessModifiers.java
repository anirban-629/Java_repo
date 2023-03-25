class circle {
    private int radius;

    // setter
    public void setRad(int n) {
        this.radius = n;
    }

    public int getRad() {
        return radius;
    }

    public double perimeter() {
        return 2 * (22 / 7) * radius;
    }
}

public class _01AccessModifiers {
    public static void main(String[] args) {
        circle c = new circle();
        c.setRad(7);
        System.out.println("Radius: " + c.getRad());
        System.out.println("Perimeter: " + c.perimeter());
    }
}
