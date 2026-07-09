import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main (String[] args) {
        File myFile = new File("DATA.in");
        long sum = 0;
        try (Scanner sc = new Scanner(myFile)) {
            while (sc.hasNext()) {
                String token = sc.next();

                try {
                    int num = Integer.parseInt(token);
                    sum += num;
                } catch (NumberFormatException e) {
                    // bo qua
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sum);
    }
}
