package java_pj.inflearn.chap6_sort_search.p4_least_recently_used;

import java.util.Scanner;

public class Main {
    public int[] solution(int size, int[] input) {
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = 0;
        }

        for (int i = 0; i < input.length; i++) {
            int targetTask = input[i], targetIdx2 = -1;
            Boolean flag = false;

            for (int j = 0; j < size; j++) {
                if (answer[j] == targetTask) {
                    flag = true;
                    targetIdx2 = j;
                    break;
                }
            }
            if (flag) {
                for (int j = targetIdx2; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
                answer[0] = targetTask;
            } else {
                for (int j = size - 1; j > 0; j--) {
                    answer[j] = answer[j - 1];
                }
                answer[0] = targetTask;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        int[] result = T.solution(S, input);
        for (int i : result) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
