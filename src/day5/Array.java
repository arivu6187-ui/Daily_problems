package day5;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Loop loop=new Loop();
//        loop.loop();
        int m=3,n=3;
        int[] nums1=new int[]{1,5,9,0,0,0};
        int[] nums2=new int[]{2,3,6};
        if(m==0){
            System.out.println(nums2);
        }else if(n==0){
            System.out.println(nums1);
        }
        for(int i=m-1;i<nums1.length;i++){
            nums1[i]=nums2[i];
        }
        for(int i=nums1.length-1;i>=1;i--) {
            if (nums1[i] < nums1[i - 1]) {
                int temp = nums1[i];
                nums1[i] = nums1[i - 1];
                nums1[i - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
