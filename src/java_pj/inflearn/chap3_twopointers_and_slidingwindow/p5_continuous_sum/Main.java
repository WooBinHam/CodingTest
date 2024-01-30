package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p5_continuous_sum;

import java.util.Scanner;

public class Main {
    public int solution(int N) {
        int start = 1, answer = 0, sum = 0;
        for (int end = 1; end <= N / 2 + 1; end++) {
            System.out.println(start + " " + end + " sum: " + sum + " answer: " + answer);
            sum += end;
            if (sum == N) {
                answer++;
            }
            while (sum >= N) {
                System.out.println(start + " " + end + " sum: " + sum + " answer: " + answer);
                sum -= start++;
                if (sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}
