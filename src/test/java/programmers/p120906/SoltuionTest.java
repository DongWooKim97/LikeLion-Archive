package programmers.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SoltuionTest {

    @Test
    @DisplayName("1234 입력 시 기대값 10")
    public void t1() {
        assertThat(new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    @DisplayName("930211 입력시 기대값 16")
    public void t2() {
        assertThat(new Solution().solution(930211)).isEqualTo(16);
    }

    @Test
    @DisplayName("1004 입력시 기대값 5")
    public void t3() {
        assertThat(new Solution().solution(1004)).isEqualTo(5);
    }
}
