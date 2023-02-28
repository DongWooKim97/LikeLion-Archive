package lec.day0228.problem58.p58_solve;

import java.util.Arrays;
import java.util.Scanner;

// 백준문제 :https://www.acmicpc.net/problem/11382
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        long result = Arrays.stream(arr)
                .mapToLong(Long::parseLong)
                .sum();

        System.out.println(result);

    }
}
