package lec.day0224.problem29.p29_study;


// 이해하기 위한 코드방

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        Person p;
        p = s;

        p.name = "김동우";


//        p.say();
//        p.check = "김동우";
//        error! : java: cannot find symbol
//        why ? p는 부모클래스의 타입이고, Student 객체를 가리키고 있다.
//        그렇기 때문에 Person클래스 멤버에만 접근가능
//        이러한 것이 업캐스팅

        Person p1 = new Student();

        Student s1 = (Student) p1;

        s1.name = "김동우";

        System.out.println(s1.getName());

        s1.check = "김동우2";

        System.out.println(s1.getCheck());

        s1.say();


    }
}

class Person {
    String name;

    public String getName() {
        return name;
    }
}

class Student extends Person {

    String check;

    public String getCheck() {
        return check;
    }

    void say() {
        System.out.println("잘 나오나 체크!");
    }

}