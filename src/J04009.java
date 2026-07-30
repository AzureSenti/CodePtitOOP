import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/*
class Point {
    double x;
    double y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    double distance(Point secondPoint) {
        double a = this.x - secondPoint.x;
        double b = this.y - secondPoint.y;
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
        return "";
    }


}

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());

            double[] canh = {p1.distance(p2),p1.distance(p3),p2.distance(p3)};
            Arrays.sort(canh);
            if (canh[0] + canh[1] <= canh[2]) {
                System.out.println("INVALID");
            } else {
                double dienTich = Math.sqrt((canh[0]+canh[1]+canh[2])*(canh[0]+canh[1]-canh[2])*(-canh[0]+canh[1]+canh[2])*(canh[0]-canh[1]+canh[2]))/4;
                System.out.printf("%.2f%n", dienTich);
            }
        }

    }
}
*/