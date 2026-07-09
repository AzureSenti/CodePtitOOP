import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J07004 {
    public static void main (String[] args) {
        File myFile = new File("DATA.in");
        int[] so = new int[1001];
        Arrays.fill(so, 0);
        try (Scanner sc = new Scanner(myFile)) {
            while (sc.hasNextInt()) {
                so[sc.nextInt()] += 1;
            }
        } catch (FileNotFoundException e) {
            // bo qua
        }

        for (int i = 1; i <= 1000; i++) {
            if (so[i] != 0) {
                System.out.println(i + " " + so[i]);
            }
        }
    }
}
