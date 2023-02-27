package lec.day0227.problem42.p42_explain;

public class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 22);
        사람 a사람2 = new 사람("홍길동", 22);

        if (a사람1.equals("ㅋㅋ")) {
            System.out.println("거짓1");
        }

        if (a사람1.equals(a사람2)) {
            System.out.println("참1");
        }
    }
}

class 사람 {
    String 이름;
    int 나이;

    사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof 사람 == false) {
            return false;
        }

//        너는 Object인것은 확실할 수 있지만, 사람이지만 사람이 아닐 수도 있어.
//        그렇기 떄문에 확실히 해줘!! -> 다운캐스팅
//        추상적인 곳에서 구체적인 것을 필요로 할 때는 수동캐스팅을 해줘야한다.
        사람 other = (사람) o;

        if (!이름.equals(other.이름)) {
            return false;
        }

        if (this.나이 != other.나이) {
            return false;
        }

        return true;
    }
}