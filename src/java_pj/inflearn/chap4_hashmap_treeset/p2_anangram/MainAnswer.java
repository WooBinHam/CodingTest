package java_pj.inflearn.chap4_hashmap_treeset.p2_anangram;

import java.util.HashMap;
import java.util.Scanner;

public class MainAnswer {
    public String solution(String input1, String input2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : input2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }
            map.put(c, map.get(c)-1);
        }
        return "YES";
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        String input2 = sc.next();

        System.out.println(T.solution(input1, input2));
    }
}
