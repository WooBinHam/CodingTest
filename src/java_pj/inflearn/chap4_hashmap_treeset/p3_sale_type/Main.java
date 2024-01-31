package java_pj.inflearn.chap4_hashmap_treeset.p3_sale_type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int K, int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int start = 0, end = start + K;

        for (int i = start; i < end; i++) {
            hashMap.put(input[i], hashMap.getOrDefault(input[i], 0) + 1);
        }
//        System.out.println(hashMap);
        answer.add(hashMap.size());

        while (end < input.length) {
            start++;
            end++;
//            System.out.println("start: " + start + " end: " + end);

            if (hashMap.get(input[start - 1]) > 1) {
                hashMap.replace(input[start - 1], hashMap.get(input[start - 1]) - 1);
            } else {
                hashMap.remove(input[start - 1]);
            }
            hashMap.put(input[end - 1], hashMap.getOrDefault(input[end - 1], 0) + 1);

//            System.out.println(hashMap);
            answer.add(hashMap.size());
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for (int num : T.solution(K, input)) {
            System.out.print(num + " ");
        }
    }
}
