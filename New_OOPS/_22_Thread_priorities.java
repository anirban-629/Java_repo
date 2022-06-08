class Thr extends Thread {
    public Thr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 25) {
            System.out.println("MARKS " + this.getName());
            i++;
        }
    }
}

public class _22_Thread_priorities {
    public static void main(String[] args) {

        Thr t1=new Thr("10");
        Thr t2=new Thr("20");
        Thr t3=new Thr("30");
        Thr t4=new Thr("40");
        Thr t5=new Thr("50(MAX)");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
