package java_pj.inflearn.chap2_array.p10_peak;

import java.util.Scanner;

class Main2 {
    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    public int solution(int N, int[][] input) {
        int answer = 0;
        for (int i = 1; i <= N + 1; i++) {
            for (int j = 1; j <= N + 1; j++) {
                boolean flag = false;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k], ny = j + dy[k];
                    if (input[i][j] > input[nx][ny]) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
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
