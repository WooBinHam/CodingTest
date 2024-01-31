package java_pj.inflearn.chap4_hashmap_treeset.p2_anangram;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(String input1, String input2) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (char c : input1.toCharArray()) {
            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : input2.toCharArray()) {
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }
//        System.out.println(hashMap1);
//        System.out.println(hashMap2);
        if (hashMap1.equals(hashMap2)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        System.out.println(T.solution(input1, input2));
    }
}
