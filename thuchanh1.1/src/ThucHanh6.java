import java.util.Scanner;

public class ThucHanh6 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra:");
        year=sc.nextInt();
        while(year<1){
            System.out.println("Nhap nam khong phu hop,hay nhap lai:");
            year=sc.nextInt();
        }
        if (year%4==0){
            if(year%100==0){
                if (year%400==0){
                    System.out.println("Nam "+year+ " la nam nhuan");
                }
                else{
                    System.out.println("Nam "+year+ " khong phai la nam nhuan");
                }
            }
            else {
                System.out.println("Nam "+year+ " la nam nhuan");
            }
        }
        else{
            System.out.println("Nam "+year+ " khong phai la nam nhuan");
        }
    }
}
