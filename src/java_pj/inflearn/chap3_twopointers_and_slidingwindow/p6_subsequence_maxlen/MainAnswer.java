package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p6_subsequence_maxlen;

import java.util.Scanner;

public class MainAnswer {
    public int solution(int K, int[] input) {
        int answer = Integer.MIN_VALUE, cnt = 0, start = 0;
        for (int end = 0; end < input.length; end++) {
            // cnt와 start, end 조정 후
            if (input[end] == 0) {
                cnt++;
            }
            while (cnt > K) {
                if (input[start] == 0) {
                    cnt--;
                }
                start++;
            }
            // 길이 비교
            answer = Math.max(answer, end - start + 1);
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
