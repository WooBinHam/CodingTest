package java_pj.inflearn.chap2_array.p3_rocksispap;

import java.util.Scanner;

class Main {
    public char solution(int aIn, int bIn) {
        if (aIn == bIn) {
            return 'D';
        } else {
            if ((aIn == 1 && bIn == 3) || (aIn == 2 && bIn == 1) || (aIn == 3 && bIn == 2)) {
                return 'A';
            } else {
                return 'B';
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.println(T.solution(A[i], B[i]));
        }
    }
}
