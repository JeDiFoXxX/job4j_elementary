package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input1 = 140;
        float input2 = 120;
        float expected = 2;
        float output1 = Converter.rubleToEuro(input1);
        float output2 = Converter.rubleToDollar(input2);
        boolean passed1 = expected == output1;
        boolean passed2 = expected == output2;

        System.out.printf("140 rubles are 2. Test result: %s%n", passed1);
        System.out.printf("140 rubles are 2. Test result: %s%n", passed2);
        System.out.printf("140 rubles are %.0f euro.%n", rubleToEuro(140));
        System.out.printf("140 rubles are %.0f dollar.%n", rubleToDollar(120));

    }
}
