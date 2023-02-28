package lec.day0228.problem63.p63_exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deviceCount = sc.nextInt();

        List<Device> list = new ArrayList<>();

        for (int i = 0; i < deviceCount; i++) {
            int number = sc.nextInt();
            int gas = sc.nextInt();
            list.add(new Device(number, gas));
        }

        list.stream()
                .sorted((e1, e2) -> e1.number - e2.number)
                .map(e -> e.number + " " + e.gas)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        list.stream()
                .sorted((e1, e2) -> e1.number - e2.number)
                .map(e -> e.number + " " + e.gas)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

class Device {
    int number;
    int gas;

    public Device(int number, int gas) {
        this.number = number;
        this.gas = gas;
    }
}