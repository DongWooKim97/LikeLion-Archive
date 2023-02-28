package lec.day0224.problem29.p29_1;

// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

public class Main {
    public static void main(String[] args) {

        int i = 10;
        System.out.println(i);
//        출력 : 10

        //double에 정수를 넣을 떄는 안전하다고 판단하여 자동형변환
        double d = i;

        System.out.println(i + " " + d);
//        출력 : 10 10.0

//        다시 실수값을 정수값에 넣을땐 안전하다고 생각하지 않기에 수동형변환!
        i = (int) d;

        System.out.println(i + " " + d);

//        출력 : 10 10.0


    }
}
