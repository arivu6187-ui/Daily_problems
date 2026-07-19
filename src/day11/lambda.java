package day11;

import java.util.*;

public class lambda {
    public static void main(String[] args) {
//        String a="{[()]}";
//        int tot=a.length()/2;
//        System.out.println(tot);
//        for(int i=0;i<tot;i++){
//            System.out.println(a.charAt(a.length()-i-1));
//            if(a.charAt(i)==a.charAt(tot+i)){
//                System.out.println("1");
//            }
//        }
//        int[] arr=new int[]{1,5,2,6,4} ;
//        for(int i=0;i<5;i++){
//        int lcm,gcd,a=72,b=120;
//        int a_a=a,b_b=b;
//        while(a!=0){
//            int temp=a;
//            a=b%a;
//            b=temp;
//        }
//        gcd=b;
//        lcm=(a_a*b_b)/gcd;
//        System.out.println(gcd);
//        System.out.println(lcm);
//        int n=6;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(j==n/2&&i==1||i==n/2||i<n/2&&(j==n/2+1)){
//                    System.out.print('*');
//                }
//                else{
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//
//        }
//        List<String> list1= Arrays.asList("apple","orange");
//        List<String> list=new ArrayList<>();
//        list.add("apple");
//        list.add("orange");
//        list.add("banana");
//        list.add("grape");
//        String a="[{()}]";
//        Stack<Character> stack=new Stack<>();
//        for(int i=0;i<a.length();i++){
//            char c=a.charAt(i);
//            if(c==']'){
//                c='[';
//            }
//            else if(c==')'){
//                c='(';
//            }
//            else if(c=='}'){
//                c='{';
//            }
//            stack.push(c);
//        }

//        list.notify();
        //lamda function
//        list.sort((m,n)->m.compareTo(n));
//        System.out.println(list.reversed());
//        System.out.println(list.containsAll(list1));
//        System.out.println(list);
//        System.out.println(stack);
//        for(int i=0;i<stack.size();i++){

//        String a="(hello world)";
//        String[] b=new String[4];
//        int count=0;
//        for(int i=0;i<a.length();i++){
//            for(int j=0;j<a.length();j++){
//
//            }
//        }
//        int[] nums={1,3,5,6};
//        int target=2;
//        int n=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target){
//                n=i;
//            }
//            else if(nums[i]<target){
//                n=i;
//                System.out.println(n);
//            }

//        }
        Scanner sc=new Scanner(System.in);
//        int[] mark=new int[5];
//        int total=0;
//        for(int i=0;i<mark.length;i++){
//            mark[i]=sc.nextInt();
//            total=total+mark[i];
//        }
//        int avg=total/5;
//        if(avg>90){
//            System.out.println("A");
//        }
//        else if(avg<80){
//            System.out.println("B");
//        }
//        else if(avg<70){
//            System.out.println("C");
//        }
//        else if(avg<60){
//            System.out.println("D");
//        }
//        else{
//            System.out.println("Fail");
//        }

//        int number_of_choc=sc.nextInt();
//        int number_of_days=sc.nextInt();
//        int number_of_perday=sc.nextInt();
//        int balance=number_of_choc/number_of_days;
//        if(balance>=number_of_perday){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }
        int amount=100000-000;
        int n=153;
        System.out.println(amount);
        int temp=n,count=0,total=0;
        while(n>0){
            int s=n%10;
            total=total+s;
            count++;
            n=n/10;
        }
        System.out.println("Sum of the number:"+total);
        total=0;
        n=temp;
        while(n>0) {
            int s = n % 10;
            total = (int) (total + Math.pow(s, count));
            n = n / 10;
        }
        System.out.println(total==temp);
        }
    }