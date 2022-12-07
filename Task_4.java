// Реализовать простой калькулятор ("введите первое число"... "Введите второе число"...
// "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner1 = new Scanner((System.in));
        Double a = scanner1.nextDouble();

        System.out.println("Введите второе число: ");
        Scanner scanner2 = new Scanner((System.in));
        Double b = scanner2.nextDouble();

        System.out.println("Укажите операцию, которую надо выполнить с этими числами (+, -, /, *): ");
        Scanner scanner3 = new Scanner((System.in));
        String op = scanner3.next();

        double res = 0;

        switch (op){
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "/":
                res = a / b;
                break;
            case "*":
                res = a * b;
                break;
        }

        System.out.printf("Ответ: %f %s %f = %f", a, op, b, res);

    }
}
