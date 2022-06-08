class anirban implements Runnable{
    int i=0;
    public void run(){
        while(i<25){
            System.out.println("METH1");
            i++;
        }
    }
}
class rahul implements Runnable{
    int i=0;
    public void run(){
        while(i<25){
            System.out.println("METH2");
            i++;
        }
    }
}

public class _19_Runnable_threading{
    public static void main(String[] args) {
        anirban bullet1=new anirban();
        rahul bullet2=new rahul();
        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }    
}
