import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger[] ketqua = a.divideAndRemainder(new BigInteger("11"));
            if (ketqua[1].equals(new BigInteger("0"))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
