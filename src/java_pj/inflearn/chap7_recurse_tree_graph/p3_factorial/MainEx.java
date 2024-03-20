package java_pj.inflearn.chap7_recurse_tree_graph.p3_factorial;

import java.util.Scanner;

public class MainEx {
    public int solution(int N, int initalA) {
        if (N == 0) {
            return initalA;
        }
        System.out.println("input: " + N + ", answer: " + initalA);
        return solution(N - 1, initalA * N);
    }

    public int solutionAnswer(int N) {
        if (N == 1) return 1;
        else return N * solutionAnswer(N - 1);
    }

    public static void main(String[] args) {
        MainEx T = new MainEx();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(T.solution(N, 1));
        System.out.println(T.solutionAnswer(N));
    }
}
