package day6;

import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        int target=sc.nextInt();
        int[] arr=new int[]{1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                n=i;
                break;
            }
            else{
                n=-1;
            }

        }
        System.out.println(n);
    }
}
