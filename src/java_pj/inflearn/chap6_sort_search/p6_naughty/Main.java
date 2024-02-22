package java_pj.inflearn.chap6_sort_search.p6_naughty;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void solution(int[] input) {
        int[] sortedInput = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            sortedInput[i] = input[i];
        }
        Arrays.sort(sortedInput);

//        System.out.println("original input: " + Arrays.toString(input));
//        System.out.println("sorted input: " + Arrays.toString(sortedInput));
        for (int i = 0; i < input.length; i++) {
            if (input[i] != sortedInput[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        T.solution(input);
    }
}
