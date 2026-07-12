import java.util.Scanner;

public class J01021 {
    static final long MOD = 1000000007;

    static long powerModulo(long a, long b) {
        long result = 1;

        a = a % MOD;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(powerModulo(a, b));
        }
        sc.close();
    }
}