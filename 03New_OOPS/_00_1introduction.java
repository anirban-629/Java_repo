class emp{
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void getSetname(String name){
        this.name=name;
    }
}

public class _00_1introduction {
    public static void main(String[] args) {
        emp e1=new emp();
        e1.name="Anirban Mishra";
        e1.salary=100000;
        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
        e1.getSetname("Rahul Mishra");
        System.out.println("New Name: "+e1.getName());
    }    
}