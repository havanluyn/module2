import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can doc");
        int number = sc.nextInt();
        while (number > 999 || number < 0) {
            System.out.println("Khong doc duoc, hay nhap lai");
            number = sc.nextInt();
        }
        int n = number;
        String hundreds = "";
        String ten = "";
        String one = "";
        int hundred = n / 100;
        int tens = (n % 100) / 10;
        int ones = (n % 100) % 10;
        int tenss= (n%100);
        hundreds=hundreds(hundred);
//        switch (hundred) {
//            case 0:
//                hundreds = "";
//                break;
//            case 1:
//                hundreds = "one hundred";
//                break;
//            case 2:
//                hundreds = "two hundred";
//                break;
//            case 3:
//                hundreds = "three hundred";
//                break;
//            case 4:
//                hundreds = "four hundred";
//                break;
//            case 5:
//                hundreds = "five hundred";
//                break;
//            case 6:
//                hundreds = "six hundred";
//                break;
//            case 7:
//                hundreds = "seven hundred";
//                break;
//            case 8:
//                hundreds = "eight hundred";
//                break;
//            case 9:
//                hundreds = "nine hundred";
//                break;
//        }
        ten=ten(tens,tenss);
//        switch (tens) {
//            case 1:
//                switch (n % 100) {
//                    case 10:
//                        ten = "ten";
//                        break;
//                    case 11:
//                        ten = "eleven";
//                        break;
//                    case 12:
//                        ten = "twelve";
//                        break;
//                    case 13:
//                        ten = "thirteen";
//                        break;
//                    case 14:
//                        ten = "fourteen";
//                        break;
//                    case 15:
//                        ten = "fifteen";
//                        break;
//                    case 16:
//                        ten = "sixteen";
//                        break;
//                    case 17:
//                        ten = "seventeen";
//                        break;
//                    case 18:
//                        ten = "eighteen";
//                        break;
//                    case 19:
//                        ten = "nineteen";
//                        break;
//                }
//                break;
//            case 2:
//                ten = "twenty";
//                break;
//            case 3:
//                ten = "thirty";
//                break;
//            case 4:
//                ten = "fourty";
//                break;
//            case 5:
//                ten = "fifty";
//                break;
//            case 6:
//                ten = "sixty";
//                break;
//            case 7:
//                ten = "seventy";
//                break;
//            case 8:
//                ten = "eighty";
//                break;
//            case 9:
//                ten = "ninety";
//                break;
//        }
        one=one(ones);
//        switch (ones) {
//            case 1:
//                one = "one";
//                break;
//            case 2:
//                one = "two";
//                break;
//            case 3:
//                one = "three";
//                break;
//            case 4:
//                one = "four";
//                break;
//            case 5:
//                one = "five";
//                break;
//            case 6:
//                one = "six";
//                break;
//            case 7:
//                one = "seven";
//                break;
//            case 8:
//                one = "eight";
//                break;
//            case 9:
//                one = "nine";
//                break;
//        }
        if ((n%100)/10==1)
        System.out.println(hundreds + " " + ten);
        else if (n!=0)
            System.out.println(hundreds + " " + ten + " " + one);
        else {
            System.out.println("zero");
        }

    }
    public static String hundreds(int hundred){
        String hundreds = null;
        switch (hundred) {
            case 0:
                hundreds = "";
                break;
            case 1:
                hundreds = "one hundred";
                break;
            case 2:
                hundreds = "two hundred";
                break;
            case 3:
                hundreds = "three hundred";
                break;
            case 4:
                hundreds = "four hundred";
                break;
            case 5:
                hundreds = "five hundred";
                break;
            case 6:
                hundreds = "six hundred";
                break;
            case 7:
                hundreds = "seven hundred";
                break;
            case 8:
                hundreds = "eight hundred";
                break;
            case 9:
                hundreds = "nine hundred";
                break;
        }
        return hundreds;
    }
    public static String ten(int tens,int tenss){
        String ten=null;
        switch (tens) {
            case 1:
                switch (tenss) {
                    case 10:
                        ten = "ten";
                        break;
                    case 11:
                        ten = "eleven";
                        break;
                    case 12:
                        ten = "twelve";
                        break;
                    case 13:
                        ten = "thirteen";
                        break;
                    case 14:
                        ten = "fourteen";
                        break;
                    case 15:
                        ten = "fifteen";
                        break;
                    case 16:
                        ten = "sixteen";
                        break;
                    case 17:
                        ten = "seventeen";
                        break;
                    case 18:
                        ten = "eighteen";
                        break;
                    case 19:
                        ten = "nineteen";
                        break;
                }
                break;
            case 2:
                ten = "twenty";
                break;
            case 3:
                ten = "thirty";
                break;
            case 4:
                ten = "fourty";
                break;
            case 5:
                ten = "fifty";
                break;
            case 6:
                ten = "sixty";
                break;
            case 7:
                ten = "seventy";
                break;
            case 8:
                ten = "eighty";
                break;
            case 9:
                ten = "ninety";
                break;
        }
        return ten;
    }
    public static String one(int ones){
        String one="";
        switch (ones) {
            case 1:
                one = "one";
                break;
            case 2:
                one = "two";
                break;
            case 3:
                one = "three";
                break;
            case 4:
                one = "four";
                break;
            case 5:
                one = "five";
                break;
            case 6:
                one = "six";
                break;
            case 7:
                one = "seven";
                break;
            case 8:
                one = "eight";
                break;
            case 9:
                one = "nine";
                break;
        }
        return one;
    }
}


