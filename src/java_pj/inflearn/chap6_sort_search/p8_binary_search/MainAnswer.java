package java_pj.inflearn.chap6_sort_search.p8_binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnswer {
    public int solution(int M, int[] input) {
        int answer = 0;
        Arrays.sort(input);
        int leftIdx = 0, rightIdx = input.length - 1;

        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            if (input[midIdx] == M) {
                answer = midIdx + 1;
                break;
            } else if (input[midIdx] > M) {
                rightIdx = midIdx - 1;
            } else {
                leftIdx = midIdx + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(T.solution(M, input));
    }
}
