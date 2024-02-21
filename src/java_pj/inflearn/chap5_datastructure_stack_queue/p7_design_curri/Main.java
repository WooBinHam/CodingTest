package java_pj.inflearn.chap5_datastructure_stack_queue.p7_design_curri;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String required, String designed) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : required.toCharArray()) {
            queue.offer(c);
        }
//        System.out.println(queue);
        for (char c : designed.toCharArray()) {
            if (queue.isEmpty()) {
                return "YES";
            }
            if (c == queue.peek()) {
                queue.poll();
            }
        }
        if (queue.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String requiredCurri = sc.nextLine();
        String designedCurri = sc.nextLine();
        System.out.println(T.solution(requiredCurri, designedCurri));
    }
}
