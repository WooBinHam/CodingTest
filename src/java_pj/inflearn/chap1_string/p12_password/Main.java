package java_pj.inflearn.chap1_string.p12_password;

import java.util.Scanner;

class Main {
    public String solution(int num, String input) {
        String answer = "";
        for (int i = 0; i < input.length(); i += 7) {
            String binary = input.substring(i, i + 7).replace("#", "1").replace("*", "0");
            int number = Integer.parseInt(binary, 2);
            answer += (char) number;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String input = sc.next();

        System.out.println(T.solution(num, input));
    }
}
