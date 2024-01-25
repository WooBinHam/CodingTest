package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p3_max_sale;

import java.util.Scanner;

public class Main {
    public int solution(int K, int[] input) {
        int start = 0, end = start + K - 1;
        int maxSale = Integer.MIN_VALUE;

        while (end < input.length) {
            int sale = 0;
            for (int i = start; i <= end; i++) {
                sale += input[i];
//                System.out.print(input[i] + " ");
            }
            if (sale > maxSale) {
                maxSale = sale;
            }
            start++;
            end++;
//            System.out.println();
        }
        return maxSale;
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
        System.out.println(T.solution(K, input));
    }
}
