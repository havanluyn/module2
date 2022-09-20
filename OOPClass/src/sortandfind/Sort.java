package sortandfind;

import opp.Ex;

import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = numbers.length-1; j>i; j--) {
                if (numbers[j] < numbers[j-1]) {
                    int swap = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }
        return numbers;
    }
    public static int[] insertionSort(int[] numbers){
         for (int i = 0; i < numbers.length - 1; i++) {
            int j = i + 1;
            int number = numbers[j];
            while (number < numbers[j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = number;
        }
        return numbers;
    }
    public static int[] selectionSort(int[] numbers){
        for (int i=0;i<numbers.length-1;i++){
            int minindex=i;
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[j]<numbers[minindex]){
                    minindex=j;
                }
            }
            int min = numbers[minindex];
            numbers[minindex]=numbers[i];
            numbers[i]=min;
        }
        return numbers;
    }

}
