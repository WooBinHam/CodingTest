package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p2_find_common_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainAnswer {
    public ArrayList<Integer> solution(int[] firstInput, int[] secondInput) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(firstInput);
        Arrays.sort(secondInput);

        int firstIdx = 0, secondIdx = 0;
        while (firstIdx < firstInput.length && secondIdx < secondInput.length) {
            if (firstInput[firstIdx] == secondInput[secondIdx]) {
                answer.add(firstInput[firstIdx]);
                firstIdx++;
                secondIdx++;
            } else if (firstInput[firstIdx] < secondInput[secondIdx]) {
                firstIdx++;
            } else {
                secondIdx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
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
