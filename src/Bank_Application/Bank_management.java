package Bank_Application;

import java.util.Scanner;

interface Account{
    void check_balance();
    void deposit(int Account_no,int Amount);
    void withdraw(int Amount);
    void transfer(int Amount);
    boolean verify();
}
class Account1 implements Account {
    int Amount;
    int Account_no;
    String cus_name;
    private int m_pin;
    float balance;

    public void check_balance(){
        details();
        if(verify()){
            System.out.println("Balance is "+balance);
        }
    }
    public void deposit(int Account_no,int Amount){
        details();
        balance+=Amount;
        System.out.println("Deposited Successfully!");
    }
    public void deposit(String cus_name,int Amount){
        details();
        balance+=Amount;
        System.out.println("Deposited Successfully!");
    }
    public void withdraw(int Amount){
        details();
        if(verify()){
            if(balance>=Amount) {
                balance -= Amount;
                System.out.println("Withdraw Successfully!");
            }else{System.out.println("Insufficient Balance!");}
        }
    }
    public void transfer(int Amount){
        System.out.println("Currently Not Available");
    }
    public boolean verify(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.print("Enter your pin:");
            int pin = sc.nextInt();
            if (pin == m_pin) {
                System.out.println("Pin Verified succesfully");
                return true;
            } else {
                System.out.println("try again");
            }
        }
        return false;
    }
    public void Setpin(int pin){
        if(verify()){
            this.m_pin=pin;
            System.out.println("Change Pin Successfully!");
        }
    }
    public void Getpin(){
        if(verify()){
            System.out.print("Your pin:"+m_pin);
        }
    }
    public void details(){
        System.out.println("customer name:"+cus_name);
        System.out.println("Account no:"+Account_no);
    }
    Account1(int Account_no,String cus_name,int m_pin,float balance){
        this.Account_no=Account_no;
        this.cus_name=cus_name;
        this.m_pin=m_pin;
        this.balance=balance;
    }
}
class Account2 implements Account{
    int Amount;
    int Account_no;
    String cus_name;
    private int m_pin;
    float balance;
    public void check_balance(){
        details();
        if(verify()){
            System.out.println("Balance is "+balance);
        }
    }
    public void deposit(int Account_no,int Amount){
        details();
        balance+=Amount;
        System.out.println("Deposited Successfully!");
    }
    public void deposit(String cus_name,int Amount){
        details();
        balance+=Amount;
        System.out.println("Deposited Successfully!");
    }
    public void withdraw(int Amount){
        details();
        if(verify()){
            if(balance>=Amount) {
                balance -= Amount;
                System.out.println("Withdraw Successfully!");
            }else{System.out.println("Insufficient Balance!");}
    }
    }
    public void transfer(int Amount){
        System.out.println("Currently Not Available");
    }
    public boolean verify(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.print("Enter your pin:");
            int pin = sc.nextInt();
            if (pin == m_pin) {
                System.out.println("Pin Verified................");
                return true;
            } else {
                System.out.println("try again");
            }
        }
        return false;
    }
    public void details(){
        System.out.println("customer name:"+cus_name);
        System.out.println("Account no:"+Account_no);
    }
    public void Setpin(int pin){
        if(verify()){
            this.m_pin=pin;
            System.out.println("Change Pin Successfully!");
        }
    }
    public void Getpin(){
        if(verify()){
            System.out.print("Your pin:"+m_pin);
        }
    }
    Account2(int Account_no,String cus_name,int m_pin,float balance){
        this.Account_no=Account_no;
        this.cus_name=cus_name;
        this.m_pin=m_pin;
        this.balance=balance;
    }
}
public class Bank_management {
    public static void main(String[] args){
        Account1 a1 = new Account1(101,"Arivu",12345,12000);
        Account1 a2=new Account1(102,"Kavi",12345,12000);
        Account2 b=new Account2(1001,"Harish",123654,25000);
        a1.withdraw(100);
    }
}
