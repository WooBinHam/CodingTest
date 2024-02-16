package java_pj.inflearn.chap5_datastructure_stack_queue.p4_postfix;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String input) {
        Stack<Integer> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '+') {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first + second);
            } else if (c == '-') {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second - first);
            } else if (c == '*') {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first * second);
            } else if (c == '/') {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second / first);
            } else {
                stack.push(Character.getNumericValue(c));
            }
//            System.out.println("stack: " + stack);
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
