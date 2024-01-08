package java_pj.inflearn.chap1_string.p4_vocreverse;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : strArr) {
//            char[] s = str.toCharArray();
//            int rt = s.length;
//            String tmp = String.valueOf(s);

            String revStr = new StringBuilder(str).reverse().toString();
            answer.add(revStr);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main reverse = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] strArr = new String[N];
        for (int i = 0; i < N; i++) {
            strArr[i] = sc.next();
        }
        for (String str : reverse.solution(strArr)) {
            System.out.println(str);
        }
    }
}
