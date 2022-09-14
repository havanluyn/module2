import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a khac 0");
        double a = sc.nextDouble();
        while (a == 0) {
            System.out.println("Nhap a khac 0");
            a = sc.nextDouble();
        }
        System.out.println("Nhap b ");
        double b = sc.nextDouble();
        System.out.println("Nhap c ");
        double c = sc.nextDouble();
        phuongTrinhBac2 giaiPtb2 = new phuongTrinhBac2(a, b, c);
        if (giaiPtb2.delta() > 0) {
            System.out.printf("Nghiem thu nhat cua pt la: %.3f", giaiPtb2.result1());
            System.out.println("");
            System.out.printf("Nghiem thu nhat cua pt la: %.3f", giaiPtb2.result2());
            System.out.println("");
        } else if (giaiPtb2.delta() == 0) {
            System.out.printf("Nghiem thu nhat cua pt la: %.3f", giaiPtb2.result());
            System.out.println("");
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }

    public static class phuongTrinhBac2 {
        double a, b, c;

        public phuongTrinhBac2(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double delta() {
            return b * b - 4 * a * c;
        }

        public double result1() {
            return (-b - Math.sqrt(delta())) / (2 * a);
        }

        public double result2() {
            return (-b + Math.sqrt(delta())) / (2 * a);
        }

        public double result() {
            return -b / 2 * a;
        }
    }
}
