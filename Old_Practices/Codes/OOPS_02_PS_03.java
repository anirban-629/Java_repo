package Old_Practices.Codes;
class square{
    public int area(int s){
        return s*s;
    }
    public int perimeter(int s){
        return 4*s;
    }
}
class rectangle{
    public int area(int a ,int b){
        return a*b;
    }
    public int perimeter(int a,int b){
        return 2*(a+b);
    }
}
class circle{
    public double area(int r){
        return 3.14*(r*r);
    }
    public double perimeter(int r){
        return 2*3.14*r;
    }
}
public class OOPS_02_PS_03 {
    public static void main(String[] args) {
        square s=new square();
        System.out.println(s.area(10));
        System.out.println(s.perimeter(10));
        rectangle r=new rectangle();
        System.out.println(r.area(10,10));
        System.out.println(r.perimeter(10,10));
        circle c=new circle();
        System.out.println(c.area(10));
        System.out.println(c.perimeter(10));
    }
}
