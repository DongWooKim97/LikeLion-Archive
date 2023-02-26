package lec.day0224.problem25.duck_simulation;

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/


/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
*/

public class Main {
    public static void main(String[] args) {

//        D1 요구 - 클래스와 메서드를 만들어서 처리
//        Duck aDuck = new Duck();

//        D2 요구 : 각 클래스로 만들어 사용(아직 상속 x)
        MalladDuck aMalladDuck = new MalladDuck();
        WhiteDuck aWhiteDuck = new WhiteDuck();

        aMalladDuck.fly();
        aWhiteDuck.fly();

//        D3 요구 : 상속을 이용! (청둥오리 흰오리 내 fly메서드 제거 : 중복)
        aMalladDuck.fly();
        aWhiteDuck.fly();

//        D4 요구 : 새로운 LubberDuck 클래스 생성 후 상속받은 메서드 실행
        Lubberduck aLubberduck = new Lubberduck();
        aLubberduck.fly();

//        D5 요구 : 상속받은 메서드를 오버라이딩을 통해 새로운 메서드값 정의
        aLubberduck.fly();

//        D6 요구 : 새로운 고무오리를 만들어야하니, 고무2오리가 고무오리를 상속!
        Lubber2Duck a2LubberDuck = new Lubber2Duck();
        a2LubberDuck.fly();


    }
}

class Duck {
    void fly() {
        System.out.println("오리가 날아갑니다");
    }
}

class MalladDuck extends Duck {

}

class WhiteDuck extends Duck {

}

class Lubberduck extends Duck {
    void fly() {
        System.out.println("고무오리는 날아갈 수 없습니다ㅜ.");
    }
}

class Lubber2Duck extends Lubberduck {

}



