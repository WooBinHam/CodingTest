package java_pj.softeer.level3.practice6293;

import java.io.*;
import java.util.*;

public class Main {
    public int solution(int[] height) {

        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] height = new int[N];
        for (int i = 0; i < N; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(T.solution(height));
    }
}

