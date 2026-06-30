package day6;

public class SeondNumber {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        int min=0;
        int secondmin=min;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondmin=min;
                min=arr[i];
            }
            else if(arr[i]<secondmin){
                secondmin=arr[i];
            }
        }
        System.out.println(secondmin);
    }
}
