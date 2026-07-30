import java.math.BigInteger;
import java.util.Scanner;

class PhanSo {
    private BigInteger tu;
    private BigInteger mau;

    public PhanSo(long t, long m) {
        this.tu = BigInteger.valueOf(t);
        this.mau = BigInteger.valueOf(m);
    }

    void toiGian() {
        BigInteger ucln = this.tu.gcd(this.mau);
        this.tu = this.tu.divide(ucln);
        this.mau = this.mau.divide(ucln);
    }

    void inRa() {
        System.out.println(this.tu + "/" + this.mau);
    }
}


public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo ps1 = new PhanSo(a, b);
        ps1.toiGian();
        ps1.inRa();
    }
}

