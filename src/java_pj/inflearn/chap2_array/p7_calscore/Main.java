package java_pj.inflearn.chap2_array.p7_calscore;

import java.util.Scanner;

class Main {
    public int solution(int[] input) {
        int answer = 0, bonus = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                bonus++;
                answer += bonus;
            } else {
                bonus = 0;
            }
//            System.out.println("i번째 누적 점수: " + bonus);
//            System.out.println("i번째 점수: " + answer);
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
        System.out.println(T.solution(input));
    }
}
