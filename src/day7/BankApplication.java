//package day7;
//import java.util.Scanner;
//class BankUser {
//    String name;
//    long acc_no;
//    double balance;
//    private int pin;
//    BankUser(String n,long a,double b,int p){
//        name=n;
//        acc_no=a;
//        balance=b;
//    }
//    public void Verify(int p){
//        if(p==pin) {
//            System.out.println("Name:"+name);
//            System.out.println("Account Number:"+acc_no);
//            System.out.println("Balance:"+balance);
//        }
//    }
//    public void withdraw(double balance) {
//
//    }
//
//    public void deposit() {
//
//    }
//
//    public void checkbalance(double balance) {
//        System.out.println("Current Balance:" + balance);
//    }
//}
//public class BankApplication{
//    public static void main(String[] args){
//        BankUser u1=new BankUser("niranjan",12345678,2500.1,12345);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Account Number");
//        String account=sc.next();
//        System.out.println("1.Info 2.Withdraw 3.Deposit 4.CheckBalance");
//        int a=sc.nextInt();
//        if(a==1){
//            u1.Verify(int pass);
//
//        }
//        else if(a==2){
//
//        }else if(a==3){
//
//        }
//        else if(a==4){
//
//        }
//        else{
//            System.out.println("Invalid input");
//        }
//
//
//
//    }
//}
