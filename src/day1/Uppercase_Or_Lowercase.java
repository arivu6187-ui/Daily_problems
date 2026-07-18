package day1;

import java.util.Scanner;

public class Uppercase_Or_Lowercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character:");
        char a=sc.next().charAt(0);
        if(a>97 &&a<122){
            System.out.println("Given letter is LowerCase");
        }
        else if(a>65 && a>91){
            System.out.println("Given letter is UpperCase");
        }
        else{
            System.out.println("Given is not a letter");
        }


    }
}
