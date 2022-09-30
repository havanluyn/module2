package stack;

import java.util.Arrays;
import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        int[] arr= {2, 4, 1, 5, 6, 3, 7};
        Arrays.sort(arr);
        LinkedList<Integer> stack =new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
    }

}
