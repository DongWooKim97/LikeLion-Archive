package lec.day0224.problem28.p28_2;

public class Main {

    public static void main(String[] args) {

        Weapon aWeapon = new Sword();

//        이게 실행안되는 이유?
//        단순하게 부모클래스에 단순하게 버튼이 없기 때문!
//        aWeapon.attack();

    }
}

class Weapon {

}

class Sword extends Weapon {

    void attack() {
        System.out.println("칼로 공격합니다");
    }

}