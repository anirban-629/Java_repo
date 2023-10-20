import java.util.Scanner;

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 1.2;
    }

    public double volume() {
        return 1.2;
    }
}

class Box extends ThreeDObject {
    int a, b, c;

    Box() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (a * b + b * c + c * a);
    }

    @Override
    public double volume() {
        return a * b * c;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b.wholeSurfaceArea());
        System.out.println(b.volume());
    }
}
