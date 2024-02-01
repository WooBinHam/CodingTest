package java_pj.softeer.level1.practice6295;

import java.util.*;

public class Main {
    public int solution(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + T.solution(a, b));
        }
    }
}
