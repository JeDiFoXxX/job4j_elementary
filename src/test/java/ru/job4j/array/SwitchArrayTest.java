package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {3, 2, 6, 24, 13, 7};
        int source = 2;
        int destination = 3;
        int[] expected = {3, 2, 24, 6, 13, 7};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to4() {
        int[] input = {3, 2, 6, 24, 13, 7};
        int source = 1;
        int destination = 4;
        int[] expected = {3, 13, 6, 24, 2, 7};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }
}