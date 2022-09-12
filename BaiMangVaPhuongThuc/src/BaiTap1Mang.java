import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1Mang {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu can kiem tra");
        int size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ":");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhap phan tu muon xoa:");
        int x = sc.nextInt();
        int cnt=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=x){
                array[cnt]=array[i];
                cnt++;
            }
        }
        int[] arr =new int[cnt];
        for (int i = 0; i < arr.length; i++){
            arr[i]=array[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
