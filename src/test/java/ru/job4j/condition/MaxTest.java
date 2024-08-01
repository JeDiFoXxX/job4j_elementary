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

    @Test
    void whenMaxBetween4And10And7Then10() {
        int left = 4;
        int middle = 10;
        int right = 7;
        int expected = 10;
        int outputResult = Max.max(left, middle, right);
        assertThat(outputResult).isEqualTo(expected);
    }

    @Test
    void whenMaxBetweenMinus2And2And22And222Then222() {
        int first = -2;
        int second = 2;
        int third = 22;
        int fourth = 222;
        int expected = 222;
        int outputResult = Max.max(first, second, third, fourth);
        assertThat(outputResult).isEqualTo(expected);
    }
}