package java_pj.inflearn.chap7_recurse_tree_graph.p2_print_binary_num;

import java.util.Scanner;

public class MainEx {
    public void solution(int N) {
        if (N == 0) {
            return;
        } else {
            solution(N / 2);
            System.out.print(N % 2);
        }
    }

    public static void main(String[] args) {
        MainEx T = new MainEx();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        T.solution(N);
    }
}
