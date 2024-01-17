package java_pj.inflearn.chap2_array.p10_peak;

import java.util.Scanner;

class Main {
    public int solution(int N, int[][] input) {
        int answer = 0;
        for (int i = 1; i <= N + 1; i++) {
            for (int j = 1; j <= N + 1; j++) {
                if (input[i][j] > input[i - 1][j] && input[i][j] > input[i][j - 1] && input[i][j] > input[i + 1][j] && input[i][j] > input[i][j + 1]) {
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
        int[][] input = new int[N + 2][N + 2];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                input[i][j] = sc.nextInt();
            }
        }
//        System.out.println("입력된 값)");
//        for (int i = 0; i <= N + 1; i++) {
//            for (int j = 0; j <= N + 1; j++) {
//                System.out.print(input[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(T.solution(N, input));
    }
}
