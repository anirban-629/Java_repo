import java.util.LinkedList;

public class _03_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

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

        l1.addFirst(100);
        l1.addLast(200);

        // System.out.println(l1.get(0));
        // System.out.println(l1.get(l1.size()-1));

        // System.out.println(l1.getFirst());
        // System.out.println(l1.getLast());

        // for (int i = 0; i < l1.size(); i++) {
        // System.out.println(l1.get(i));
        // }
    }
}
