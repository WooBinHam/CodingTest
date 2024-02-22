package java_pj.inflearn.chap6_sort_search.p4_least_recently_used;

import java.util.Scanner;

public class MainAnswer {
    public int[] solution(int size, int[] input) {
        int[] cache = new int[size];
        for (int i : input) {
            int pos = -1;
            for (int j = 0; j < size; j++) {
                if (i == cache[j]) {
                    pos = j;
                }
            }

            if (pos == -1) {
                for (int j = size - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
            } else {
                for (int j = pos; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
            }
            cache[0] = i;
        }
        return cache;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for (int i : T.solution(S, input)) {
            System.out.print(i + " ");
        }
    }
}
