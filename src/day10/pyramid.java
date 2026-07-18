package day10;

public class pyramid {
    static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==5||j>=n-i){
                    System.out.print((char)(60+i+j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
