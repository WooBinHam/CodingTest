package java_pj.inflearn.chap6_sort_search.p5_check_dup;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public char solution(int[] input) {
        // 배열로
//        for (int i = 0; i < input.length - 1; i++) {
//            for (int j = i + 1; j < input.length; j++) {
//                if (input[i] == input[j]) {
//                    return 'D';
//                }
//            }
//        }
//        return 'U';

        // HashMap으로
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i : input) {
//            if (hashMap.containsKey(i)) {
//                hashMap.put(i, hashMap.get(i) + 1);
//            } else {
//                hashMap.put(i, 1);
//            }
//        }
////        System.out.println(hashMap);
//        for (int i : hashMap.values()) {
//            if (i != 1) {
//                return 'D';
//            }
//        }
//        return 'U';

        // HashSet으로
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : input) {
            hashSet.add(i);
        }
        if (isDup(input, hashSet)) {
            return 'U';
        } else {
            return 'D';
        }
    }

    public Boolean isDup(int[] input, HashSet<Integer> hashSet) {
        return input.length == hashSet.size();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(T.solution(input));
    }
}
