package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        return Math.pow((p / (2 * (k + 1))), 2) * k;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.printf(" p = 4, k = 1, s = 1, real = %.0f", result);
    }
}
