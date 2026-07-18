package day10;

import java.util.*;

public class FibonacciNumber {
    public static void main(String[] args){
//        int[] arr=new int[20];
//        arr[0]=0;
//        arr[1]=1;
//        for(int i=2;i<arr.length;i++){
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        System.out.println(Arrays.toString(arr));


//        int a=72;
//        int b=120;
//        int temp1=a*b;
//        while(b!=0){
//            int temp=b;
//            b=a%b;
//            a=temp;
//        }
//        int gcd=a;
//        int lcm=(temp1)/gcd;
//        System.out.println("gcd="+gcd);
//        System.out.println("lcm="+lcm);

//

//        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 3};
//
//        // Convert array to LinkedHashSet to strip duplicates
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//
//        // Convert back into a fresh array
//        Integer[] uniqueNumbers = set.toArray(new Integer[0]);
//
//        System.out.println(uniqueNumbers);

//        int a=5;
//        for(int i=1;i<=a;i++){
//            System.out.println(i*i*i);
//        }

//        int n=9999;
////        int b=(n-1)*n;
////        System.out.println(b/2);
//        int last=n%10;
//        while(n>9){
//            n=n/10;
//        }
//        System.out.println(last+n);

//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int sum=0;
//        public void divide(int num){
//            while(num!=0){
//                int digit=num%10;
//                sum+=digit;
//                num=num/10;
//            }
//        }

//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.forEach(System.out::println);
//        System.out.println(list.containsAll(list)+"----------");
//        System.out.println(list.reversed());
////        list.addAll(list);
//        list.addAll(2,list);
//        System.out.println(list.contains(2));
//        System.out.println(list);
//
//        TreeSet<Integer> set=new TreeSet<>();
//        set.add(5);
//        set.add(10);
//        set.add(58);
//        set.add(50);
//        set.add(69);
//        System.out.println(set);
        String a="{[()]}";
//        if(a.length()%2==1) {
//
//            return;
//        }
        int tot=a.length()/2;
        System.out.println(tot);
        for(int i=0;i<3;i++){
            System.out.println(a.charAt(i));
            if(a.charAt(i)==a.charAt(tot+i)){
                System.out.println("1");
            }
            else{
                break;
            }
        }
        System.out.println("============================");

//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

    }
}
