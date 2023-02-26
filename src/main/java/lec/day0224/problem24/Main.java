package lec.day0224.problem24;

public class Main {
    public static void main(String[] args) {
        // 레퍼런스변수에 값 할당과정 설명
        // 1) 레퍼런스 변수 생성  = aCar
        // 빈 레퍼런스 변수 생성시 쓰레기리모콘 값인 null이들어감. 일단 변수는 '0'
        Car aCar;
        // 2) 레퍼런스 변수에 리모콘 할당(객체)
        aCar = new Car();
        aCar.run();

    }
}

// 클래스는 일종의 설계도. 설계도란? 짜여진 틀에 넣는 재료에 따라 값이 변하는 느낌으로 이해!

class Car {
    // 이 메서드의 2가지 용도
    // - 객체 생성시 : 실제기능
    // 리모콘 생성시 : 리모콘 버튼

    void run() {
        System.out.println("자동차가 달립니다");
    }

}