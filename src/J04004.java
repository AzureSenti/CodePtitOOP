import java.math.BigInteger;
import java.util.Scanner;
/*
class PhanSo {
    private BigInteger tu;
    private BigInteger mau;

    public PhanSo(BigInteger t, BigInteger m) {
        this.tu = t;
        this.mau = m;
    }

    void toiGian() {
        BigInteger ucln = this.tu.gcd(this.mau);
        this.tu = this.tu.divide(ucln);
        this.mau = this.mau.divide(ucln);
    }

    void inRa() {
        System.out.println(this.tu + "/" + this.mau);
    }

    PhanSo cong(PhanSo ps2) {
        BigInteger mauChung = this.mau.multiply(ps2.mau).divide(this.mau.gcd(ps2.mau));
        BigInteger tuMoi = this.tu.multiply(mauChung.divide(this.mau)).add(ps2.mau.multiply(mauChung.divide(ps2.mau)));
        return new PhanSo(tuMoi, mauChung);
    }
}


public class J04004 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo(BigInteger.valueOf(sc.nextLong()), BigInteger.valueOf(sc.nextLong()));
        PhanSo ps2 = new PhanSo(BigInteger.valueOf(sc.nextLong()), BigInteger.valueOf(sc.nextLong()));
        PhanSo ps3 = ps1.cong(ps2);
        //ps3.toiGian();
        ps3.inRa();
    }
}
*/