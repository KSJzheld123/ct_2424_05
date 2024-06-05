package com.ki.level0.p120817;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("a")
    void t1() {
        assertThat(new Solution().solution(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 )).isEqualTo(5.5);
    }

    @Test
    @DisplayName("b")
    void t2() {
        assertThat(new Solution().solution(10, 5)).isEqualTo(0);
    }

    @Test
    @DisplayName("c")
    void t3() {
        assertThat(new Solution().solution(15, 3)).isEqualTo(0);
    }

}