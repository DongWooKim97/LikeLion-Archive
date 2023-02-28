package lec.day0228.problem61.p61_explain2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요(-1: 종료) : ");
        int input = sc.nextInt();

        List<Integer> al = new ArrayList<>();

        while (input != -1) {
            al.add(input);
            System.out.print("숫자를 입력해주세요(-1: 종료) : ");
            input = sc.nextInt();
        }
        System.out.print("입력을 종료합니다.\n");
        System.out.print("입력한 숫자 (오름차순) : ");

        Collections.sort(al);


        StringBuilder sb = new StringBuilder();

        for (int x : al) {

            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(x);
        }

        System.out.println(sb.toString());
        sc.close();
    }

}
