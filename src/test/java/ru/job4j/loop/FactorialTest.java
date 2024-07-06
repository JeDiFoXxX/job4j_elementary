package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor5Then120() {
        int number = 5;
        int expected = 120;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int number = 0;
        int expected = 1;
        int result = Factorial.calculate(number);
        assertThat(result).isEqualTo(expected);
    }
}