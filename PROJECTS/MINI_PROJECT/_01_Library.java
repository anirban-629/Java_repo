import java.util.ArrayList;
import java.util.Scanner;

class myLibrary {
    public static ArrayList<String> books() {

        String[] defaultBooks = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        ArrayList<String> books = new ArrayList<>(1000);

        for (int i = 0; i < defaultBooks.length; i++) {
            books.add(defaultBooks[i]);
        }
        return books;
    }

    public void showBook(ArrayList<String> books) {
        for (int i = 0; i < books.size(); i++) {
            if (i < 9) {
                System.out.println("<0" + (i + 1) + "> " + books.get(i));
            } else {
                System.out.println("<" + (i + 1) + "> " + books.get(i));
            }
        }
    }

    public void issueBook() {
    }

    public void addBook() {
    }

    public void returnBook() {
    }

    public void searchBook() {
        
    }

}

public class _01_Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("<<--::::::WELCOME TO LIBRARY::::::-->>");

        // String name = sc.nextLine();
        myLibrary l = new myLibrary();

        ArrayList<String> allBooks = new ArrayList<>(1000);
        allBooks = l.books();

        l.showBook(allBooks);

        sc.close();
    }
}
