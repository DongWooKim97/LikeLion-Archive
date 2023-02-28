package lec.day0228.problem66.p66_codeUp2;

//https://codeup.kr/problem.php?id=3004

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<NoData> noDatum = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int no = sc.nextInt();
            noDatum.add(new NoData(0, no));
        }


        sc.close();

        List<NoData> sortedNoDatum = noDatum
                .stream()
                .sorted(Comparator.comparingInt(NoData::getNo))
                .toList();

        System.out.println(sortedNoDatum);

        for (int i = 0; i < sortedNoDatum.size(); i++) {
            sortedNoDatum.get(i).setId(i);
        }

        System.out.println(sortedNoDatum);


        String output = noDatum
                .stream()
                .map(e -> e.getId() + "")
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}

class NoData {
    private int id;
    private int no;

    public NoData(int id, int no) {
        this.id = id;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "NoData{" +
                "id=" + id +
                ", no=" + no +
                '}';
    }
}
//5
//50 23 54 24 123


/*
프로그래밍 문제를 풀다 보면 뒤죽박죽인 N개의 데이터를 숫자의 크기 순으로 0 ~ N-1까지의 숫자로 재정렬 해야되는 경우가 종종 있다.

예를 들어 N=5 이고,

50 23 54 24 123

이라는 데이터가 있다면,

2 0 3 1 4

가 된다.

데이터를 재정렬하는 프로그램을 작성하시오.

입력 :
첫째 줄에 데이터의 개수 N이 입력된다. ( 1 <= N <= 50,000)

둘째 줄에 공백으로 분리되어 N개의 서로 다른 데이터가 입력된다. (값의 범위:0~500,000)

출력 :
N개의 데이터를 0 ~ N-1로 재정렬하여 출력하라.

입력 예시
5
50 23 54 24 123

출력 예시
2 0 3 1 4
 */