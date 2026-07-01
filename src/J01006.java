import java.util.Arrays;
import java.util.Scanner;

public class J01006 {
    public  static void main(String[] args) {
        long[] fibo = new long[93];
        Arrays.fill(fibo, 1);
        for (int i = 3; i < 93; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }
}
