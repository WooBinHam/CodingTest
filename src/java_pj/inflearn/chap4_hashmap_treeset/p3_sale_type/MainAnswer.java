package java_pj.inflearn.chap4_hashmap_treeset.p3_sale_type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainAnswer {
    public ArrayList<Integer> solution(int N, int K, int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < K - 1; i++) {
            hashMap.put(input[i], hashMap.getOrDefault(input[i], 0) + 1);
        }

        int start = 0;
        for (int end = K - 1; end < input.length; end++) {
            hashMap.put(input[end], hashMap.getOrDefault(input[end], 0) + 1);
            answer.add(hashMap.size());

            hashMap.put(input[start], hashMap.get(input[start]) - 1);
            if (hashMap.get(input[start]) == 0) {
                hashMap.remove(input[start]);
            }
            start++;
        }

        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for (int x : T.solution(N, K, input)) {
            System.out.print(x + " ");
        }
    }
}
