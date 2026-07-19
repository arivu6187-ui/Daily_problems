package day18;

public class ValidPalindrome {
    static void main() {
        String s="A man and she is very Happy:";
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
         StringBuilder st=new StringBuilder(s).reverse();
        System.out.println(st.toString().equals(s));
    }
}
