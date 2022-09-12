import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4Mang {
    public static void main(String[] args) {
        int[][] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int row = sc.nextInt();
        System.out.println("Nhap so cot");
        int col = sc.nextInt();
        array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap phan tu hang thu " + i + " cot thu " + j + " :");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran la: " + max);
        System.out.println("Gia tri nho nhat trong ma tran la: " + min);
    }
}
