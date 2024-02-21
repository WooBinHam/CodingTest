package java_pj.inflearn.chap5_datastructure_stack_queue.p6_save_princess;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
//            System.out.println(queue);
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.peek());
                queue.poll();
            }
            queue.poll();
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(T.solution(N, K));
    }
}

/**
 * 1 2 3 4 5 6 7 8 -> 3 제외
 * 4 5 6 7 8 1 2 -> 6 제외
 * 7 8 1 2 4 5 -> 1 제외
 * 2 4 5 7 8 -> 5 제외
 * 7 8 2 4 -> 2 제외
 * 4 7 8 -> 8 제외
 * 4 7 -> 4 제외
 * 7
 */