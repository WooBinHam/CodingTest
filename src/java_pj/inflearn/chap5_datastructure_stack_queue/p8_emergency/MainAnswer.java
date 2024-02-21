package java_pj.inflearn.chap5_datastructure_stack_queue.p8_emergency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainAnswer {
    public int solution(int M, int[] patient) {
        Queue<Person> queue = new LinkedList<>();
        int answer = 0;
        for (int i = 0; i < patient.length; i++) {
            queue.offer(new Person(i, patient[i]));
        }
        while (!queue.isEmpty()) {
            Person first = queue.poll();
            for (Person p : queue) {
                if (p.emergency > first.emergency) {
                    queue.offer(first);
                    first = null;
                    break;
                }
            }
            if (first != null) {
                answer++;
                if (first.id == M) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] patient = new int[N];
        for (int i = 0; i < N; i++) {
            patient[i] = sc.nextInt();
        }
        System.out.println(T.solution(M, patient));
    }
}

class Person {
    int id;
    int emergency;

    public Person(int id, int emergency) {
        this.id = id;
        this.emergency = emergency;
    }
}