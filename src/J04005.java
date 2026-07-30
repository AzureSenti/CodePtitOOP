import java.util.Scanner;

class ThiSinh {
    private String ten;
    private String ngaySinh;
    private float diem1;
    private float diem2;
    private float diem3;
    private float tongDiem;

    public ThiSinh(String ten, String ngaySinh, float diem1, float diem2, float diem3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = diem1 + diem2 + diem3;
    }

    public void hienThongTin() {
        System.out.println(ten + " " + ngaySinh + " " + String.format("%.1f", tongDiem));
    }
}


public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts1 = new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        ts1.hienThongTin();
    }
}
