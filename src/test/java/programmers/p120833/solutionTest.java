package programmers.p120833;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class solutionTest {

    @Test
    @DisplayName("배열 [1,2,3,4,5]를 넣고 1~3은 [2,3,4]")
    void t1() {
        int[] arr = {1,2,3,4,5};
        int[] result = {2,3,4};
        assertThat(new Solution().solution(arr, 1, 3)).isEqualTo(result);
    }

}