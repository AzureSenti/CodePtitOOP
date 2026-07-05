import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            long n = sc.nextLong();
            System.out.print("Test " + testCase + ":");

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    int count = 0;
                    while (n % i == 0) {
                        count++;
                        n /= i;
                    }
                    System.out.print(" " + i + "(" + count + ")");
                }
            }

            if (n > 1) {
                System.out.print(" " + n + "(1)");
            }
            System.out.println();
        }
        sc.close();
    }
}
