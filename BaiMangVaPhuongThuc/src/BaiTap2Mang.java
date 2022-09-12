import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2Mang {
    public static void main(String[] args) {
        Integer[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can kiem tra");
        int size = sc.nextInt();
        array = new Integer[size];
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhap phan tu muon chen:");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri muon chen:");
        int index = sc.nextInt();
        while (index < 0 || index > array.length - 2) {
            System.out.println("Khong the chen vao vi tri ban vua nhap:");
            System.out.println("Nhap lai vi tri ban muon chen:");
            index = sc.nextInt();
        }

        for (int i = array.length-2; i>=index;i--) {
            array[i+1]=array[i];
        }
        array[index] = x;
        System.out.println(Arrays.toString(array));
    }
}
