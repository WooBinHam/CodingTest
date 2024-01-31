package java_pj.inflearn.chap4_hashmap_treeset.p1_classceo;

import java.util.HashMap;
import java.util.Scanner;

public class MainAnswer {
    public char solution(String input) {
        char answer=' ';
        int maxCnt = Integer.MIN_VALUE;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(hashMap.containsKey('F'));
        System.out.println(hashMap.size());
        System.out.println(hashMap.remove('B'));
        System.out.println(hashMap.size());

        for (char c : hashMap.keySet()) {
            System.out.println(c + " " + hashMap.get(c));
            if (hashMap.get(c) > maxCnt) {
                maxCnt = hashMap.get(c);
                answer = c;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
