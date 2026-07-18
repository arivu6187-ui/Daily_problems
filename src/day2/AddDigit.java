package day2;

import java.util.Scanner;

class Add{
    public int number;
    int total=0;
    public void add(int number){
        while(number!=0){
            int digit=number%10;
            total=total+digit;
            number=number/10;
        }
        System.out.println("Addition of digit:"+total);

    }

}

public class AddDigit {
    public static void main(String[] args){
        Add add=new Add();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        add.add(number);

    }
}
