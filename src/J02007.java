import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            System.out.println("Test " + i + ":");
            LinkedHashMap<Integer, Integer> day_so = new LinkedHashMap<>();
            while (N --> 0) {
                int so = sc.nextInt();
                day_so.merge(so, 1, Integer::sum);
            }
            for (int key : day_so.keySet()) {
                System.out.println(key + " xuat hien " + day_so.get(key) + " lan");
            }

        }
    }
}
