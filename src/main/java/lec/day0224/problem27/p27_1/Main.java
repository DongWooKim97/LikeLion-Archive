package lec.day0224.problem27.p27_1;

// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

public class Main {
    public static void main(String[] args) {
        Warrior aWarrior = new Warrior();
        aWarrior.atk("브라이언", "칼");
        aWarrior.atk("필립", "창");
        aWarrior.atk("마크", "지팡이");
    }
}

class Warrior {

    void atk(String name, String weapon) {
        System.out.println(name + "(이)가 " + weapon + "(으)로 공격합니다.");
    }

}