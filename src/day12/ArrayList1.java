package day12;
import java.util.ArrayList;

class ownList<Integer>{
    int[] arr=new int[10];
    int i=0;
    public void add(int value){
        if(i==arr.length){
            addindex(i);
        }else {
            arr[i] = value;
            i++;
        }
    }
    public int get(int index){
        return arr[index];
    }
    public void clear(){
        arr=new int[10];
    }
    public void addindex(int j){
        int[] arr1=new int[j*2];
        for(int i=0;i<j;i++){
            arr1[i]=arr[i];
        }
        arr=arr1;
    }


}

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);

        System.out.println(arr1.get(0));

        arr1.clear();          //to clear an all value
        arr1.addAll(arr1);

        System.out.println(arr1);

        ownList<Integer> obj=new ownList<>();
        obj.add(1);
        obj.add(2);
//        obj.clear();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);
        obj.add(10);
        obj.add(11);
        obj.add(12);

        System.out.println(obj.get(10));

    }
}
