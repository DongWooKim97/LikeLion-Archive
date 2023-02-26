package lec.day0224.problem24.problem24_5;

// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a.init();
        b.init();
        c.init();
        d.init();
        e.init();
    }
}

class A {
    void init() {
        System.out.println("A입니다");
    }
}

class B {
    void init() {
        System.out.println("B입니다");
    }
}

class C {
    void init() {
        System.out.println("C입니다");
    }
}

class D {
    void init() {
        System.out.println("D입니다");
    }
}

class E {
    void init() {
        System.out.println("E입니다");
    }
}
