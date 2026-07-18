package day7;

class Atm{
    int Amount;
    int balance;

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
    Atm(int Balance){
        this.balance=Balance;
    }

}


public class ATMClass{
    public static void main(String[] args){
        Atm user1=new Atm(10000);
        user1.deposit(100);
        user1.withdraw(1000);
        user1.checkBalance();

    }
}
