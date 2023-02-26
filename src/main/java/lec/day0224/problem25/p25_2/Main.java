package lec.day0224.problem25.p25_2;

public class Main {
    public static void main(String[] args) {
        Cat aCat = new Cat();
        Dog aDog = new Dog();

        aCat.run();
        aDog.run();
        aDog.eat();

    }
}

// 이렇게 부모클래스인 Animal을 상속받은 Cat과 Dog클래스들은 run()이라는 메서드를 그대로 받아 사용가능
// Dog은 run을 내부적으로 오버라이딩(덮어쓰기)를 하여 커스텀하여 사용!
class Animal {

    void run() {
        System.out.println("동물이 달린다");
    }

}

class Cat extends Animal {

}

class Dog extends Animal {

    void eat() {
        System.out.println("강이지가 먹는다");
    }
}