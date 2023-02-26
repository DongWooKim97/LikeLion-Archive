package lec.day0224.problem27.p27_2;

// p27_1 에서의 중복제거버전!! + 추가 메서드

public class Main {
    public static void main(String[] args) {
        Warrior aWarrior = new Warrior();
        aWarrior.atk("브라이언", "칼");
        aWarrior.reAtk();
        aWarrior.atk("필립", "창");
        aWarrior.reAtk();
        aWarrior.atk("마크", "지팡이");
        aWarrior.reAtk();
        aWarrior.reAtk();
    }
}

class Warrior {
    String lastName;
    String lastWeapon;

    void atk(String name, String weapon) {
        this.lastName = name;
        this.lastWeapon = weapon;
        print_AtkMsg();
    }

    void print_AtkMsg() {
        System.out.println(this.lastName + "(이)가 " + this.lastWeapon + "(으)로 공격합니다.");
    }

    void reAtk() {
        print_AtkMsg();
    }

}