package day1;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
        int a = 350;
//        int b=72;
//        while(b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
//        int gcd=a;
//        int lcm=(a+b)/gcd;
//        System.out.println(lcm);
//        System.out.println(gcd);
//        if (a <= 1) {
//            System.out.println("Not prime");
//            return;
//        }
//        for (int i = 2; i < a/2; i++) {
//            if (a % i == 0) {
//                System.out.println("Not prime");
//                return;
//            }
//        }
        int num=28;
//        int count=0;
//        while(num!=0){
//            a=num%10;
//            num=num/10;
//            count++;
//        }//.Math.pow(5,3)
        int sum=0;
        int temp=num;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) {
                sum = sum + i;
            }
        }
        if(sum==temp){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }





    }
}