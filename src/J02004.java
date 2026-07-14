
import java.util.Scanner;

public class J02004 {
    public static String check(int N, String[] mang) {
        for (int i = 0; i < N / 2; i++) {
            if (!mang[i].equals(mang[N - i - 1])) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase --> 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String[] mang = sc.nextLine().split(" ");
            System.out.println(check(N, mang));
        }
        sc.close();
    }
}
