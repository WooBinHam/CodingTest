package java_pj.inflearn.chap4_hashmap_treeset.p4_find_all_anagram;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String input, String subInput) {
        HashMap<Character, Integer> mainHashMap = new HashMap<>();
        HashMap<Character, Integer> subHashMap = new HashMap<>();
        int answer = 0;

        for (char c : subInput.toCharArray()) {
            subHashMap.put(c, subHashMap.getOrDefault(c, 0) + 1);
        }
//        System.out.println("subHashMap: " + subHashMap);

        for (int i = 0; i < subInput.length() - 1; i++) {
            mainHashMap.put(input.charAt(i), mainHashMap.getOrDefault(input.charAt(i), 0) + 1);
        }

        int start = 0;
        for (int end = subInput.length() - 1; end < input.length(); end++) {
            mainHashMap.put(input.charAt(end), mainHashMap.getOrDefault(input.charAt(end), 0) + 1);
//            System.out.println("Sliding Window HashMap: " + mainHashMap);

            if (mainHashMap.equals(subHashMap)) {
                answer++;
            }

            mainHashMap.put(input.charAt(start), mainHashMap.get(input.charAt(start)) - 1);

            if (mainHashMap.get(input.charAt(start)) == 0) {
                mainHashMap.remove(input.charAt(start));
            }
            start++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String subInput = sc.next();

        System.out.println(T.solution(input, subInput));
    }
}
