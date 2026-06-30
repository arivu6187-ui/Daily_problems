package day6;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
            System.out.println(arr1[i]);
        }
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.getConcatenation(arr)));
    }
}
