package java_pj.inflearn.chap5_datastructure_stack_queue.p1_right_bracket;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
