package java_pj.inflearn.chap5_datastructure_stack_queue.p8_emergency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *  위험도는 같은데 index가 다른 경우는 어떻게...?
 *  처음 Queue에 넣을 때 Integer와 함께 index도 넣어줘야함.
 *  어떻게...?
 */
public class Main {
    public int solution(int M, int[] patient) {
        Queue<Integer> queue = new LinkedList<>();
        int flag = 0, target = patient[M], answer = 0;
        for (int i : patient) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue);
            int first = queue.poll();
            for (int i : queue) {
                System.out.println("inner queue: " + queue + ", first: " + first + ", i: " + i);
                if (first < i) {
                    // 큐 내에 first보다 큰 값이 있으면 flag=1
                    flag = 1;
                    break;
                } else if (first == i) {
                    flag = 2;
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) {
                queue.offer(first);
            } else if (flag == 0 && first == target) {
                System.out.println("Queue의 최대값은: " + first);
                answer++;
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] patient = new int[N];
        for (int i = 0; i < N; i++) {
            patient[i] = sc.nextInt();
        }
        System.out.println(T.solution(M, patient));
    }
}

/**
 * 5 2
 * 60 50 70 80 90
 * -> 50 70 80 90 60
 * -> 70 80 90 60 50
 * -> 80 90 60 50 70
 * -> 90 60 50 70 80 -> 90 out
 * -> 60 50 70 80
 * -> 50 70 80 60
 * -> 70 80 60 50
 * -> 80 60 50 70 -> 80 out
 * -> 60 50 70
 * -> 50 70 60
 * -> 70 60 50 -> 70 out
 */