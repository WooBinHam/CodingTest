package java_pj.inflearn.chap5_datastructure_stack_queue.p7_design_curri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainAnswer {
    public String solution(String required, String designed) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : required.toCharArray()) {
            queue.offer(c);
        }

        for (char c : designed.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    return "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        String required = sc.next();
        String designed = sc.next();
        System.out.println(T.solution(required, designed));
    }
}
