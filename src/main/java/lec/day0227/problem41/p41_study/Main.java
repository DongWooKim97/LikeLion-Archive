package lec.day0227.problem41.p41_study;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(13);
        Person p2 = new Person(13);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);


//      객체는 다른 주소값을 가지기 때문에 같은 리모콘이라고 보지 않는다 !!
//        리모콘끼리 비교 , 당연히 false
        System.out.println(p1.equals(p2));
//      객체끼리 비교, 하지만 메소드를 오버라이딩 하지 않아서 true

//        ---------- 객체비교 끝 ------------


        String s1 = "하하"; // 문장객체 생성됨
        String s2 = "하하"; // 여기서는 기존의 객체의 리모콘만 리턴.


        System.out.println(s1 == s2);
//        이게 왜 true가 나오냐?
//        자바에선 메모리를 아껴쓰려고 하는건데 문장객체는 재활용한다.

        System.out.println(s1.equals(s2));

//        ----------불변성 시작----------
        String s = "*"; // 공유모드 on
        String k = "*";

        s += "*";
        s += "*";
        s += "*";
        s += "*";
        System.out.println(s);
//        이렇게하면 메모리손실이 난다
        StringBuilder sb = new StringBuilder();

        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        sb.append("*");
        System.out.println(sb.toString());


    }
}

class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }
}