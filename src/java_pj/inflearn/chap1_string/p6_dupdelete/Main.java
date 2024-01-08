package java_pj.inflearn.chap1_string.p6_dupdelete;

import java.util.Scanner;

class Main {
    public String solution(String input) {
//        char[] c = input.toCharArray();
//        StringBuilder answer = new StringBuilder();
        String answer = "";
//        for (char checkingChar : c) {
//            int cnt = 0;
//            char[] tmp = answer.toString().toCharArray();
//            for (char value : tmp) {
//                if (checkingChar == value) {
//                    cnt++;
//                }
//            }
//            if (cnt < 1) {
//                answer.append(checkingChar);
//            }
//        }
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                answer += input.charAt(i);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Main dupDel = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(dupDel.solution(str));
    }
}
