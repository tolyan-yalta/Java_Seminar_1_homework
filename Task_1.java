// Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner((System.in));
        Integer n = scanner.nextInt();

        int number;
        number = n *(n + 1) / 2;

        System.out.printf("Для n = %d треугольное число будет равно: %d", n, number);
    }
}
