package java_pj.inflearn.chap2_array.p11_templeader;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public int solution(int N, int[][] input) {
        int answer = 0, maxCnt = 0;
        for (int i = 0; i < N; i++) {
            int cnt;
            ArrayList<Integer> friendList = new ArrayList<>();

            for (int j = 0; j < 5; j++) {
//                System.out.println("Focus: " + input[i][j] + " i: " + i + " j: " + j);
                for (int k = 0; k < N; k++) {
//                    System.out.println("세로 줄 " + k + "번째 " + input[k][j]);
                    if (i != k && input[i][j] == input[k][j]) {

                        // 초기 friendList가 빈 값인 경우에 중복 확인 과정 없이 add
                        if (friendList.isEmpty()) {
                            friendList.add(k);
                        }

                        // 중복 제거. friendList에 중복된 친구가 있는 경우 skip
//                        boolean flag = true;
//                        for (int l = 0; l < friendList.size(); l++) {
//                            if (friendList.get(l) == k) {
//                                flag = false;
//                            }
//                        }
                        if (!friendList.contains(k)) {
                            friendList.add(k);
                        }
                    }
                }
            }
            cnt = friendList.size();
//            System.out.println("친구 리스트: " + friendList);
            if (cnt > maxCnt) {
                maxCnt = cnt;
                answer = i + 1;
            }
//            System.out.println(i + "번째 maxCnt: " + maxCnt + " answer: " + answer);
        }
        if (answer == 0) {
            return 1;
        } else {
            return answer;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] input = new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(N, input));
    }
}
