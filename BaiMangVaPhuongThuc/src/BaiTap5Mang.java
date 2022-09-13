import java.util.Scanner;

public class BaiTap5Mang {
    public static void main(String[] args) {
        float[][] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int row = sc.nextInt();
        System.out.println("Nhap so cot");
        int col = sc.nextInt();
        array = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap phan tu hang thu " + i + " cot thu " + j + " :");
                array[i][j] = sc.nextFloat();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Nhap cot muon tinh tong");
        int colDel = sc.nextInt();
        while (colDel > row - 1 || colDel < 0) {
            System.out.println("Nhap cot muon tinh tong");
            colDel = sc.nextInt();
        }
        float totalCol = 0;
        for (int i = 0; i < row; i++) {
            totalCol = totalCol + array[i][colDel];
        }
        System.out.println("Tong cot thu "+colDel+" la "+totalCol);
        float totalDia=0;
        if(col==row){
            for (int i = 0; i < row; i++){
                totalDia=totalDia+array[i][i];
            }
            System.out.println("Tong duong cheo chinh cua ma tran vuong "+row+" x "+row+" la: "+ totalDia);
        }
        else {
            System.out.println("Ma tran khong co duong cheo chinh");
        }
    }
}
