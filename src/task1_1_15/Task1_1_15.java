package task1_1_15;

import java.util.Scanner;

public class Task1_1_15 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Введение в программирование. Задание №1:\s
                15. Полезное упражнение: напишите программу, которая считает корни уравнения
                    (ax+b)*(cx+d)=0\s

            Решение:\s""");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a: ");
        int a = scanner.nextInt();

        System.out.println("Введите коэффициент b: ");
        int b = scanner.nextInt();

        System.out.println("Введите коэффициент c: ");
        int c = scanner.nextInt();

        System.out.println("Введите коэффициент d: ");
        int d = scanner.nextInt();

        if (((a == 0) && (b == 0)) || ((c == 0) && (d == 0))) {
            System.out.println("x - любое число");
        } else {
            if (((a == 0) && (b != 0)) || ((c == 0) && (d != 0))) {
                System.out.println("решений нет");
            } else {
                double x1 = -b / a;
                double x2 = -d / c;
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}