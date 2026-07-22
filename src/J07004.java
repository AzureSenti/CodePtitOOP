import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) {
        int[] count = new int[1000];

        try {
            File myFile = new File("DATA.in");
            Scanner sc = new Scanner(myFile);

            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                count[number]++;
            }
            sc.close();

        } catch (FileNotFoundException e) {
            // Lỗi không tìm thấy file
        }

        for (int i = 0; i < 1000; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}