package java_pj.inflearn.chap6_sort_search.p10_horse_position;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnswer {
    public int solution(int C, int[] input) {
        int answer = 0;
        int left = 1;
        int right = input[input.length - 1];

        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(mid, input) >= C) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public int count(int dist, int[] input) {
        int cnt = 1;
        int endPosition = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] - endPosition >= dist) {
                endPosition = input[i];
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        System.out.println(T.solution(C, input));
    }
}
