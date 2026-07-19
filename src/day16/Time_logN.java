package day16;

public class Time_logN {
    public static void main(String[] args) {
        int count=0,n=100;
        for(int j=1;j<=n;j=j*2){
            count=count+1;
        }
        System.out.println("count:"+count);
    }
}
