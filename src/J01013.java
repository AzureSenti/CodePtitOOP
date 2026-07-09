import java.util.Scanner;

public class J01013 {
    static final int MAX = 2000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] uoc_nho_nhat = new int[MAX+1];

        for (int i = 0; i <= MAX; i++) {
            uoc_nho_nhat[i] = i;
        }

        for (int i = 2; i*i <= MAX; i++) {
            if (uoc_nho_nhat[i] == i) {
                for (int j = i*i; j <= MAX; j+=i) {
                    if (uoc_nho_nhat[j] == j) {
                        uoc_nho_nhat[j] = i;
                    }
                }
            }
        }

        int N = sc.nextInt();
        long sum = 0;

        while (N-- > 0) {
            int a = sc.nextInt();
            while (a > 1) {
                sum += uoc_nho_nhat[a];
                a /= uoc_nho_nhat[a];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}