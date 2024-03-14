package java_pj.inflearn.chap6_sort_search.p9_musicvideo_decision_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MainAnswer {
    public int solution(int M, int[] input) {
        int answer = 0;
        int left = Arrays.stream(input).max().getAsInt();
        int right = Arrays.stream(input).sum();

        while (left <= right) {
            // mid가 dvd 한 장의 용량이라고 정함
            int mid = (left + right) / 2;
            if (count(mid, input) <= M) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public int count(int capacity, int[] input) {
        // dvd 장수. 처음엔 1장
        int cnt = 1;
        // dvd에 담아내는 곡들의 합
        int sum = 0;

        for (int x : input) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
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
