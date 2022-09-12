import java.util.Scanner;

public class ThucHanhMang4 {
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
        int max=array[0];
        int index=0;
        for (int i=0;i< array.length;i++){
            if (array[i]>max){
                max=array[i];
                index=i;
            }
        }
        System.out.println("Ty phu co tai san lon nhat la ty phu thu "+index+" voi tai san la:"+max);
    }
}
