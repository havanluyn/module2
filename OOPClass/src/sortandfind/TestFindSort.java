package sortandfind;

import accessmodifier.Baitap2;

import java.util.Arrays;

public class TestFindSort {
    public static void main(String[] args) {
        int[] numbers={1, 9, 4, 6, 5, -4};
        Sort.insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
//        Find.binarySearch(numbers,7);
//        System.out.println();
    }
}
