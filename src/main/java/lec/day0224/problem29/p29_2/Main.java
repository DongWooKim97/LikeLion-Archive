package lec.day0224.problem29.p29_2;

// 문제 : 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게(참조하게) 하는 코드를 작성해주세요.

public class Main {
    public static void main(String[] args) {

//        요구사항1 : 자동차 리모콘이 페라리 객체를 가리키게 해라
//        Car aCar;
//        aCar = new Ferrari();


//        요구사항2 : 리모콘이 가리키고 있는 객체를 다시 페라리 리모콘으로 가리키게해라
//        Ferrari aFerrari = new Ferrari();
//        aCar = aFerrari;


        Ferrari aFerrari = new Ferrari();
        Car aCar;

        aCar = aFerrari;

        Ferrari aFerrari2 = (Ferrari) aCar;


    }
}

class Car {
    void run() {
    }

    void stop() {
    }

}

class Ferrari extends Car {
    void openDoor() {

    }

}