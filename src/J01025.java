import java.util.Arrays;
import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hinh1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] hinh2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int doc = Math.max(hinh1[2], hinh2[2]) - Math.min(hinh1[0],hinh2[0]);
        int ngang = Math.max(hinh1[3], hinh2[3]) - Math.min(hinh1[1],hinh2[1]);
        System.out.printf("%.0f",Math.pow(Math.max(doc, ngang), 2));
    }
}
