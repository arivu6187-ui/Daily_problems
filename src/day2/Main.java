package day2;

public class Main{

void main() {
    int[] arr=new int[]{1,2,3,4,5};
    int n=0;
    for(int i=1;i<arr.length;i++){
        if(arr[n]>arr[i]){
            n=i;
        }
    }
    System.out.println(arr[n]);
}
}