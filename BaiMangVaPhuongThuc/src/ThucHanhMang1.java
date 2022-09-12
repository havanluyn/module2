import java.util.Arrays;
import java.util.Scanner;

public class ThucHanhMang1 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        size = sc.nextInt();
        while (size < 0 || size > 20) {
            System.out.println("So phan tu cua mang khong dung hoac vuot qua 20 phan tu,hay nhap lai: ");
            size = sc.nextInt();
        }
        array=new int[size];
        for (int i=0;i< array.length;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            array[i]=sc.nextInt();
        }
        System.out.println("Mang ban vua nhap la:");
        System.out.println(Arrays.toString(array));
        for (int i=0;i< array.length/2;i++){
            int temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println("Mang sau khi dao nguoc la:");
        System.out.println(Arrays.toString(array));
    }
}
