class myThread extends Thread{
    public myThread(String name){
        super(name);
    } 
    public void run(){
        System.out.println("VALUE : 100");
    } 
}

public class _20_Constructor_Thread {
    public static void main(String[] args) {
        myThread t1=new myThread("ANIRBAN");
        myThread t2=new myThread("RAHUL");
        t1.start();
        t2.start();
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }    
}
