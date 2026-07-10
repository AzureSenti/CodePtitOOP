import java.util.Scanner;

public class J01017 {
    static String check(String N) {
        for (int i=1; i < N.length(); i++) {
            if (Math.abs((int) N.charAt(i) - (int) N.charAt(i-1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte testCase = sc.nextByte();
        while (testCase --> 0) {
            String N = sc.next();
            System.out.println(check(N));
        }
    }
}
