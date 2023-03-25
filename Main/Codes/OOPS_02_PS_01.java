package Main.Codes;

class emp{
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class OOPS_02_PS_01 {
    public static void main(String[] args) {
        emp e=new emp();
        e.salary=100;
        e.name="Rahul";
        System.out.println(e.getName());
        e.setName("Anirban");
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
