package day1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dividend:");
        int dividend=sc.nextInt();
        System.out.print("Enter the divisor:");
        int divisor=sc.nextInt();
        System.out.println("Division:"+dividend/divisor);
        System.out.println("Floating Division:"+dividend%divisor);
    }
}
