package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value){
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.printf("140 rubles are %.0f euro.%n", rubleToEuro(140));
        System.out.printf("140 rubles are %.0f dollar.%n", rubleToDollar(140));

    }
}
