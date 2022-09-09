import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        float a,b,c;
        System.out.println("Phuong trinh co dang ax+b=c");
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a:");
        a= sc.nextFloat();
        System.out.println("Nhap b:");
        b= sc.nextFloat();
        System.out.println("Nhap c:");
        c= sc.nextFloat();
        if (a!=0){
            System.out.println("Nghiem cua phuong trinh la:"+(c-b)/a);}
            else if(b==c){
            System.out.println("Phuong trinh co vo so nghiem:");
            }
            else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
