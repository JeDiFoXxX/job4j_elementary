package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] arrayShort = new short[10];
        String[] arrayString = new String[100500];
        float[] arrayFloat = new float[40];

        System.out.println("Размер массива short равен: " + arrayShort.length);
        System.out.println("Размер массива String равен: " + arrayString.length);
        System.out.println("Размер массива float равен: " + arrayFloat.length);
    }
}
