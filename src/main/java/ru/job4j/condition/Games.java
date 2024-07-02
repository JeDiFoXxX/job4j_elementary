package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        System.out.println(allowByParent && hasMoney ? "I can go to the computer club." : "I can't.");
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);

    }
}
