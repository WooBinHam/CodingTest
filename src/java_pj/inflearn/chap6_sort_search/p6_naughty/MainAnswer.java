package java_pj.inflearn.chap6_sort_search.p6_naughty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainAnswer {
    public ArrayList<Integer> solution(int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = input.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < input.length; i++) {
            if (input[i] != tmp[i]) {
                answer.add(i + 1);
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
        for (int i : T.solution(input)) {
            System.out.print(i + " ");
        }
    }
}
