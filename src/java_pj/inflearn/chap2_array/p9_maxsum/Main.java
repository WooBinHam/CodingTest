package java_pj.inflearn.chap2_array.p9_maxsum;

import java.util.Scanner;

class Main {
    public int solution(int[][] input) {
        int answer = 0;
        for (int i = 0; i < input.length; i++) {
            int horSum = 0, verSum = 0;
            for (int j = 0; j < input.length; j++) {
                horSum += input[i][j];
                verSum += input[j][i];
            }
            answer = Math.max(answer, Math.max(horSum, verSum));
        }

        int diagSum1 = 0, diagSum2 = 0;
        for (int i = 0; i < input.length; i++) {
            diagSum1 += input[i][i];
            diagSum2 += input[input.length - 1 - i][i];
        }
        answer = Math.max(answer, Math.max(diagSum1, diagSum2));

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] input = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(input));
    }
}
