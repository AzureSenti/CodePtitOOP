import java.util.Scanner;

public class J01024 {
    static String check(String N) {
        for (char num : "3456789".toCharArray()) {
            if (N.indexOf(num) != -1) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase --> 0) {
            String N = sc.next();
            System.out.println(check(N));
        }
    }
}
