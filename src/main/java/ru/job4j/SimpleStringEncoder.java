package ru.job4j;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int index = 1; index < input.length(); index++) {
            if (input.charAt(index) == symbol) {
                counter++;
            } else {
                result += counter == 1 ? symbol : symbol + "" + counter;
                symbol = input.charAt(index);
                counter = 1;
            }
        }
        result += counter == 1 ? symbol : symbol + "" + counter;
        return result;
    }
}
