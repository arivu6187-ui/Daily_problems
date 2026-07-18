package day2;

class solution {
    public int n;
    public int time;
    public int pass(int n, int time) {
        int cycle = 2 * (n - 1);
        int rem = time % cycle;
        if (rem < n) {
            return 1 + rem;
        }

        else {
            return n - (rem - (n - 1));
        }
    }
}


public class PillowPass {
    static void main() {
        solution s=new solution();
        System.out.println(s.pass(3,8));

    }
}
