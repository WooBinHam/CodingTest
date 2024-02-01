package java_pj.inflearn.chap5_datastructure_stack_queue.p2_erase_bracket;

import java.util.Scanner;
import java.util.Stack;

public class MainAnswer {
    public String solution(String input) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(c);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
