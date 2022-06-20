class ab{
    public String[] bk(){
        String [] bkks= { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        return bkks;
    }
}
public class test {
    public static void main(String[] args) {
     ab a=new ab();
     String[]x=new String[1000];   
     x=a.bk();
     for (int i = 0; i < x.length; i++) {
        System.out.println(x[i]);
     }
    }
}
