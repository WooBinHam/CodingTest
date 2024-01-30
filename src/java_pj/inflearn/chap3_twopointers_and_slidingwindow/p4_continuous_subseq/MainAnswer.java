package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p4_continuous_subseq;

import java.util.Scanner;

public class MainAnswer {
    public int solution(int M, int[] input) {
        int answer = 0, sum = 0, start = 0;
        for (int end = 0; end < input.length; end++) {
            sum += input[end];
            if (sum == M) {
                answer++;
            }
            while (sum >= M) {
                sum -= input[start++];
                if (sum == M) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println(T.solution(M, input));
    }
}
