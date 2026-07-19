package day17;

import java.util.Arrays;

class Msort{
    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length - 1);
        left = mergesort(left);
        right = mergesort(right);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] ans = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[index] = left[i];
                index++;
                i++;
            } else {
                ans[index] = right[j];
                index++;
                j++;
            }
        }
        while (i < left.length) {
            ans[index] = left[i];
            index++;
            i++;
        }
        while (j < right.length) {
            ans[index] = right[j];
            index++;
            j++;
        }
        return ans;
    }
}



public class MergeSort {
    static void main() {
        Msort sort=new Msort();
        int[] arr=new int[]{1,9,6,5,7,4};
        sort.mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
