import java.util.Scanner;
import java.util.TreeMap;

public class J02009 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        long end_time = 0;
        TreeMap<Long, Long> hang_doi = new TreeMap<>();
        while (testCase --> 0) {
            long T = sc.nextLong();
            long D = sc.nextLong();
            hang_doi.put(T,D);
        }


        for (long khach: hang_doi.keySet()) {
            end_time = Math.max(end_time, khach) + hang_doi.get(khach);
        }
        System.out.println(end_time);
    }
}
