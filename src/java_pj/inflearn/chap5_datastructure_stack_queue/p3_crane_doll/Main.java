package java_pj.inflearn.chap5_datastructure_stack_queue.p3_crane_doll;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
//            System.out.println("i: " + i);
            int targetIdx = moves[i] - 1, verticalIdx = 0;
            int pickedDoll = -1;

            while (verticalIdx < board.length && board[verticalIdx][targetIdx] == 0) {
                verticalIdx++;
            }

            if (verticalIdx == board.length && board[verticalIdx - 1][targetIdx] == 0) {
                continue;
            }

            pickedDoll = board[verticalIdx][targetIdx];
            board[verticalIdx][targetIdx] = 0;

//            System.out.println(verticalIdx + " " + targetIdx + " doll: " + pickedDoll);

            int lastStackDoll = -1;
            if (!stack.isEmpty()) {
                lastStackDoll = stack.get(stack.size() - 1);
            }
            if (lastStackDoll == pickedDoll) {
                stack.pop();
                answer += 2;
            } else {
                stack.push(pickedDoll);
            }
//            System.out.println(stack);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(T.solution(board, moves));
    }
}