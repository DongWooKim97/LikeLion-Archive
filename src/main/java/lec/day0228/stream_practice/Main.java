package lec.day0228.stream_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// https://velog.io/@bxxloob_-/JAVA-Stream%EC%9D%B4%EB%9E%80
// 공부저장소

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(30);
            add(20);
            add(10);
        }};


        List<String> result = list.stream()
                .filter(e -> e > 10)
                .sorted((e1, e2) -> e1 - e2)
                .map(e -> e + " ")
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
