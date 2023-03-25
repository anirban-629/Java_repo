package Main.Practice;
import java.util.Scanner;

class InnerClass {
    class emp {
        String name;
        int age;
        int code;

        public void printdetails() {
            System.out.println("Name" + name);
            System.out.println("age" + age);
            System.out.println("code" + code);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int code = sc.nextInt();
        emp a = new emp();
        a.name = name;
        a.age = age;
        a.code = code;
        a.printdetails();
    }
}