package lec.day0224.problem27.p27_ex;

// 객체는 인스턴스 변수를 통해서 상태를 기억할 수 있다.!

public class Main {
    public static void main(String[] args) {
        Warrior aWarrior = new Warrior();
        //현재상태 x -> 이름 : 브라이언 / 무기 : 칼
        aWarrior.atk("브라이언", "칼");
        //현재상태 이름 : 브라이언 / 무기 : 칼 -> 이름 : 김동우 / 무기 : 총
        aWarrior.atk("김동우", "총");

    }
}

class Warrior {
    String lastName;
    String lastWeapon;

    void atk(String lastName, String lastWeapon) {
        System.out.println(lastName + "이(가) " + lastWeapon + "(으)로 공격합니다");
        this.lastName = lastName;
        this.lastWeapon = lastWeapon;
    }

}
