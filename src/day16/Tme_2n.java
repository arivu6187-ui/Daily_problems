package day16;

import java.util.Scanner;

public class Tme_2n {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter number:");
            a[i]=sc.nextInt();
        }int count=0;
        for(int i=0;i<10;i++){
            count=count+a[i];
        }
        System.out.println("count"+count);
    }
}
