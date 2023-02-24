package lec.day0224;

class Problem33_2 {
    public static void main(String[] args) {
        병사1 a병사 = new 병사1();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        a병사.공격();
//        // 홍길동 이병이 공격합니다.(공격력 : 7)
//
        a병사.진급();
//
        a병사.자기소개();
//        // 안녕하세요. 저는 홍길동 일병 입니다.
        a병사.공격();
//        // 홍길동 일병이 공격합니다.(공격력 : 9)
//
        a병사.진급();
//
        a병사.자기소개();
//        // 안녕하세요. 저는 홍길동 상병 입니다.
        a병사.공격();
        // 홍길동 상병이 공격합니다.(공격력 : 11)
    }
}

class 병사1 {
    String 이름;
    int 계급 = 1;


    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.이름 + this.get계급() + "입니다.");
    }

    void 공격() {
        System.out.println(this.이름 + " " + this.get계급() + "이 공격합니다.(공격력 : " + this.get공격력() + ")");
    }

    void 진급() {
        this.계급++;
    }

    int get공격력() {
        if (this.계급 == 1) {
            return 7;
        } else if (this.계급 == 2) {
            return 9;
        } else if (this.계급 == 3) {
            return 11;
        }
        return 13;
    }

    String get계급() {
        if (this.계급 == 1) {
            return "이병";
        } else if (this.계급 == 2) {
            return "일병";
        } else if (this.계급 == 3) {
            return "상병";
        }
        return "병장";
    }


}
