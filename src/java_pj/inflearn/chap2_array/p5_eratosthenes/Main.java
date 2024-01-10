package java_pj.inflearn.chap2_array.p5_eratosthenes;

import java.util.Scanner;

class Main {
    public int solution(int input) {
        int answer = 0;
        int[] checkArr = new int[input + 1];
        for (int i = 2; i <= input; i++) {
            if (checkArr[i] == 0) {
                answer++;
                for (int j = i; j <= input; j += i) {
                    checkArr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(T.solution(N));
    }
}
