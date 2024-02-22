package java_pj.inflearn.chap6_sort_search.p3_insertion_sort;

import java.util.Scanner;

public class MainAnswer {
    public int[] solution(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int tmp = input[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (input[j] > tmp) {
                    input[j + 1] = input[j];
                } else {
                    break;
                }
            }
            input[j + 1] = tmp;
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

        int[] result = T.solution(input);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
