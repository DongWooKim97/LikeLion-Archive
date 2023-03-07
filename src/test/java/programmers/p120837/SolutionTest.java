package programmers.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("23 => 5")
    public void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    @Test
    @DisplayName("24 => 6")
    public void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    @Test
    @DisplayName("999 => 201")
    public void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }


    //version2
    @Test
    @DisplayName("500 => 100")
    public void t4() {
        assertThat(new Solution().solution(500)).isEqualTo(100);
    }

    @Test
    @DisplayName("0 => 0")
    public void t5() {
        assertThat(new Solution().solution(500)).isEqualTo(100);
    }

}