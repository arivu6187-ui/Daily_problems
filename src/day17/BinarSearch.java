package day17;

public class BinarSearch {
    static void main() {
        int[] arr=new int[]{1,5,6,7,8,9};
        int target=5;
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                return;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
    }
}
