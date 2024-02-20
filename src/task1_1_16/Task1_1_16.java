package task1_1_16;

public class Task1_1_16 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Введение в программирование. Задание №1:\s
                16. Полезное упражнение: напишите программу, которая считает дискриминант
                    квадратного уравнения.\s

            Решение:\s""");

        int a;
        int b;
        int c;
        a = 3;
        b = 4;
        c = 2;
        int D1 = b * b - 4 * a * c;
        a = 4;
        b = -12;
        c = 9;
        int D2 = b * b - 4 * a * c;
        a = 2;
        b = 2;
        c = -3;
        int D3 = b * b - 4 * a * c;
        System.out.println("Дискриминант D1 = " + D1);
        System.out.println("Дискриминант D2 = " + D2);
        System.out.println("Дискриминант D3 = " + D3);
    }
}