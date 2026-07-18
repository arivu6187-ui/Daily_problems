package day6;

public class FindDiffernce {
    static void main() {
        String s="abcd";
        String t="abcde";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum=sum+s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sum=sum-t.charAt(i);
        }
        System.out.println((char)Math.abs(sum));
    }
}
