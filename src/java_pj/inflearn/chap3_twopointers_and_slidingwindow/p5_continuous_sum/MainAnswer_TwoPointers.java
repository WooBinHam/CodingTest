package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p5_continuous_sum;

import java.util.Scanner;

public class MainAnswer_TwoPointers {
    public int solution(int N) {
        int answer = 0, sum = 0, start = 0;
        int M = N / 2 + 1;
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = i + 1;
        }
        for (int end = 0; end < M; end++) {
            sum += arr[end];
            if (sum == N) {
                answer++;
            }
            while (sum >= N) {
                sum -= arr[start++];
                if (sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer_TwoPointers T = new MainAnswer_TwoPointers();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}
