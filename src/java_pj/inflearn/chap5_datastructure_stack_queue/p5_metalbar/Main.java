package java_pj.inflearn.chap5_datastructure_stack_queue.p5_metalbar;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String input) {
        int answer = 0, pastStackSize = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();

                int stackSize = stack.size();
                if (pastStackSize > stackSize) {
                    answer += 1;
                } else {
                    answer += stackSize;
                }
                pastStackSize = stackSize;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}

// C C C -> +3
// C C C -> +3
// C C -> if stack.size : +1
// C C C -> +3
// C C -> if stack.size : +1
// C C -> +2
//  -> +2
