package java_pj.inflearn.chap6_sort_search.p4_least_recently_used;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    public ArrayList<Integer> solution(int size, int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            answer.add(0);
        }
//        System.out.println(answer);

        for (int i = 0; i < input.length; i++) {
            int targetTask = input[i];
//            System.out.println("targetTask: " + targetTask + " answer contains target? " + answer.contains(targetTask));

            if (answer.contains(targetTask)) {
                int targetIdx = -1;
                for (int j = 0; j < size; j++) {
                    targetIdx = answer.indexOf(targetTask);
//                    System.out.println("targetIdx: " + targetIdx);
                }

                if (targetIdx != -1) {
                    for (int j = targetIdx; j > 0; j--) {
                        answer.set(j, answer.get(j - 1));
                    }
                    answer.set(0, targetTask);
                }
            } else {
                for (int j = size - 1; j > 0; j--) {
                    answer.set(j, answer.get(j - 1));
                }
                answer.set(0, targetTask);
            }
//            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        MainArrayList T = new MainArrayList();
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        ArrayList<Integer> result = T.solution(S, input);
        for (int i : result) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
