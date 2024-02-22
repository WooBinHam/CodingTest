package java_pj.inflearn.chap6_sort_search.p5_check_dup;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnswer {
    public String solution(int[] input) {
        String answer = "U";
        Arrays.sort(input);

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(T.solution(input));
    }
}
