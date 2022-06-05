import java.util.Scanner;

class library {
    String[] book = new String[1000];
    
    private void addDefaultBook(){
        String[] defaultBooks = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        for(int i=0;i<defaultBooks.length;i++){
            book[i]=defaultBooks[i];
        }
    }

    public void addBook() {
        int n;
        System.out.print("Enter the Number of Books You Want to add: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = book.length; i < (book.length + n); i++) {
            book[i] = sc.nextLine();
        }
        sc.close();
    }

    public void showBook() {
        addDefaultBook();
        for (int i = 0; i < book.length; i++) {
            if(book[i]==null){
                break;
            }
            else if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8) {
                System.out.println("0" + (i + 1) + " Book: " + book[i]);
            } else {
                System.out.println((i + 1) + " Book: " + book[i]);
            }
        }
    }

    public void issueBook() {
    }

    public void returnBook() {
    }
}

public class _10_Library {
    public static void main(String[] args) {
        library l = new library();
        l.addBook();
        l.showBook();
    }
}
