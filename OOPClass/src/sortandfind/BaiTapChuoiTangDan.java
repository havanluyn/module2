package sortandfind;

import java.util.Scanner;

public class BaiTapChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can sap xep");
        String str = sc.nextLine();
        System.out.println(sortString(str));
    }

    public static String sortString(String str) {
        String st = "";
        int count=0;
        while(count<str.length()){
            char min = '}';
            for (int i = 0; i < str.length(); i++) {
                boolean check = false;
                if (str.charAt(i) <= min) {
                    if (st.length()==0){
                        min = str.charAt(i);
                    }else {
                        for (int j = 0; j < st.length(); j++) {
                            if (str.charAt(i) == st.charAt(j)) {
                                check = true;
                            }
                        }
                    }
                    if (check == false) {
                        min = str.charAt(i);
                    }
                }
            }
            if(min!='}'){
                st = st + min;
                count++;
            }else{
                count++;
            }
        }
        return st;
    }
    public static String sOrtString(String str) {
        String st = "";
        int count=0;
        while(count<str.length()){
            char min = '}';
            for (int i = 0; i < str.length(); i++) {
                boolean check = false;
                if (str.charAt(i) <= min) {
                    if (st.length()==0){
                        min = str.charAt(i);
                    }else {
                        for (int j = 0; j < st.length(); j++) {
                            if (str.charAt(i) == st.charAt(j)) {
                                check = true;
                            }
                        }
                    }
                    if (check == false) {
                        min = str.charAt(i);
                    }
                }
            }
            if(min!='}'){
                st = st + min;
                count++;
            }else{
                count++;
            }
        }
        return st;
    }
}

