package java_pj.inflearn.chap1_string.p11_strzip;

import java.util.Scanner;

class Main2 {
    public String solution(String input) {
        String answer = "";
        input += " ";
        int cnt = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                cnt++;
            } else {
                answer += input.charAt(i);
                if (cnt > 1) {
//                    answer+=String.valueOf(cnt);
                    answer += Integer.toString(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
