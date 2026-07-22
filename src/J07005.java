import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005 {
    public static void main(String[] args) {
        int[] count = new int[1000];

        try {
            FileInputStream fis = new FileInputStream("DATA.IN");
            DataInputStream dis = new DataInputStream(fis);

            for (int i = 0; i < 100000; i++) {
                int so = dis.readInt();
                count[so]++;
            }

            dis.close();
            fis.close();

            for (int i = 0; i < 1000; i++) {
                if (count[i] > 0) {
                    System.out.println(i + " " + count[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}