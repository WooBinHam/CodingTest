package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p2_find_common_elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int[] firstInput, int[] secondInput) {
        ArrayList<Integer> answer = new ArrayList<>();

        int firstIdx = 0, secondIdx = 0;

        while (firstIdx < firstInput.length && secondIdx < secondInput.length) {
//            System.out.println("firstInput[" + firstIdx + "]: " + firstInput[firstIdx]);
//            System.out.println("secondInput[" + secondIdx + "]: " + secondInput[secondIdx]);
            if (firstInput[firstIdx] == secondInput[secondIdx]) {
                answer.add(firstInput[firstIdx]);
                firstIdx++;
                secondIdx = 0;
            } else {
                secondIdx++;
            }
            if (secondIdx == secondInput.length) {
                firstIdx++;
                secondIdx = 0;
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] firstInput = new int[N];
        for (int i = 0; i < N; i++) {
            firstInput[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] secondInput = new int[M];
        for (int i = 0; i < M; i++) {
            secondInput[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = T.solution(firstInput, secondInput);
        for (Integer number : answer) {
            System.out.print(number + " ");
        }
    }
}
