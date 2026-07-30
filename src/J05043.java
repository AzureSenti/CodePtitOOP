import java.util.Scanner;

class NhanVien {
    private String maNV;
    private String hoTen;
    private String chucVu;
    private long luongCoBan;
    private int ngayCong;

    public NhanVien(int thuTu, String hoTen, String chucVu, long luongCoBan, int ngayCong) {
        this.maNV = String.format("NV%02d", thuTu);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
    }

    public long phuCapChucVu() {
        switch (this.chucVu) {
            case "GD":  return 500;
            case "PGD": return 400;
            case "TP":  return 300;
            case "KT":  return 250;
            default:    return 100;
        }
    }

    public long luongChinh() {
        return this.luongCoBan * this.ngayCong;
    }

    public long tamUng() {
        long tongThuNhap = phuCapChucVu() + luongChinh();
        double mucTamUng = tongThuNhap * 2.0 / 3.0;

        if (mucTamUng < 25000) {
            return Math.round(mucTamUng / 1000.0) * 1000;
        } else {
            return 25000;
        }
    }

    public long conLai() {
        return luongChinh() + phuCapChucVu() - tamUng();
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + phuCapChucVu() + " " + luongChinh() + " " + tamUng() + " " + conLai();
    }
}

public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int T = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= T; i++) {
                String hoTen = sc.nextLine();
                String chucVu = sc.nextLine();
                long luongCoBan = Long.parseLong(sc.nextLine());
                int ngayCong = Integer.parseInt(sc.nextLine());

                NhanVien nv = new NhanVien(i, hoTen, chucVu, luongCoBan, ngayCong);
                System.out.println(nv);
            }
        }
        sc.close();
    }
}