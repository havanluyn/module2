package sortandfind;

public class Find {
    public static int binarySearch(int[] numbers, int number) {
        int start = 0;
        int end = numbers.length - 1;
        while (end >= start) {
            int mid = (end + start) / 2;
            if (number > numbers[mid]) {
                start = mid + 1;
            } else if (number == numbers[mid]) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
