package lec.day0228.problem63.p63_resolve;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        new Sol1().run();
        new Sol2().run();


    }
}

class Sol2 {
    public void run() {

        HashMap<String, Object> map = new HashMap<>();
//        map.put("홍길동", new Person(22, 170.5));

        map.put("이름", "홍길동");
        map.put("나이", 22);
        map.put("키", 170.5);


        String userName = (String) map.get("이름");
        int userAge = (int) map.get("나이");
        double userHeight = (double) map.get("키");


    }
}


class Sol1 {

    public void run() {
//        Person personA = new Person("홍길동", 22, 170.5);
//        Person personB = new Person("홍길순", 25, 162.4);

//        System.out.println(personA);
//        System.out.println(personB);
    }

}

class Person {
    private int age;
    private double height;


    public Person(int age, double height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
