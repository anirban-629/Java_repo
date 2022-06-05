class employee1{
    String name;
    
    // Methods
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

// Inheritance
class employee2 extends employee1{
    int age;

    // Methods
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

public class _05_Inheritance{
    public static void main(String[] args) {

        //Employee 1
        employee1 e1=new employee1();
        e1.setName("Anirban");
        System.out.println("Employee 1");
        System.out.println("Employee Name: "+e1.getName());
        
        //Employee 2
        employee2 e2=new employee2();
        e2.setName("Rahul");
        e2.setAge(20);
        System.out.println("Employee 2");
        System.out.println("Employee Name: "+e2.getName());
        System.out.println("Employee age: "+e2.getAge());
    }
}