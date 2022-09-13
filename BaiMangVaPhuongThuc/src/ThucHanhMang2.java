import java.util.Scanner;

public class ThucHanhMang2 {
    public static void main(String[] args) {
        String[] array={"Luyn","Duy","Cuong","Hoan","Loi","Dung"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Hay nhap ten hoc vien ban muon tim");
        String ten= sc.nextLine();
        int count=0;
        for (int i=0;i< array.length;i++){
            if(ten.toLowerCase().equals(array[i].toLowerCase())){
                System.out.println("hoc vien ban vua nhap co stt la "+i+":"+array[i]);
                count++;
            }
        }
        if (count==0){
            System.out.println("hoc vien ban muon tim khong co trong danh sach");
        }

        String str= array[0];
        for (int i=0;i< array.length;i++){
            if (array[i].trim().length()>str.trim().length()){
                str=array[i];
            }
        }
        System.out.println("Hoc sinh co ten dai nhat la: "+str);
    }

}
