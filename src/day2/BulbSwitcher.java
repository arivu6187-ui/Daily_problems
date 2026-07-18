package day2;

import java.util.Scanner;

class Solution{
    int n;
    public int bulb(int n){
        return (int)Math.sqrt(n);
    }
}

public class BulbSwitcher {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Solution s1=new Solution();
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        System.out.println(s1.bulb(n));

    }
}
