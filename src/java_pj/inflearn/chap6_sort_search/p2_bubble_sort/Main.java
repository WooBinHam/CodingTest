package java_pj.inflearn.chap6_sort_search.p2_bubble_sort;

import java.util.Scanner;

public class Main {
    public int[] solution(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
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
