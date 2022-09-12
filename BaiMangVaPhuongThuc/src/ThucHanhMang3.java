import java.util.Scanner;

public class ThucHanhMang3 {
    public static void main(String[] args) {
        double doF,doC,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("--- 1. Chuyen do F sang do C----");
        System.out.println("--- 2. Chuyen do C sang do F----");
        count=sc.nextInt();
        while (count!=1&&count!=2){
            System.out.println("Ban chi duoc chon 1 hoac 2");
            count=sc.nextDouble();
        }
        if (count==1){
            System.out.println("Moi ban nhap do F muon chuyen");
            doF=sc.nextDouble();
            doC=(5.0/9)*(doF-32);
            System.out.printf(doF+" doF==>doC:%.4fC",doC);
        }
        if (count==2){
            System.out.println("Moi ban nhap do C muon chuyen");
            doC=sc.nextDouble();
            doF=doC/(5.0*9)+32;
            System.out.printf(doC+" doC==>doF:%.4fC",doF);
        }
    }
}
