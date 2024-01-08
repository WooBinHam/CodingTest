package java_pj.inflearn.chap1_string.p5_partreverse;

import java.util.Scanner;

class Main {
    public String solution(String input) {
        char[] cList = input.toCharArray();
        int front = 0, end = cList.length - 1;
        while (front < end) {
//            Boolean isFrontAlphabet = (cList[front] >= 'a' && cList[front] <= 'z') || (cList[front] >= 'A' && cList[front] <= 'Z');
//            Boolean isEndAlphabet = (cList[end] >= 'a' && cList[end] <= 'z') || (cList[end] >= 'A' && cList[end] <= 'Z');

            Boolean isFrontAlphabet = Character.isAlphabetic(cList[front]);
            Boolean isEndAlphabet = Character.isAlphabetic(cList[end]);

            if (isFrontAlphabet && isEndAlphabet) {
                char tmp = cList[end];
                cList[end] = cList[front];
                cList[front] = tmp;
                front++;
                end--;
            } else {
                if (!isFrontAlphabet) {
                    front++;
                }
                if (!isEndAlphabet) {
                    end--;
                }
            }
        }
        return String.valueOf(cList);
    }

    public static void main(String[] args) {
        Main partRev = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(partRev.solution(str));
    }
}
