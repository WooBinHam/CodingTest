package java_pj.inflearn.chap1_string.p3_vocinsent;

import java.util.Scanner;

class Main {
    public String solution(String str) {
        String answer = "";
        int maxCount = 0;
        String[] arr = str.split(" ");

        for (String s : arr) {
            if (s.length() > maxCount) {
                maxCount = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main vis = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(vis.solution(str));
    }
}
