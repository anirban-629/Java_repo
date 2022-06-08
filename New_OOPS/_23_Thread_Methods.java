class Thr1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 25) {
//          METHOD1 -> SLEEP

// try {
            //     Thread.sleep(500);
            // } catch (Exception e) {
                //     //TODO: handle exception
                //     System.out.println(e);
                // }
                System.out.println("THREAD 1");
                i++;
            }
        }
    }
    class Thr2 extends Thread {
        public void run() {
            int i = 0;
            while (i < 25) {
                System.out.println("THREAD 2");
            i++;
        }
    }
}

public class _23_Thread_Methods {
    public static void main(String[] args) {
        Thr1 t1=new Thr1();
        Thr2 t2=new Thr2();
        t1.start();
//      METHOD2 -> join()
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     //TODO: handle exception
        //     System.out.println(e);
        // }
        t2.start();
    }
}
