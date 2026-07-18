package day3;

public class CountTheSteps {
    static void main() {
        int number=144;
        int count=0;
        while(number>0){
            if(number%2==0){
                number/=2;
            }else{
                number-=1;
            }
            count++;
        }
        System.out.println(count);
    }
}
