class Area {
    private int length;
    private int breadth;

    public void setDim(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Area a = new Area();
        a.setDim(10, 10);
        System.out.println(a.getArea());
    }
}
