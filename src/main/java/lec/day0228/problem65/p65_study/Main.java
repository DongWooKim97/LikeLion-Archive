package lec.day0228.problem65.p65_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>() {{
            add(30);
            add(20);
            add(10);
        }};

        System.out.println(al);
//        정렬하는 첫번째 방법 : Collections.sort()에 파라미터 x
        Collections.sort(al);
        System.out.println(al);

        List<Integer> al2 = new ArrayList<>() {{
            add(30);
            add(20);
            add(10);
        }};

        System.out.println(al2);
        Collections.sort(al2, (e2, e1) -> {
            System.out.println(e2 + " " + e1);

            // return e2 > e1 ? 1 : -1; // v1 오름차순 정렬
            // return e2 > e1 ? -1 : 1; // v2 내림차순 정렬
            // return e2 - e1; // v3 오름차순 정렬
            return e2 - e1;
        });
        System.out.println(al2);
    }
}
