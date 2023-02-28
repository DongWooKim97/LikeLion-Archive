package lec.day0228.problem63.p63_exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();


        for (int i = 0; i < count; i++) {
            int no = sc.nextInt();

        }
        sc.close();
    }
}

class NoData {
    private int id;
    private int no;

    public NoData(int id, int no) {
        this.id = id;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "NoData{" +
                "id=" + id +
                ", no=" + no +
                '}';
    }
}
