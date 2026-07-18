package day8;

import java.util.Scanner;

class Machines1{
    int balance;
    int Amount;
    public void deposit(int amount){
        balance=Amount+balance;
        System.out.println("Amount deposited successfully");
    }
    public void withdraw(int Amount){
        if(Amount>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance=balance-Amount;
            System.out.println("withdraw successfully");
        }
    }
    public void checkBalance(){
        System.out.println("Balance :"+balance);
    }
    Machines1(int balance){
        this.balance=balance;
    }
}
class Machines2 extends Machines1{
    int new_pin;
    public void change_pin(int pin){
        new_pin=pin;
        System.out.println("pin Changed successfully");
    }
    public void activate_card(int pin){
        if(new_pin==pin){
            System.out.println("Activate card successfully");
        }else{
            System.out.println("Invalid pin");
        }
    }
    Machines2(int Balance,int new_pin){
        super(Balance);
        this.new_pin=new_pin;
    }
}

public class Machine {
    static void main() {
        Machines2 user1=new Machines2(100000,12345);
        user1.activate_card(12345);
        user1.change_pin(54321);
        user1.deposit(1000);
        user1.withdraw(5000);
        user1.checkBalance();

    }
}
