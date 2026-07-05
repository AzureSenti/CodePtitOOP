import java.util.Scanner;

public class J01011 {
    public static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long gcd = findGCD(a,b);
            long lcm = (a / gcd) * b;

            System.out.println(lcm + " " + gcd);
        }
    }
}
