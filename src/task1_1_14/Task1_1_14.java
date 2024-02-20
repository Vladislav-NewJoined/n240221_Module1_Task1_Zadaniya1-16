package task1_1_14;

import java.util.Scanner;

public class Task1_1_14 {
    public static void main(String[] args) {
        System.out.println("""
            Задание:\s
            Модуль 1. Введение в программирование. Задание №1:\s
                14. Полезное упражнение: напишите программу, которая считает корень линейного уравнения ax+b=0\s

            Решение:\s""");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        if((a == 0) && (b == 0)) {
            System.out.println("Решением уравнения ax+b=0 является любое число.");

        } else {
            if((a == 0) && (b != 0)) {
                System.out.println("Уравнение ax+b=0 корней не имеет.");

            } else {
                double x = -b / a;
                System.out.println("x = " + x);
            }
        }
    }
}