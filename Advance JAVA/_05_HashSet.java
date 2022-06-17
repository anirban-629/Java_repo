import java.util.HashSet;

public class _05_HashSet {
    public static void main(String[] args) {
        // HashSet<Integer> myHash=new HashSet<>();
        HashSet<Integer> myHash = new HashSet<>(20, 0.6f);
        myHash.add(10);
        myHash.add(11);
        myHash.add(21);
        myHash.add(23);
        myHash.add(12);
        myHash.add(13);
        myHash.add(22);
        myHash.add(20);
        myHash.add(10);
        System.out.println(myHash);
    }
}
