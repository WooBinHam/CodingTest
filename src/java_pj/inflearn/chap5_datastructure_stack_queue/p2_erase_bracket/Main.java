package java_pj.inflearn.chap5_datastructure_stack_queue.p2_erase_bracket;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String input) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
//            System.out.println("c: " + c);
//            System.out.println("stack: " + stack);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else if (stack.isEmpty()) {
                answer.append(c);
            }
//            System.out.println("after stack: " + stack);
//            System.out.println("after answer: " + answer);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
