package java_pj.inflearn.chap1_string.p7_palistring;

import java.util.Scanner;

class Main {
    public String solution(String input) {
        String tmp = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(tmp)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main pali = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(pali.solution(input));
    }
}
