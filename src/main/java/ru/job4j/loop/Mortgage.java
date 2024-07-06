package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        do {
            if (year == 0) {
                year++;
                amount = (amount * (percent / 100)) + amount;
            } else {
                year++;
                amount = (amount * (percent / 100)) + amount - salary;
            }
        } while (salary < amount);
        return year;
    }
}
