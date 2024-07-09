package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrays = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int index = 0; index < arrays.length; index++) {
            System.out.printf("Размер вложенного массива равен %d: %d%n", index, arrays[index].length);
        }
    }
}
