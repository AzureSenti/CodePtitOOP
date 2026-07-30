import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class KhachHang {
    int t;
    int d;

    public KhachHang(int t, int d) {
        this.t = t;
        this.d = d;
    }
}

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<KhachHang> ds = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int t = sc.nextInt();
                int d = sc.nextInt();
                ds.add(new KhachHang(t, d));
            }

            ds.sort((k1, k2) -> Integer.compare(k1.t, k2.t));

            long endTime = 0;

            for (KhachHang kh : ds) {
                endTime = Math.max(endTime, kh.t) + kh.d;
            }

            System.out.println(endTime);
        }
        sc.close();
    }
}