package day9;
class AtmMachine{
    private int acc_no;
    public String name;
    public int balance;
    public void setAcc_no(int acc_no){
        this.acc_no=acc_no;
    }
    public int getAcc_no(){
        return acc_no;
    }
    public void check_balance(){
        System.out.println(balance);
    }
    AtmMachine(int acc_no,String name,int balance){
        this.acc_no=acc_no;
        this.name=name;
        this.balance=balance;
    }
}

public class demo {
    public static void main(String[] args) {
        AtmMachine user1=new AtmMachine(12564789,"Hillo",50000);
        user1.setAcc_no(1);
        System.out.println(user1.getAcc_no());
        user1.check_balance();

    }
}