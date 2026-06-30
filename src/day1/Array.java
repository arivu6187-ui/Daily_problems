package day1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        int[] arr=new int[10];
        int sum=0;
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++) {
            if(i<5){
                arr[i]=arr1[i];
            }
            else{
                arr[i]=arr2[i-5];
            }
        }
        System.out.println("===================================");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        System.out.println(sum);

    }
}
