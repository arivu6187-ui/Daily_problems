package day1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int total=0;
        while(number!=0){
            int digit=number%10;
            total=total*10+digit;
            number=number/10;
        }
        System.out.println("Reverse Number is:"+total);
    }
}
