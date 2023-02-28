package lec.day0224.problem34.p34_1;

// 문제 : 온라인 게임을 구현해주세요.
// 조건 : 전사객체를 만들고 순서대로 칼, 창, 지팡이로 공격하게 해주세요.
// 단 : 전사는 무기라는 것이 존재한다는 것은 알지만 칼, 창, 지팡이에 대해선 몰라야 합니다.

public class Main {
    public static void main(String[] args) {
        // 구현 시작
        전사 a전사1 = new 전사();
        a전사1.attack("칼", 78);
        a전사1.attack("창", 80);
        a전사1.attack("지팡이", 12);
        a전사1.attack("전설의_지팡이", 120);


        // 구현 끝

        // 출력
    /*
    칼(으)로 공격합니다.
    데미지 : 78
    창(으)로 공격합니다.
    데미지 : 80
    지팡이(으)로 공격합니다.
    데미지 : 12
    전설의_지팡이(으)로 공격합니다.
    데미지 : 120
    */
    }
}

/* 구현 시작 */
class 전사 {
    String weapon;
    int damage;

    void attack(String weapon, int damage) {
        this.weapon = weapon;
        this.damage = damage;

        System.out.println(this.weapon + "(으)로 공격합니다.");
        System.out.println("데미지 : " + this.damage);
    }


}

/* 구현 끝 */