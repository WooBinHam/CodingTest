package java_pj.inflearn.chap6_sort_search.p3_insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] solution(int[] input) {
        for (int i = 1; i < input.length; i++) {
//            System.out.println(Arrays.toString(input));
            int target = input[i], j = i - 1;
            while (j >= 0 && target < input[j]) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = target;
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
