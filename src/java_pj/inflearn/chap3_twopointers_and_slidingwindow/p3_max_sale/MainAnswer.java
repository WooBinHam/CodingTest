package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p3_max_sale;

import java.util.Scanner;

public class MainAnswer {
    public int solution(int K, int[] input) {
        int answer = 0, sum;
        for (int i = 0; i < K; i++) {
            answer += input[i];
        }
        sum = answer;
        for (int i = K; i < input.length; i++) {
            sum = sum + input[i] - input[i - K];
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(T.solution(K, input));
    }
}
