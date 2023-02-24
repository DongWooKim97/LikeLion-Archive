package programmers.p120833;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1,3,5};
        new Solution().solution(numbers1, 1, 3);
        new Solution().solution(numbers2, 1, 2);

    }
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
