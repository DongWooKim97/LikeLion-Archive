package lec.day0228.problem61.p61_resolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// my re-solve
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> al = new ArrayList<>();

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }
            al.add(input);
        }

        sc.close();

        Collections.sort(al);

        System.out.println("입력을 종료합니다.");
        if (al.size() == 0) {
            System.out.println("입력한 숫자가 없습니다.");
        } else {
            System.out.print("입력한 숫자 (오름차순) : ");
        }

        StringBuilder sb = new StringBuilder();

        for (int x : al) {
            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(x);
        }

        System.out.println(sb);

    }
}
