import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _01_FILE {
    public static void main(String[] args) throws IOException {

        // Create new File ->

        // File createFile = new File("FILE1.txt");
        // try {
        // createFile.createNewFile();
        // } catch (IOException e) {
        // System.out.println(e);
        // }

        // Write in file

        // try {
        // FileWriter fileWriter = new FileWriter("FILE1.txt");
        // fileWriter.write("ANIRBAN MISHRA\nCSE DEPARTMENT");
        // fileWriter.close();
        // } catch (IOException e) {
        // System.out.println(e);
        // e.printStackTrace();
        // }

        // Reading a file

        // File fileRead = new File("FILE1.txt");
        // try {
        // Scanner sc = new Scanner(fileRead);
        // while (sc.hasNextLine()) {
        // String str = sc.nextLine();
        // System.out.println(str);
        // }
        // sc.close();
        // } catch (Exception e) {
        // System.out.println(e);
        // e.printStackTrace();
        // }

        // Deleting a file

        File dFile = new File("File2.txt");
        if (dFile.delete()) {
            System.out.println(dFile + " Deleted Successfully..");
        } else {
            System.out.println("Some error occurred");
        }
    }
}
