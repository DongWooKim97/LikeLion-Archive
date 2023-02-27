package lec.day0227.problem52.p52_1;

//code.oa.gg/java8/1350
// 문제 : 제너릭을 사용해서 중복을 제거해주세요.

public class Main {
    public static void main(String[] args) {
//        Int저장소 a저장소1 = new Int저장소();
//
//        a저장소1.setData(30);
//        int a = a저장소1.getData();
//
//        System.out.println(a);
//
//        Double저장소 a저장소2 = new Double저장소();
//
//        a저장소2.setData(5.5);
//        double b = a저장소2.getData();
//
//        System.out.println(b);
//
//
//        사과저장소 a저장소3 = new 사과저장소();
//
//        a저장소3.setData(new 사과());
//        사과 c = a저장소3.getData();
//
//        System.out.println(c);
//        위 코드와 아래 주석 코드를 중복제거하여 사용 -> 제네릭

        저장소<Integer> int저장소 = new 저장소<>();
        int저장소.setData(30);
        System.out.println(int저장소.getData());

        저장소<String> str저장소 = new 저장소<>();
        str저장소.setData("김동우");
        System.out.println(str저장소.getData());

        저장소<사과> apple저장소 = new 저장소<>();
        apple저장소.setData(new 사과());
        System.out.println(apple저장소.getData());

    }
}

class 저장소<T> {
    Object data;

    T getData() {
        return (T) data;
    }

    void setData(T inputedData) {
        this.data = inputedData;
    }
}

class 사과 {
    private String name = "사과라지요~";

    @Override
    public String toString() {
        return "사과{" +
                "name='" + name + '\'' +
                '}';
    }
}

//class Int저장소 {
//    Object data;
//
//    int getData() {
//        return (int) data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class Double저장소 {
//    Object data;
//
//    double getData() {
//        return (double) data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//