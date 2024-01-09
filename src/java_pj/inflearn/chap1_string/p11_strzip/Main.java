package java_pj.inflearn.chap1_string.p11_strzip;

import java.util.Scanner;

class Main {
    public String solution(String input) {
        String answer = "";
        int cnt = 1;
        char first = input.charAt(0);
        answer += input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == first) {
                cnt++;
                if (i == input.length() - 1) {
                    answer += Integer.toString(cnt);
                }
            } else {
                if (cnt > 1) {
                    answer += Integer.toString(cnt);
                }
                cnt = 1;
                first = input.charAt(i);
                answer += first;
            }
//            System.out.println(i + "번째 loop 결과: " + answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
