import java.util.Scanner;

public class BaitapVongLap1 {
        public static void main(String[] args) {
            int choice = -1;
            Scanner input = new Scanner(System.in);
            while(choice != 0) {
                System.out.println("Menu");
                System.out.println("1. Ve hinh tam giac");
                System.out.println("2. Ve hinh Vuong");
                System.out.println("3. Ve hinh chu nhat");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Ve hinh tam giac");
                        for(int i=1;i<7;i++){
                            for (int j=i;j<7;j++){
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println("Ve hinh vuong");
                        for(int i=1;i<7;i++) {
                            for (int j = 1; j < 7; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        System.out.println("Ve hinh chu nhat");
                        for(int i=1;i<4;i++) {
                            for (int j = 1; j < 7; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                }
            }
        }
    }
