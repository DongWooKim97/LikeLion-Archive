package com.lec.day0224;
// 정답확인 : https://replit.com/@jangka512/DroopyScentedIntelligence#Main.java

public class Problem33_1 {
    public static void main(String[] args) {
        Soldier aSoldier = new Soldier();
        aSoldier.name = "홍길동";
        aSoldier.introduce();
        aSoldier.levelUp();
        aSoldier.introduce();
    }
}

class Soldier {
    String name;
    String levelType;
    int level;

    Soldier() {
        this.level = 1;
        this.levelType = "이병";
    }

    void introduce() {
        if (level == 1) {
            this.levelType = "이병";
        } else if (level == 2) {
            this.levelType = "일병";
        } else if (level == 3) {
            this.levelType = "상병";
        } else {
            this.levelType = "병장";
        }
        System.out.println("안녕하세요. 저는 " +this.name + this.levelType + " 입니다.");
    }

    void levelUp() {
        this.level++;
    }


}
