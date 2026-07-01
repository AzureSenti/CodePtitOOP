import java.util.Arrays;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < 93; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for(int i = 0; i < t; i++) {
                long n = sc.nextLong();

                int index = Arrays.binarySearch(fibo, n);

                if (index >= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}