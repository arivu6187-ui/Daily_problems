package day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principle:");
        int principle=sc.nextInt();
        System.out.print("Enter the Rate:");
        int rate=sc.nextInt();
        System.out.print("Enter the Time:");
        int time=sc.nextInt();
        int Simple_Interest=(principle*rate*time)/100;
        System.out.println("Simple interest is:"+Simple_Interest);

    }
}
