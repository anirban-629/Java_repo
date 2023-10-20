class employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
    public void setSalary(){
        System.out.println("Salary: "+salary+100); 
    }
}
public class _00_0introduction{
    public static void main(String[] args) {
        employee rahul=new employee();
        rahul.id=1023;
        rahul.name="ANIRBAN MISHRA";
        rahul.salary=100000;
        rahul.printDetails();
        rahul.setSalary();

        employee anirban=new employee();
        anirban.id=2023;
        anirban.name="RAHUL MISHRA";
        anirban.salary=200000;
        anirban.printDetails();
        anirban.setSalary();
    }
}