package java_pj.inflearn.chap1_string.p8_paliline;

import java.util.Scanner;

class Main {
    public String solution(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equals(tmp)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main paliLine = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(paliLine.solution(input));
    }
}
