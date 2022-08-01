
public class _28_Quadrant_Coordinate {
    public static void main(String[] args) {
        int x = 0, y = 0;
        if (x == 0 && y == 0) {
            System.out.println("ORIGIN");
        } else if (x > 0 && y > 0) {
            System.out.println("QUADRANT 1");           
        } else if (x < 0 && y > 0) {
            System.out.println("QUADRANT 2");           
        } else if (x < 0 && y < 0) {
            System.out.println("QUADRANT 3");           
        } else if (x > 0 && y < 0) {
            System.out.println("QUADRANT 4");       
        } else if (x == 0 && y != 0) {
            System.out.println("Y-AXIS");
        } else if (x != 0 && y == 0) {
            System.out.println("X-AXIS");
        }
    }
}
/*
 * |
 * -x,y | x,y
 * |
 * origin|(0,0)
 * -----------------------
 * |
 * -x,-y | +x,-y
 * |
 * 
 */
