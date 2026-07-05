import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            System.out.println(cut_doi(n));
        }
    }

    static String cut(int n) {
        if ( n == 0 || n == 8 || n == 9) return "0";
        if (n == 1) return "1";
        return "loi";
    }

    static String cut_doi(String n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            if (cut(digit).equals("loi")) {
                return "INVALID";
            }
            String digi = cut(digit);
            if (!digi.equals("0") || result.length() > 0) {
                result.append(digi);
            }
        }
        if (result.length() == 0) {
            return "INVALID";
        }
        return result.toString();
    }
}