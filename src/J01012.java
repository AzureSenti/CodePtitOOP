import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            long n = sc.nextLong();
            if (n % 2 != 0) {
                System.out.println(0);
                continue;
            }

            int count = 0;

            for (long i = 1; i * i <= n; i++ ){
                if (n % i == 0){
                    if (i % 2 == 0) {
                        count++;
                    }
                    long doi = n/i;
                    if (doi != i && doi % 2 == 0){
                        count++;
                    }
                }

            }
            System.out.println(count);
        }
    }
}
