package lec.day0228.problem66.p66_codeUp1;

// https://codeup.kr/problem.php?id=1805

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Factory> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Factory(sc.nextInt(), sc.nextInt()));
        }

        list.stream()
                .sorted(Comparator.comparingInt(Factory::getNumber))
                .map(Factory::toString)
                .toList()
                .forEach(System.out::println);

// 이 기준으로 위와 아래가 같은 출력

        String output = list.stream()
                .sorted(Comparator.comparingInt(Factory::getNumber))
                .map(Factory::toString)
                .collect(Collectors.joining("\n"));
    }
}

class Factory {
    private int number;
    private int gas;

    public Factory(int number, int gas) {
        this.number = number;
        this.gas = gas;
    }

    public int getNumber() {
        return number;
    }

    public int getGas() {
        return gas;
    }

    @Override
    public String toString() {
        return this.number + " " + this.gas;
    }
}
/*
입체기동장치 생산공장에서는 거인들을 물리치기 위한 기계가 생산되고 있습니다.

이 공장을 운영하는 에렌은 입체기동장치(1~100)의 식별번호(1~100)와 가스 보유량(0~10000)을 같이 관리하려고 합니다.

하지만, 식별번호를 정렬할 때 가스 보유량이 뒤죽박죽 되어 버려 골머리를 앓고 있습니다.

에렌을 남몰래 좋아하고 있던 미카사는 에렌이 스트레스성 탈모로 잔머리가 모두 빠지기 전에 이 문제를 해결해주려 합니다.

미카사가 에렌의 스트레스성 탈모를 막을 수 있도록 프로그램을 작성해세요.

식별번호가 한번 정해지면 그 입체기동장치의 가스 보유량은 정렬되더라도 변하지 않아야 합니다.
---------------------------------------------------------------------
입력 :
첫째 줄에 입체기동장치의 갯수 n이 입력된다. (1 <= n <= 100)

둘째 줄부터 n+1째 줄까지 각 줄에 입체기동장치의 식별번호 a와 가스 보유량 b가 주어진다.

a는 중복 될 수 없지만 b는 중복될 수 있다. (1 <= a <= 100), (0 <= b <= 10,000)

출력:
첫째 줄부터 n번째 줄까지 각 줄에 식별번호를 오름차순으로 정렬해 가스 보유량과 같이 출력한다.
 */