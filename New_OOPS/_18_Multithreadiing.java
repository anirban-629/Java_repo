// Creating a Thread by Extending Thread class

class anirban extends Thread {
    int i = 0;

    // @Override
    public void run() {
        while (i < 50) {
            System.out.println("METH1");
            i++;
        }
    }
}

class rahul extends Thread {
    int i = 0;

    // @Override
    public void run() {
        while (i < 50) {
            System.out.println("METH2");
            i++;
        }
    }
}

public class _18_Multithreadiing {
    public static void main(String[] args) {
        anirban t1 = new anirban();
        rahul t2 = new rahul();
        t1.start();
        t2.start();
    }
}
