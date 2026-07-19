package day11;

public class repeatedCharFirst {
    static void main() {
        String s = "abccbaacz";
        int i = 0, j = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                System.out.println(s.charAt(i));
                return;
            } else {
                if (j == s.length() - 1) {
                    i++;
                    j = i;
                }
                j++;
            }
        }
    }
}


