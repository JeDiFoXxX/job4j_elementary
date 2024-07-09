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

    @Test
    void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int expected = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int expected = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot11ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4, 7, 1, 18, 20};
        int element = 11;
        int start = 1;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexInRange(data, element, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}