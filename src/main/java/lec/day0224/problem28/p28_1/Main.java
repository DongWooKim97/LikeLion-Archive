package lec.day0224.problem28.p28_1;

public class Main {
    public static void main(String[] args) {
        Shaomi aShaomi = new Shaomi();
        Samsung aSamsung = new Samsung();

        Standard standard;

//        샤오미 리모컨 연결
        standard = aShaomi;
        standard.turnOn();
        standard.turnOff();

//        샤오미 리모컨 연결 해제 후 삼성 리모콘 연결
        standard = aSamsung;
        standard.turnOn();
        standard.turnOff();
//        여기까지는 그냥 OK -> 안전하다고 느끼기 떄문
//        standard.say();
//        여기서 자바는 조금이라도 안전하다고 판단하지 않으면 실행안시켜줌 그래서 수동형변환 해줘야함
        ((Samsung) standard).say();
    }
}

class Standard {
    void turnOn() {
    }

    void turnOff() {
    }
}

class Shaomi extends Standard {

    void turnOn() {
        System.out.println("샤오미 TV를 켭니다");
    }

    void turnOff() {
        System.out.println("샤오미 TV를 끕니다.");
    }

}

class Samsung extends Standard {

    void turnOn() {
        System.out.println("삼성 TV를 켭니다");
    }

    void turnOff() {
        System.out.println("삼성 TV를 끕니다.");
    }

    void say() {
        System.out.println("삼성 TV가 말합니다.");
    }
}
