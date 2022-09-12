public class BaiTapVongLap3 {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int check = 0;
        for (number = 2; number <= 100; number++) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check++;
                }
            }
            if (check == 0) {
                System.out.println(number);
            }
            check = 0;
        }
    }
}
