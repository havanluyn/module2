import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        width = sc.nextFloat();
        System.out.println("Nhap chieu rong: ");
        height = sc.nextFloat();
        System.out.println("Dien tich hinh chu nhat la : " +(width*height));
    }
}
