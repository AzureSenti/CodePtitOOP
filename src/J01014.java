import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong();

            System.out.println(largestPrimeFactor(N));
        }
    }

    public static long largestPrimeFactor(long N) {
        long maxPrime = -1;

        while (N % 2 == 0) {
            maxPrime = 2;
            N /= 2;
        }

        for (long factor = 3; factor * factor <= N; factor += 2) {
            while (N % factor == 0) {
                maxPrime = factor;
                N /= factor;
            }
        }

        if (N > 2)
            maxPrime = N;

        return maxPrime;
    }
}
