import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main (String[] args) {
        File myFile = new File("DATA.in");

        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
