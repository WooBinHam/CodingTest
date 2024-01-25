package java_pj.inflearn.chap3_twopointers_and_slidingwindow.p1_merge_two_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        int firstIdx = 0, secondIdx = 0;

        while (firstIdx < firstArray.length && secondIdx < secondArray.length) {
            if (firstArray[firstIdx] < secondArray[secondIdx]) {
                answer.add(firstArray[firstIdx++]);
            } else {
                answer.add(secondArray[secondIdx++]);
            }
        }

        while (firstIdx < firstArray.length) {
            answer.add(firstArray[firstIdx++]);
        }

        while (secondIdx < secondArray.length) {
            answer.add(secondArray[secondIdx++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] firstArray = new int[N];
        for (int i = 0; i < N; i++) {
            firstArray[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] secondArray = new int[M];
        for (int i = 0; i < M; i++) {
            secondArray[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = T.solution(firstArray, secondArray);
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
}
