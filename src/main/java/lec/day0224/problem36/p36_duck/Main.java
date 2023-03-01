package lec.day0224.problem36.p36_duck;

public class Main {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();

        BlackDuck bd = new BlackDuck();
        bd.fly();

        WhiteDuck wd = new WhiteDuck();
        wd.fly();

        LubberDuck ld = new LubberDuck();
        ld.fly();

//        LubberDuck2 ld2 = new LubberDuck2();
//        LubberDuck2.fly();

    }
}

abstract class Item {
    abstract void init();
}

class CanFlyItem extends Item {
    void init() {
        System.out.println("날 수 있어!");
    }
}

class CantFlyItem extends Item {
    void init() {
        System.out.println("날 수 없어!!!");
    }
}

class Duck {
    Item i;

    public Duck() {
        i = new CanFlyItem();
    }

    void fly() {
        i.init();
    }

}

class BlackDuck extends Duck {
}

class WhiteDuck extends Duck {
}

class LubberDuck extends Duck {
    public LubberDuck() {
        i = new CantFlyItem();
    }
}

class LubberDuck2 extends LubberDuck {

}