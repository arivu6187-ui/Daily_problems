package day8;
import java.util.Scanner;
class SProfile{
    public int RollNO;
    public String Name;
    private String Address;
    private String DOB;
    public float CGPA;
    private int Key;

    public SProfile(int r,String n,String a,String d,float c,int k){
        RollNO=r;
        Name=n;
        Address=a;
        DOB=d;
        CGPA=c;
        Key=k;
    }
    public void ShowDetails(){
        System.out.println("RollNO:"+RollNO);
        System.out.println("Name:"+Name);
        System.out.println("Address:"+Address);
        System.out.println("Date of Birth:"+DOB);
        System.out.println("CGPA:"+CGPA);
    }
    public void ChangePassword(int password){
        Key=password;
        System.out.println("Password Change Successfully!");
    }
    public void Session(){
        System.out.println("1)9:10-10:00");
        System.out.println("2)10:00-10:50");
        System.out.println("-----Break-----");
        System.out.println("3)11:00-11:50");
        System.out.println("4)11:50-12:40");
        System.out.println("-----Break-----");
        System.out.println("5)01:30-02:20");
        System.out.println("6)02:20-03:10");
        System.out.println("7)03:10-04:00");
    }

    public void Security(int password){
        if(password==Key){
            System.out.println("Verified successfully!");
        }
        else{
            return;
        }
    }
    public void UpdateDetails(float mark){
        CGPA=mark;
        System.out.println("CGPA updated successfully");
    }
}
class first{
    public void m1(){
        System.out.println("First Grade");
    }
}
class second extends first{
    public void m2(){
        System.out.println("Second Grade");
    }
}
class third extends second{
    public void m3(){
        System.out.println("Third Grade");
    }
}


public class Register {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Password:");
        int password=sc.nextInt();
        third f1=new third();
        SProfile s1=new SProfile(101,"Aathish","200,Athiyar colony,Thirupur","12-05-2006",9.8F,1234);
        s1.Security(password);
        System.out.println("1.Show Details 2.ChangePassword 3.Session 4.updateDetails");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                s1.ShowDetails();
                break;
            case 2:
                System.out.print("Enter your new password:");
                int password1=sc.nextInt();
                s1.ChangePassword(password);
                break;
            case 3:
                s1.Session();
                break;
            case 4:
                System.out.print("Enter your new CGPA:");
                float mark=sc.nextInt();
                s1.UpdateDetails(mark);
                if(mark>7.5){f1.m1();}
                else if(mark>5.0){f1.m2();}
                else{f1.m3();}
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
