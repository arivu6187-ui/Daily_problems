package day12;
import java.util.HashSet;
import java.util.Set;

class Set2<Integer> {
    int[] arr = new int[10];
    int i = 0;

    public void add(int value) {
        arr[i] = value;
        i++;
    }

    public void clear() {
        arr = new int[10];
    }

    public int size() {
        int count = 0;
        while (arr[i] != 0) {
            count += 1;
        }
        return count;
    }

    public boolean contains(int value){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==value){
                return true;
            }
        }return false;
    }

}

public class Set1 {
    public static void main(String[] args){
         Set<Integer> set=new HashSet<>();
         set.add(1);
         set.add(2);
         set.add(3);
         set.add(2);
        System.out.println(set.size());
//         set.clear();
//        System.out.println(set.contains(2));
//        System.out.println(set);
        Set2<Integer> set2=new Set2<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(3);
        System.out.println(set2.size());
        System.out.println(set2.contains(3));

    }
}
