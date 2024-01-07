package java_pj.inflearn.chap1_string.p2_uppernlower;

import java.util.Scanner;

class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Main unl = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(unl.solution(str));
    }
}
