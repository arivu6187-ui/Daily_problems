package day3;

public class FactorialTrilingZero {
    static void main() {
        int count=0;
        int n=5;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        System.out.println(count);
    }
}
