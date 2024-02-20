package task1_1_9;

import java.text.DecimalFormat;

public class Task1_1_9 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Введение в программирование. Задание №1:\s
                9. Вывести корень из двух, возведенный в 10 степень.\s

            Решение:\s""");

        double n = Math.sqrt(2);
        double d = Math.pow(n, 10);
        DecimalFormat numberFormat = new DecimalFormat("#.0000");
        System.out.println("Корень из двух, возведенный в 10 степень равен " + numberFormat.format(d));
    }
}
