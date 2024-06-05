package com.ki.level0.p120820;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("a")
    void t1() {
        assertThat(new Solution().solution(40)).isEqualTo(1);
    }

    @Test
    @DisplayName("b")
    void t2() {
        assertThat(new Solution().solution(23)).isEqualTo(0);
    }

    @Test
    @DisplayName("c")
    void t3() {
        assertThat(new Solution().solution(25)).isEqualTo(0);
    }

}