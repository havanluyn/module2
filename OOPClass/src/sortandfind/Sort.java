package sortandfind;

import opp.Ex;

import java.util.Arrays;

public class Sort {

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int swap = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
    }

    public void interchangeSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i + 1;
            int number = numbers[j];
            while (j - 1 >= 0 && number < numbers[ j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = number;
        }
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minindex]) {
                    minindex = j;
                }
            }
            int min = numbers[minindex];
            numbers[minindex] = numbers[i];
            numbers[i] = min;
        }
    }
}
