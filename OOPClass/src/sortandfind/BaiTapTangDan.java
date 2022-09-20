package sortandfind;

import java.util.Scanner;

public class BaiTapTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can sap xep");
        String str = sc.nextLine();

        System.out.println(sortString(str));
    }

    public static String sortString(String str) {
        String st = "";
        int count = 0;
        int a=str.length();
        while (count < a) {
            String str1="";
            char min = str.charAt(0);
            int index=0;
            for (int i=0;i<str.length();i++){
                if(str.charAt(i)<=min){
                    min=str.charAt(i);
                    index=i;
                }
            }
            for(int i=0;i<str.length();i++){
                if(i!=index){
                    str1=str1+str.charAt(i);
                }
            }
            str=str1;
            st=st+min;
            count++;
        }
        return st;
    }

}

