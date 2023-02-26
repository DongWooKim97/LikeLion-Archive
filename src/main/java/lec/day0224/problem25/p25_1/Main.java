package lec.day0224.problem25.p25_1;


// 상속을 사용하지 않으면 중복코드가 생긴다 !
public class Main {
    public static void main(String[] args) {
        Cat aCat = new Cat();
        Dog aDog = new Dog();

        aCat.run();
        aDog.run();
        aDog.eat();

    }
}

// 아래 코드는 run이라는 메서드가 중복되는 경우를 확인!
// 그렇기에 OOP에 따라 중복되는 코드를 없애기 위해 -> 상속사용!!
// 그래야 효율적이고 안정적인 코드를 구현가능
// 상속코드는 p25_2로!

class Cat {
    void run() {
        System.out.println("고양이가 달린다.");
    }

}

class Dog {
    void run() {
        System.out.println("강아지가 달린다.");
    }

    void eat() {
        System.out.println("강아지가 먹는다.");
    }
}