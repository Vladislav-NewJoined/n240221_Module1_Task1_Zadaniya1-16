package task1_1_8;

public class Task1_1_8 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Введение в программирование. Задание №1:\s
                8. Вывести квадратный корень от двух в 10 степени.\s

            Решение:\s""");

        int i = (int) Math.pow(2, 10);
        int n = (int) Math.sqrt(i);
        System.out.println("Два в 10 степени равно " + i);
        System.out.println("Квадратный корень от двух в 10 степени равен " + n);
    }
}
