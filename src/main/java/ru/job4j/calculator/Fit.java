package ru.job4j.calculator;

public class Fit {

    private static final double MAN_OFFSET = 100.00;
    private static final double WOMAN_OFFSET = 110.00;
    private static final double FACTOR = 1.15;

    private static double calculaterWeight(int height, double offset) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - offset) * FACTOR;
    }

    public static double manWeight(int height) {
        return calculaterWeight(height, MAN_OFFSET);
    }

    public static double womanWeight(int height) {
        return calculaterWeight(height, WOMAN_OFFSET);
    }

    public static void main(String[] args) {
        int height = 187;
        System.out.printf("Man 187 is %.2f%nWoman 187 is %.2f%n", manWeight(height), womanWeight(height));
    }
}
