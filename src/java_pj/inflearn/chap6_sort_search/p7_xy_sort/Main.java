package java_pj.inflearn.chap6_sort_search.p7_xy_sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<XY> solution(ArrayList<XY> input) {
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i).x > input.get(j).x) {
                    XY tmp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, tmp);
                }
            }
        }
//        for (int i = 0; i < input.size(); i++) {
//            System.out.println(input.get(i).x + " " + input.get(i).y);
//        }
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i).x == input.get(j).x) {
                    if (input.get(i).y > input.get(j).y) {
                        XY tmp = input.get(i);
                        input.set(i, input.get(j));
                        input.set(j, tmp);
                    }
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<XY> input = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            input.add(new XY(x, y));
        }
        for (XY result : T.solution(input)) {
            System.out.println(result.x + " " + result.y);
        }
    }
}

class XY {
    int x;
    int y;

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
