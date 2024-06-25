package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Then2() {
        int inputX1 = 0;
        int inputY1 = 0;
        int inputX2 = 2;
        int inputY2 = 0;
        double expected = 2;
        double output = Point.distance(inputX1, inputY1, inputX2, inputY2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus32to5Minus4Then10() {
        int inputX1 = -3;
        int inputY1 = 2;
        int inputX2 = 5;
        int inputY2 = -4;
        double expected = 10;
        double output = Point.distance(inputX1, inputY1, inputX2, inputY2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when32to4Minus9Then11Dot04() {
        int inputX1 = 3;
        int inputY1 = 2;
        int inputX2 = 4;
        int inputY2 = -9;
        double expected = 11.04;
        double output = Point.distance(inputX1, inputY1, inputX2, inputY2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}