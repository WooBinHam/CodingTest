package java_pj.inflearn.chap2_array.p4_fibonacci;

import java.util.Scanner;

class Main {
    public int[] solution(int input) {
        int[] answer = new int[input];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < input; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i : T.solution(N)) {
            System.out.print(i + " ");
        }
    }
}
