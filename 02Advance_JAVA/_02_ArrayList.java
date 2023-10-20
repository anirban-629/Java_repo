import java.util.ArrayList;

public class _02_ArrayList {
    public static void main(String[] args) {

        // ArrayList<Integer> l1=new ArrayList<>(); // -> Capacity 10

        ArrayList<Integer> l1 = new ArrayList<>(10); // -> Capacity 10
        ArrayList<Integer> l2 = new ArrayList<>(10); // -> Capacity 10

        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1, 3);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);

        l1.addAll(0, l2);

        System.out.println(l1.indexOf(3));
        System.out.println(l1.isEmpty());

        l1.ensureCapacity(100);

        // for (int i = 0; i < l1.size(); i++) {
        // System.out.println(l1.get(i));
        // }

    }
}
