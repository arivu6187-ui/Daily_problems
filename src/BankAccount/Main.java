package BankAccount;
interface Application{
    void withdraw(double Amount);
    void deposit(double Amount);
    void CheckBlanace(double Amount);
}
abstract class Account implements Application{
    private int AccountNumber;
    private String name;
    protected double balance;
    Account(int AccountNumber, String name,double Balance){
        this.AccountNumber = AccountNumber;
        this.name = name;
        this.balance = balance;

        public void display(){
            System.out.println("Account Number: " + AccountNumber);
            System.out.println("Name: " + name);
        }
        public void chechBalance(){
            System.out.println("Balance is " + balance);
        }
        abstract public void accountType();
        }

}
class SavingAccount extends Account{

    /**
     * @param Amount
     */
    @Override
    public void withdraw(double Amount) {
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
        System.out.println("Checking Blance:"+Amount);
    }

    SavingAccount(int AccountNumber, String name, double Balance) {
        super(AccountNumber, name, Balance);

    }
}

public class Main {

}
