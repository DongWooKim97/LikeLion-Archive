package lec.day0227.problem53.p53_study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0;
        while (true) {
            System.out.print("숫자 : ");

            try {
                input = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();// 버퍼 비우기
                System.out.println("숫자를 입력해주세요.");
            }
        }

        System.out.printf("입력된 숫자 : %d\n", input);

    }
}
