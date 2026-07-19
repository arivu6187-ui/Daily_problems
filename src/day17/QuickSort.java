package day17;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int st, int end) {
        if(st>=end){
            return ;
        }
        int low=st;
        int high=end;
        int mid=low+(end-low)/2;
        int piovt=arr[mid];
        while(st<=end){
            while(arr[st]<piovt){
                st++;
            }
            while(arr[end]>piovt){
                end++;
            }
            if(st<=end){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                end--;
                st++;
            }
            quickSort(arr,low,end);
            quickSort(arr,st,high);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[10];
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
