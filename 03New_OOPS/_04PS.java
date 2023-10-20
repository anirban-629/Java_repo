class calculation{

    private int r;
    private int h;
     
    public void setRadius(int n){this.r=n;}
    public void setHeight(int n){this.h=n;}

    public int getRadius(){return r;}
    public int getHeight(){return h;}

    public void volume(){
        double vol=Math.PI*r*r*h;
        System.out.println("Volume: "+vol);
    }
    
    public calculation(){
        this.r=20;
        this.h=20;
    }

    public calculation(int r,int h){
        this.r=r;
        this.h=h;
    }
}

public class _04PS{
    public static void main(String[] args) {

        calculation c1=new calculation();
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        c1.volume();

        // c1.setRadius(10);
        // c1.setRadius(2);
        // c1.volume();

        calculation c2=new calculation(10,10);
        c2.volume();
    }
}