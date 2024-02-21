package java_pj.softeer.level3.practice6294;

import java.util.*;

public class Main {
    public float solution(int[] input, int start, int end) {
        float answer = 0F;
        int sum = 0, cnt = end - start + 1;
        for (int i = start; i <= end; i++) {
            sum += input[i];
        }
        answer = (float) sum / cnt;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int studentN = sc.nextInt();
        int K = sc.nextInt();
        int[] score = new int[studentN];
        for (int i = 0; i < studentN; i++) {
            score[i] = sc.nextInt();
        }
        for (int i = 1; i < K; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            float result = T.solution(score, start - 1, end - 1);
            System.out.printf("%.2f\n", result);
        }
    }
}

/**
 * 5 3
 * 10 50 20 70 100
 */