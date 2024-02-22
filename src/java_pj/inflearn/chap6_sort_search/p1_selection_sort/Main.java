package java_pj.inflearn.chap6_sort_search.p1_selection_sort;

import java.util.Scanner;

public class Main {
    public int[] solution(int[] input) {
        int tmp = 0;
        for (int i = 0; i < input.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[minIdx] > input[j]) {
                    minIdx = j;
                }
            }
            tmp = input[i];
            input[i] = input[minIdx];
            input[minIdx] = tmp;
        }
        return input;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        int[] result = T.solution(input);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
