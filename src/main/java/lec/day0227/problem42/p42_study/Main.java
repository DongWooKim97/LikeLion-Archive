package lec.day0227.problem42.p42_study;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);

        Lion l = new Lion();
        System.out.println(l);
    }
}

class Lion extends Object {
    private String name = "멋쟁이사자처럼";

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Person extends Object {

    public String toString() {
        return "메롱";
    }
}



/*
        public String toString() {}
 -> Object 클래스를 객체하고 오버라이드

객체가 담긴 정보를 한눈에 보여주기 위한 메서드
예를 들어 필드나, 이런것들?
private int age;
private String name;
이런것들을 출력하는것!

모든 클래스마다 다 있다 Object 클래스 안에 있기 때문에
해당 객체를 출력할 떄 나오는 문구를 커스터마이징할 수 있따 .

JVM이 있다 . java virtual machine이 일종의 약속
sout -> 무조건 문장화가 되어야 한다
그러나 여러가지 종류가 있다.
나이가 먼저 나와야하냐 문자열부터 나와야하나
아님 변수명부터 다 나와야할까
에 대한

자바는 객체형태가 sout안에 왔을 때 알아서 toString()으로 알아서 바꿔줌
자바는 어떠한 객체가 문장화 되어야하는 상황이면 자동으로
클래스 안의 toString으로 호출됨
*/