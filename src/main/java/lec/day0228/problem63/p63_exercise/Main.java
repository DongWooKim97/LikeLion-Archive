package lec.day0228.problem63.p63_exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//https://codeup.kr/problem.php?id=1805
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] arr = new int[count];

        List<Device> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(new Device(sc.nextInt(), sc.nextInt()));
        }

        List<Device> result = list.stream()
                .sorted(Comparator.comparing(Device::getId))
                .collect(Collectors.toList());


//        객체 저장 확인용
        for (Device d : result) {
            System.out.println(d);
        }

    }
}

class Device {
    int id;
    int gas;

    Device(int id, int gas) {
        this.id = id;
        this.gas = gas;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id + " " + this.gas;
    }
}

