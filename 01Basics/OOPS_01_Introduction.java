package Main.Codes;

class employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class OOPS_01_Introduction {
    public static void main(String[] args) {
        employee rahul=new employee();
        employee anirban= new employee();

        rahul.id=100;
        rahul.salary=10000;
        rahul.name="Rahul";

        anirban.id=200;
        anirban.salary=20000;
        anirban.name="Anirban";

        rahul.printDetails();
        int sal1=rahul.getSalary();
        System.out.println(sal1);

        anirban.printDetails();
        int sal2=anirban.getSalary();
        System.out.println(sal2);
    }
}

