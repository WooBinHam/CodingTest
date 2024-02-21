package java_pj.inflearn.chap5_datastructure_stack_queue.p6_save_princess;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainAnswer {
    public int solution(int N, int K) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(T.solution(N, K));
    }
}
