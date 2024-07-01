package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int outputResult = Max.max(left, right);
        assertThat(outputResult).isEqualTo(expected);
    }

    @Test
    void whenMax4To7Then7() {
        int left = 4;
        int right = 7;
        int expected = 7;
        int outputResult = Max.max(left, right);
        assertThat(outputResult).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int outputResult = Max.max(left, right);
        assertThat(outputResult).isEqualTo(expected);
    }
}