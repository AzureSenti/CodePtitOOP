import java.util.Scanner;

public class J03017 {
    static int remove100(String S, int count)  {
        String[] cat_chuoi = S.split("100",-1);
        if (cat_chuoi.length == 1) {
            return count;
        } else {
            String chuoi_moi = String.join("",cat_chuoi);
            return remove100(chuoi_moi, count + 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            String a = sc.next();
            System.out.println(remove100(a,0) * 3);
        }
    }
}
