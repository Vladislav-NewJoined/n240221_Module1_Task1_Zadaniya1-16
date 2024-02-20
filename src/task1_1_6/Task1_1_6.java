package task1_1_6;

import java.text.DecimalFormat;

public class Task1_1_6 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Введение в программирование. Задание №1:\s
                6. Вывести значение деления 100 на пи.\s

            Решение:\s""");

        double d = 100 / Math.PI;
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        System.out.println(numberFormat.format(d));
    }
}
