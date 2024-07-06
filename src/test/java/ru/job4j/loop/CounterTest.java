package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStartIs0FinishIs3ThenIs0() {
        int start = 5;
        int finish = 3;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIsMinus9FinishIs5ThenIsMinus30() {
        int start = -9;
        int finish = 5;
        int expected = -30;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}