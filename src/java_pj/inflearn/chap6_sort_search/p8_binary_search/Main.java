package java_pj.inflearn.chap6_sort_search.p8_binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public int solution(int M, ArrayList<Integer> input) {
        Collections.sort(input);
        System.out.println(input);
        int leftIdx = 0, rightIdx = input.size() - 1;

        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            System.out.println("left: " + leftIdx + ", right: " + rightIdx + ", mid: " + midIdx);
            if (M == input.get(midIdx)) {
                return midIdx + 1;
            } else if (M < input.get(midIdx)) {
                rightIdx = midIdx - 1;
            } else {
                leftIdx = midIdx + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            input.add(num);
        }

        System.out.println(T.solution(M, input));
    }
}
