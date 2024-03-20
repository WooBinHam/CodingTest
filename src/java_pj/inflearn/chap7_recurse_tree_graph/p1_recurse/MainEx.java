package java_pj.inflearn.chap7_recurse_tree_graph.p1_recurse;

import java.util.Scanner;

public class MainEx {
    public void solution(int N) {
        if (N == 0) {
            return;
        } else {
            solution(N - 1);
            System.out.print(N + " ");
        }
    }

    public static void main(String[] args) {
        MainEx T = new MainEx();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        T.solution(N);
    }
}
