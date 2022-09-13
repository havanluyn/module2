import java.util.Scanner;

public class BaiTap6Mang {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi muon kiem tra");
        String str= sc.nextLine();
        System.out.println("Nhap ki tu muon kiem tra");
        ch = sc.next().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)== ch){
                count++;
            }
        }
        System.out.println("Co "+count+" ki tu "+ch+" trong chuoi");
    }
}
