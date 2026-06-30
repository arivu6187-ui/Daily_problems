package BankAccount;
import java.util.Scanner;
interface Application{
    void withdraw(double Amount);
    void deposit(double Amount);
    void CheckBlanace(double Amount);
}
abstract class Account implements Application{
    public int AccountNumber;
    private String name;
    protected double balance;
    protected int key;
    Account(int AccountNumber, String name,double Balance,int key) {
        this.AccountNumber = AccountNumber;
        this.name = name;
        this.balance = balance;
        this.key=key;

    }
        public void display(){
            System.out.println("Account Number: " + AccountNumber);
            System.out.println("Name: " + name);
        }
        public void chechBalance(){
            System.out.println("Balance is " + balance);
        }
        abstract void accountType();
        }
class SavingAccount extends Account{
    Scanner sc=new Scanner(System.in);

    public void verify() {

        int count = 1;
        while (count <=3) {
            System.out.print("Enter your pin:");
            int password=sc.nextInt();
            if (password == key) {
                System.out.println("You have successfully verified");
                break;
            }
            else if(count==3){
                System.out.println("Blocked 24 Hours");
                return;
            }
            count++;
        }
    }

    @Override
    public void withdraw(double Amount) {
        verify();
        if(balance<=Amount){
            System.out.println("");
        }
        System.out.println("Withdrawing");
        balance = balance - Amount;
    }
    @Override
    public void deposit(double Amount) {
        balance = balance + Amount;
        System.out.println("Depositing Amount:"+Amount);
    }
    @Override
    public void CheckBlanace(double Amount) {
        verify();
        System.out.println("Checking Balance:"+Amount);
    }

    SavingAccount(int AccountNumber, String name, double Balance,int key) {
        super(AccountNumber, name, Balance,key);

    }
    public void accountType(){
        System.out.println("Saving Account");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number");
        int AccNumber=sc.nextInt();
        switch(AccNumber){
            case 101:
                Account a1=new SavingAccount(101,"Arivu",10000,12345);
                a1.display();
                a1.withdraw(1000);
                break;
            case 102:
                Account a2=new SavingAccount(102,"Kavi",100000,54321);
                a2.display();
                a2.withdraw(1000);
                break;
            default:
                System.out.println("Invalid Account Number");
                break;
        }



    }
}
