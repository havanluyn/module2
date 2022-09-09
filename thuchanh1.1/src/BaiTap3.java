import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        double VND,USD,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("--- 1. Chuyen VND sang USD----");
        System.out.println("--- 2. Chuyen USD sang VND----");
        count=sc.nextInt();
        while (count!=1&&count!=2){
            System.out.println("Ban chi duoc chon 1 hoac 2");
            count=sc.nextDouble();
        }
        if (count==1){
            System.out.println("Moi ban nhap so tien VND can chuyen");
            VND=sc.nextDouble();
            USD=VND/23000;
            System.out.println("VND==>USD: "+ USD+"$");
        }
        if (count==2){
            System.out.println("Moi ban nhap so tien USD can chuyen");
            USD=sc.nextDouble();
            VND=USD*23000;
            System.out.println("USD==>VND: "+ VND+"Vnd");
        }
    }
}
