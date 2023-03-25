public class Break_Continue {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        for(j=0;j<=10;j++){
            if(j==5){
                continue;
            }
            System.out.println(j);
        }
    }
}
