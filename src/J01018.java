import java.util.Scanner;

public class J01018 {
    static String check(String N) {
        int sum = N.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();

        if (sum % 10 != 0) {
            return "NO";
        }
        for (int i=1; i < N.length(); i++) {
            if (Math.abs((int) N.charAt(i) - (int) N.charAt(i-1)) != 2) {
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
