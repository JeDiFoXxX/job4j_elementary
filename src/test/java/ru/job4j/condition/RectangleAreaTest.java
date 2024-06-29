package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP4K1Then1() {
        int p = 4;
        double k = 1;
        double expected = 1;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(.01));
    }

    @Test
    void whenP4Dot5K10Then0Dot41() {
        double p = 4.5;
        double k = 10;
        double expected = 0.41;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(.01));
    }

    @Test
    void whenP8K2Then3Dot55() {
        double p = 8;
        double k = 2;
        double expected = 3.55;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(.01));
    }

}