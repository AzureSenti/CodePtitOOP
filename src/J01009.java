import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        long[] giaiThua = new long[21];
        giaiThua[1] = 1;
        for (int i = 2; i < giaiThua.length; i++) {
            giaiThua[i] = giaiThua[i - 1] * i;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += giaiThua[i];
        }
        System.out.println(sum);
    }
}
