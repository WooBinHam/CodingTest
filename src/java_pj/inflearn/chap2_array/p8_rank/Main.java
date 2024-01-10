package java_pj.inflearn.chap2_array.p8_rank;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public ArrayList<Integer> solution(int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int rank = 1;
            for (int j : input) {
                if (input[i] < j) {
                    rank++;
                }
            }
            answer.add(rank);
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
