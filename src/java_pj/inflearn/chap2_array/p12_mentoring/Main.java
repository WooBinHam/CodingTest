package java_pj.inflearn.chap2_array.p12_mentoring;

import java.util.Scanner;

class Main {
    public int solution(int M, int N, int[][] input) {
        int answer = 0;
        for (int j = 0; j < N; j++) {
            int mento = input[0][j];        // 3
            for (int k = j + 1; k < N; k++) {
                int menti = input[0][k];    // 4
//                System.out.println("멘토: " + mento + ", 멘티: " + menti);
                boolean flag = true;

                if (mento == menti) {
                    continue;
                }

                for (int l = 0; l < M; l++) {
                    int mentoIdx = -1, mentiIdx = -1;

                    for (int m = 0; m < N; m++) {
                        if (input[l][m] == mento) {
                            mentoIdx = m;
                        }
                        if (input[l][m] == menti) {
                            mentiIdx = m;
                        }
                    }
//                    System.out.println(l + "번째 테스트 결과");
//                    System.out.println("멘토의 Idx: " + mentoIdx + ", 멘티의 Idx " + mentiIdx);

                    if (mentoIdx > mentiIdx) {
                        flag = false;
                        break;
                    }
                }
//                System.out.println("멘토 가능? flag: " + flag);
                if (flag) {
                    answer++;
//                    System.out.println("answer: " + answer);
                }
//                System.out.println();
            }
//            System.out.println();
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] input = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(M, N, input));
    }
}
