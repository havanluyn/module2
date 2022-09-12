import java.util.Scanner;

public class ThucHanhMang5 {
    public static int minValue(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ty phu ban muon kiem tra");
        int size=sc.nextInt();
        array=new int[size];
        for (int i=0;i< array.length;i++){
            System.out.println("Nhap so tai san cua ty phu thu "+i+":");
            array[i]=sc.nextInt();
        }
        int index=minValue(array);
        System.out.println("ty phu co tai san it nhat la ty phu thu: "+index+" voi tai san la "+array[index]+" ty $");
    }
}
