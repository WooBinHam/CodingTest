package java_pj.inflearn.chap5_datastructure_stack_queue.p4_postfix;

import java.util.Scanner;
import java.util.Stack;

public class MainAnswer {
    public int solution(String input) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '+') {
                    stack.push(lt + rt);
                } else if (c == '-') {
                    stack.push(lt - rt);
                } else if (c == '*') {
                    stack.push(lt * rt);
                } else if (c == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
