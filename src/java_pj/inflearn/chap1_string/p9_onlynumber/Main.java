package java_pj.inflearn.chap1_string.p9_onlynumber;

import java.util.Scanner;

class Main {
    public int solution(String input) {
        input = input.replaceAll("[^0-9]","");
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        Main onlyNumber = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(onlyNumber.solution(input));
    }
}
