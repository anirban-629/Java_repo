public class methods2 {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // int result=sum(10,20);
        // System.out.println(result);

        // if there, we don't use the static keyword then we have to make objects...
        
        methods2 obj = new methods2();
        int result = obj.sum(10, 20);
        System.out.println(result);
    }
}
