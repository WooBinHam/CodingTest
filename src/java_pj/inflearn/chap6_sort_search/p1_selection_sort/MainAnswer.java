package java_pj.inflearn.chap6_sort_search.p1_selection_sort;

import java.util.Scanner;

public class MainAnswer {
    public int[] solution(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[idx]) {
                    idx = j;
                }
            }
            int tmp = input[i];
            input[i] = input[idx];
            input[idx] = tmp;
        }
        return input;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for (int x : T.solution(input)) {
            System.out.print(x + " ");
        }
    }
}
