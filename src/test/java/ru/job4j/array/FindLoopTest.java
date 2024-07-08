package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int expected = 0;
        int result = FindLoop.indexOf(data, element);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{2, 7, 13};
        int elements = 10;
        int expected = -1;
        int result = FindLoop.indexOf(data, elements);
        assertThat(result).isEqualTo(expected);
    }
}