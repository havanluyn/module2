

public class BaiTapVongLap2 {
    public static void main(String[] args) {
            int number;
            int count=0;
            int check = 0;
            for (number=2;count<=20;number++){
            for (int i=2; i<= Math.sqrt(number);i++) {
                if (number % i == 0) {
                    check++;
                }
            }
            if (check==0){
                System.out.println(number);
                count++;
            }
                check = 0;
            }
        }
}
