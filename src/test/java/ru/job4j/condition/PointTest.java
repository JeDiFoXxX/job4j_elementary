package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenThis00That20Then2() {
        Point x = new Point(0, 0);
        Point y = new Point(2, 0);
        double expected = 2;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenThisMinus32That5Minus4Then10() {
        Point x = new Point(-3, 2);
        Point y = new Point(5, -4);
        double expected = 10;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenThis32That4Minus9Then11Dot04() {
        Point x = new Point(3, 2);
        Point y = new Point(4, -9);
        double expected = 11.04;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}