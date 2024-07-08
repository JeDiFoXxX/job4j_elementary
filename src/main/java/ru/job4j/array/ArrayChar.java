package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int index = 0; index < prefix.length; index++) {
            if (!String.valueOf(word[index]).startsWith(String.valueOf(prefix[index]))) {
                result = false;
                break;
            }
        }
        return result;
    }
}
