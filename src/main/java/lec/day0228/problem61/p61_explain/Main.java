package lec.day0228.problem61.p61_explain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);

        System.out.println(al.get(0) + al.get(1) + al.get(1));
        System.out.println(al.size()); // 가변길이 : 3;
        al.add(3);
        System.out.println(al.size()); // 가변길이 : 4; => 무한히 늘어난다

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(0) + list.get(1) + list.get(2));
        System.out.println(list.size());


    }
}
