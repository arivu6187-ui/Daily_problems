package day23;

import java.util.Stack;

public class Main {

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations));
    }
}
