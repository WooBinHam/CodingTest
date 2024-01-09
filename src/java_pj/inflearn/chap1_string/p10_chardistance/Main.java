package java_pj.inflearn.chap1_string.p10_chardistance;

import java.util.Scanner;

class Main {
    public int[] solution(String strInput, char t) {
        int[] answer = new int[strInput.length()];
        char[] inputArray = strInput.toCharArray();
        int cnt = 1000;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == t) {
                cnt = 0;
                answer[i] = cnt;
            } else {
                cnt++;
                answer[i] = cnt;
            }
        }
        cnt = 1000;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] == t) {
                cnt = 0;
            } else {
                cnt++;
                answer[i] = Math.min(answer[i], cnt);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char t = sc.next().charAt(0);
//        System.out.println("문자열: " + input + " 문자 t: " + t);

        for (int o : T.solution(input, t)) {
            System.out.print(o + " ");
        }
    }
}
