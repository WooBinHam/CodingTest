package java_pj.inflearn.chap2_array.p1_bignum;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public ArrayList<Integer> solution(int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] < input[i]) {
                answer.add(input[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for (int i : T.solution(input)) {
            System.out.print(i + " ");
        }
    }
}
