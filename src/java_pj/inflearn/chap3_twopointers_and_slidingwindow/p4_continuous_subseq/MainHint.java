package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p4_continuous_subseq;

import java.util.Scanner;

class MainHint {
    public int solution(int M, int[] input) {
        int sum = 0, answer = 0;
        int start = 0, end = 0;
        sum += input[end];
        while (end < input.length) {
//            System.out.println(start + " " + end);
//            System.out.println("sum : " + sum);
            if (sum < M) {
                end++;
                if (end==input.length){
                    break;
                }
                sum += input[end];
            } else if (sum >= M) {
                if (sum == M) {
                    answer++;
                }
                start++;
                sum -= input[start - 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainHint T = new MainHint();
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
