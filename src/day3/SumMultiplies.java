package day3;

public class SumMultiplies {
    static void main() {
        int sum=0,n=7;
        for(int i=0;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
