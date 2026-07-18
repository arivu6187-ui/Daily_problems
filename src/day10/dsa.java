package day10;
class demo{
    int[] arr=new int[5];
    int index=-1;
    public void add(int value){
        if(index==arr.length){
            int[] temp=new int[arr.length*2];
            arr=temp;
            System.out.println(arr.length+"-------------");
        }
        arr[index]=value;
        index++;
    }
    public void update(int index,int value){
        arr[index]=value;
    }
    demo(){
        index=0;

    }
}

public class dsa {
    public static void main(String[] args) throws Exception {
        demo d=new demo();
        d.add(10);
        d.add(20);
        d.add(20);
        d.add(30);
        d.add(40);
        d.update(1,80);
        System.out.println(d.arr[1]);
    }
}
