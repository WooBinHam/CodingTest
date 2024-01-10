package java_pj.inflearn.chap2_array.p6_reverseprime;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public ArrayList<Integer> solution(int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String tmp = new StringBuilder(String.valueOf(input[i])).reverse().toString();
            input[i] = Integer.parseInt(tmp);
//            System.out.println("i번째 뒤집은 숫자: " + newInput[i]);

            boolean isPrime = true;
            for (int j = 2; j < input[i]; j++) {
//                System.out.println("뒤집은 숫자를 나누는 j: " + j);
                if (input[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && input[i] != 1) {
                answer.add(input[i]);
//                System.out.println("추가된 answer: " + answer);
            }
        }
//        System.out.println();
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
