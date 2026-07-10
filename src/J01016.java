import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int cout = 0;
        for (int i = 0; i < N.length(); i++) {
            char so = N.charAt(i);
            if (so == '4' || so == '7') {
                cout += 1;
            }
        }
        if (cout == 4 || cout == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
