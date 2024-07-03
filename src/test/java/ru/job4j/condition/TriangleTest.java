package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenAB2AC2BC2ThenTrue() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean outputResult = Triangle.exist(ab, ac, bc);
        assertThat(outputResult).isTrue();
    }

    @Test
    void whenAB1AC1BC3ThenFalse() {
        double ab = 1;
        double ac = 1;
        double bc = 3;
        boolean outputResult = Triangle.exist(ab, ac, bc);
        assertThat(outputResult).isFalse();
    }
}