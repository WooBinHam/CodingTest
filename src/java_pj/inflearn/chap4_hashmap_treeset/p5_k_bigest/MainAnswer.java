package java_pj.inflearn.chap4_hashmap_treeset.p5_k_bigest;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class MainAnswer {
    public int solution(int K, int[] input) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int l = j + 1; l < input.length; l++) {
                    treeSet.add(input[i] + input[j] + input[l]);
                }
            }
        }
        int cnt = 0;

//        treeSet.remove(143);
//        System.out.println(treeSet.size());
//        System.out.println(treeSet.first());
//        System.out.println(treeSet.last());

        for (int x : treeSet) {
            cnt++;
            if (cnt == K) {
                return x;
            }
//            System.out.print(x + " ");
        }
        return -1;
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
        System.out.println(T.solution(K, input));
    }
}
