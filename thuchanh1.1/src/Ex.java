public class Ex {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
                if ((i * j) % 2 == 0 && count < 20) {
                    count++;
                    if (count > 10) {
                        total += (i * j);
                    }
                }
            }
            System.out.println("\n");
        }
        System.out.println(total);

    }
}

