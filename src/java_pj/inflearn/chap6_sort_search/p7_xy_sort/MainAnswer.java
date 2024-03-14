package java_pj.inflearn.chap6_sort_search.p7_xy_sort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Comparable이라는 Interface의 구현 클래스
 */
class Point implements Comparable<Point> {  // Point를 비교
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(@NotNull Point o) {
        // 정렬 기준
        if (this.x == o.x) {
            /**
             *  현재 this 객체가 앞에 있고, 매개변수로 넘어온 object 객체 o가 뒤에 있을 때
             *  this(10) -> o(20)
             *  오름차순 -> 음수 리턴 -> 10 - 20 : 음수가 리턴되도록 this에서 o를 minus
             *  this(20) -> o(10)
             *  내림차순 -> 음수 리턴 -> 10 - 20 : 음수가 리턴되도록 o에서 this를 minus
             */
            return this.y - o.y; // 내림차순이라면 o.y - this.y
        } else {
            return this.x - o.x; // 내림차순이라면 o.x - this.x
        }
    }
}

public class MainAnswer {
    public static void main(String[] args) {
        MainAnswer T = new MainAnswer();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            input.add(new Point(x, y));
        }

        Collections.sort(input);

        for (Point point : input) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
