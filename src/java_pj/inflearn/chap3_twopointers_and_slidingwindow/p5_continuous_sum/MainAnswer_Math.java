package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p5_continuous_sum;

import java.util.Scanner;

public class MainAnswer_Math {
    public int solution(int N) {
        // cnt는 연속된 자연수의 갯수
        int answer = 0, cnt = 1;

        N--;    // 여기서 먼저 1을 빼고
        while (N > 0) {
            cnt++;
            N = N - cnt;    // 여기서 2를 뺌 -> N=12
            if (N % cnt == 0) answer++;
        }
        return 0;
    }

    public static void main(String[] args) {
        MainAnswer_Math T = new MainAnswer_Math();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}
