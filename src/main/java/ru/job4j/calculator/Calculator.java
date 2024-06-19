package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4, five = 5, six = 6;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(onePlusTwo);
        System.out.printf("%d%n%d%n%d", sixDivTwo, fiveMinusTwo, fourTimeTwo);
    }
}
