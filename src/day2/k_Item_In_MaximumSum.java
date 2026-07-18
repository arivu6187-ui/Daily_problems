package day2;

import java.util.Scanner;

class MaximumSum{
    public int numOnes;
    public int numZeros;
    public int numNeg;
    public int maximum(int numOnes,int numZeros,int numNeg,int k){
        if(k<=numOnes){
            return k;
        }
        k=k-numOnes;
        if(k<=numZeros) {
            return numOnes;
        }
        k=k-numZeros;
        if(k<=numNeg){
            return numOnes-k;
        }
        return -1;
    }
}

public class k_Item_In_MaximumSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MaximumSum max=new MaximumSum();
        System.out.print("Enter number of ones:");
        int numones=sc.nextInt();
        System.out.print("Enter number of zeros:");
        int numZeros=sc.nextInt();
        System.out.print("Enter the number of negatives:");
        int numNeg=sc.nextInt();
        System.out.print("Enter the number of items:");
        int k=sc.nextInt();
        System.out.println(max.maximum(numones,numZeros,numNeg,k));
    }

}
