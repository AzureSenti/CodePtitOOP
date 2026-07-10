import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) {
        File myFile = new File("VANBAN.in");
        TreeSet<String> tap_hop_tu = new TreeSet<>();
        try (Scanner sc = new Scanner(myFile)) {
            while (sc.hasNext()) {
                String tu = sc.next();
                tap_hop_tu.add(tu.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            // pass
        }
        for (String tu : tap_hop_tu) {
            System.out.println(tu);
        }
    }
}
