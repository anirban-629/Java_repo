import java.util.ArrayDeque;

public class _04_ArrayDequeue {
    public static void main(String[] args) {
        // ArrayDeque<Integer> ad=new ArrayDeque<>();
        ArrayDeque<Integer> ad=new ArrayDeque<>(100);

        ad.add(20);
        ad.add(30);
        ad.add(40);

        ad.addFirst(10);
        ad.addLast(50);

        System.out.println(ad);
        
        ad.removeFirst();
        ad.removeLast();
        
        System.out.println(ad);
    }
}
