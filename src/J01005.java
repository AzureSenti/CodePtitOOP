import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int j = 1; j < n; j++) {
                System.out.printf("%.6f ", Math.sqrt((j * Math.pow(h, 2)) / n));
            }
            System.out.println();
        }
    }
}
