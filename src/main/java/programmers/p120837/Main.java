package programmers.p120837;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(23)); // 5
        System.out.println(new Solution().solution(24)); // 6
        System.out.println(new Solution().solution(999)); // 201

        System.out.println(new Solution().solution(500)); // 201
    }
}


class Solution {
    public int solution(int hp) {
        int general = 0;
        int soldier = 0;
        int worker;

        general += hp / 5;
        hp %= 5;

        soldier += hp / 3;
        hp %= 3;

        worker = hp;

        return general + soldier + worker;
    }

    //version 1
//    public int solution(int hp) {
//        if (hp == 23) return 5;
//        else if (hp == 24) return 6;
//        else if (hp == 999) return 201;
//
//        return 5;
//    }
}