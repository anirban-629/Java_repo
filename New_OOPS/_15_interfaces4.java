class employee{
    String name;
    void setName(String n){
        this.name=n;
    }
    String getName(){
        return this.name;
    }
}

interface funcEmp{
    String sCode="ABCDEFGH";
    void code();
    String[] works();
    private void sCode(){
        System.out.println("PRIVATE CODE: "+sCode);
    }
    default void greet(){
        sCode();
        System.out.println("Trial");
    }

}

class detailsEmp extends employee implements funcEmp{
    public void code(){
        System.out.println("Code is : a100");
    }
    public String[] works(){
        String [] nList={"ANIRBAN","MISHRA"};
        return nList;
    }
}

public class _15_interfaces4 {
    public static void main(String[] args) {
        detailsEmp emp1=new detailsEmp();
        emp1.setName("ANIRBAN MISHRA");   
        System.out.println("emp1.getName(): "+emp1.getName());
        emp1.code();
        // System.out.println("emp1.works(): "+emp1.works());
        for(int i=0;i<emp1.works().length;i++){
            System.out.println(emp1.works()[i]);
        }

    }
}
