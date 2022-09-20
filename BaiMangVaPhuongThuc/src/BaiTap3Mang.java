import java.util.Arrays;
import java.util.Scanner;
public class BaiTap3Mang {
    public static void main(String[] args) {
        int[] array1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang 1");
        int size1 = sc.nextInt();
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            array1[i] = sc.nextInt();
        }

        int[] array2;
        System.out.println("Nhap so phan tu mang 2");
        int size2 = sc.nextInt();
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            array2[i] = sc.nextInt();
        }
        int[] array3=new int[size1+size2];
        for (int i=0;i< array1.length;i++){
            array3[i]=array1[i];
        }
        for (int i=0;i< array2.length;i++){
            array3[i+size1]=array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
