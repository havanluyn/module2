package opp;

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai hinh chu nhat: ");
        double width = sc.nextDouble();
        System.out.println("Nhap vao chieu rong hinh chu nhat: ");
        double height = sc.nextDouble();
        hinhChuNhat hinChuNhat= new hinhChuNhat(width,height);
        double area=hinChuNhat.getArea();
        double perimeter=hinChuNhat.getPerimeter();
        System.out.printf("Dien tich hinh chu nhat la: %.4f",area);
        System.out.println("");
        System.out.printf("Chu vi hinh chu nhat la: %.4f",perimeter);
    }

    public static class hinhChuNhat {
        double width, height;

        public hinhChuNhat() {
        }

        public hinhChuNhat(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return (width + height) * 2;
        }
    }
}
