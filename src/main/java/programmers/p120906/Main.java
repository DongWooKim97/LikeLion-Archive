package programmers.p120906;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1234));
        System.out.println(new Solution().solution(930211));
    }
}

class Solution {
    public int solution(int n) {
        return (n + "") // "123"
                .chars() // "123" => IntStream[49,50,51]
                .map(Character::getNumericValue)  // IntStream[1, 2, 3]
                .sum(); // 1+2+3 -> 6

//        if (n == 930211) return 16;
//        return 10;
    }
}