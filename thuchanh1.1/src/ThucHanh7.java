import java.util.Scanner;

public class ThucHanh7 {
    public static void main(String[] args) {
        float weight,height,bmi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap can nang(kg)");
        weight=sc.nextFloat();
        while(weight<1||weight>150){
            System.out.println("Nhap lai can nang,ban nhap chua phu hop");
            weight=sc.nextFloat();
        }
        System.out.println("Nhap chieu cao(m)");
        height=sc.nextFloat();
        while(height<0.2||height>2.5){
            System.out.println("Nhap lai chieu cao  (vidu:1.5)");
            height=sc.nextFloat();
        }
        bmi=weight/(height*height);
        if (bmi < 18)
            System.out.println("Chi so BMI cua ban la: "+bmi+ " Ban qua gay");
        else if (bmi < 25.0)
            System.out.println("Chi so BMI cua ban la: "+bmi+ " Ban binh thuong");
        else if (bmi < 30.0)
            System.out.println("Chi so BMI cua ban la: "+bmi+ " Ban hoi beo-Hay giam can");
        else
            System.out.println("Chi so BMI cua ban la: "+bmi+ " Ban qua beo-Hay dang ki tap the duc giam beo");
    }
}

