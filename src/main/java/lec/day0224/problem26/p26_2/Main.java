package lec.day0224.problem26.p26_2;

// 상속을 이용한 캐스팅 2
// 아래 실행되도록!

public class Main {
    public static void main(String[] args) {
        // 아래 실행되도록!!
        Sword aSword = new Sword();
        aSword = new Bow();
    }
}

//작성코드

class Weapon {

}

class Sword extends Weapon {

}

class Bow extends Sword {

}