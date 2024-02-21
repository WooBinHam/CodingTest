package java_pj.inflearn.chap5_datastructure_stack_queue.p5_metalbar;

import java.util.Scanner;
import java.util.Stack;

public class MainAnswer {
    public int solution(String input) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if (input.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
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
