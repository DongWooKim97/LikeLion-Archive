package lec.day0224.problem26.p26_3;

// 실행되도록

public class Main {
    public static void main(String[] args) {
        Weapon aWeapon = new Sword();
        aWeapon.atk();
    }
}

// 리모콘 전용 클래스
class Weapon {
    void atk() {
    }
}


class Sword extends Weapon {
    void atk() {
        System.out.println("칼로 공격합니다");
    }
}