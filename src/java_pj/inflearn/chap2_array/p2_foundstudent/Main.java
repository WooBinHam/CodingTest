package java_pj.inflearn.chap2_array.p2_foundstudent;

import java.util.Scanner;

class Main {
    public int solution(int[] input) {
        int answer = 0, maxHeight = 0;
        for (int i : input) {
            if (maxHeight < i) {
                answer++;
                maxHeight = i;
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
        System.out.println(T.solution(input));
    }
}
