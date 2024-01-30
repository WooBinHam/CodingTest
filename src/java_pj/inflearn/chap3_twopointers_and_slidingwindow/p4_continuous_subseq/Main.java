package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p4_continuous_subseq;

import java.util.Scanner;

class Main {
    public int solution(int M, int[] input) {
        int start = 0, end = 1, answer = 0;
        while (start < input.length - 1) {
            while (end < input.length) {
                int sum = 0;
//                System.out.println(start + " " + end);
                for (int i = start; i <= end; i++) {
                    sum += input[i];
//                    System.out.println("sum : " + sum);
                    if (sum > M) {
                        break;
                    }
                }
//                System.out.println("sum : " + sum + " M : " + M);
                if (sum == M) {
                    answer++;
                } else if (sum > M) {
                    break;
                }
                end++;
            }
            start++;
            end = start + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
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
