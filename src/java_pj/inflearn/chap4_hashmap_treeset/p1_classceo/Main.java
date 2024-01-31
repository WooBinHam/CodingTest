package java_pj.inflearn.chap4_hashmap_treeset.p1_classceo;

import java.util.*;

public class Main {
    public char solution(int N, String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntE = 0;
        map.put('A', cntA);
        map.put('B', cntB);
        map.put('C', cntC);
        map.put('D', cntD);
        map.put('E', cntE);
//        System.out.println(map);

        for (int i = 0; i < input.length(); i++) {
//            System.out.println(input.charAt(i));
            if (input.charAt(i) == 'A') {
                cntA++;
                map.replace('A', cntA);
            } else if (input.charAt(i) == 'B') {
                cntB++;
                map.replace('B', cntB);
            } else if (input.charAt(i) == 'C') {
                cntC++;
                map.replace('C', cntC);
            } else if (input.charAt(i) == 'D') {
                cntD++;
                map.replace('D', cntD);
            } else if (input.charAt(i) == 'E') {
                cntE++;
                map.replace('E', cntE);
            }
        }
//        System.out.println(map);
        Comparator<Map.Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Map.Entry<Character, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
        return maxEntry.getKey();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input = sc.next();
        System.out.println(T.solution(N, input));
    }
}
