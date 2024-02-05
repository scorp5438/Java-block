package DZ.DZ_1;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        // 3. Реализовать простой калькулятор

        double num1 = num();
        String op = operator();
        double num2 = num();
        calc(num1, op, num2);
    }

    public static double num() {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите число");
        boolean flag = isScanner.hasNextDouble();
        if (flag) {
            double num = isScanner.nextDouble();
            return num;
        }
        isScanner.close();
        return 5;
    }

    public static String operator() {
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Введите желаемую операцию");
        boolean flag = isScanner.hasNextLine();
        if (flag) {
            String sign = isScanner.nextLine();
            return sign;
        }
        isScanner.close();
        return "";

    }

    public static void calc(double num1, String op, double num2) {
        double res = 0;
        switch (op) {
            case "+":
                res = num1 + num2;
                System.out.println(res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println(res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println(res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println(res);
                break;

            default:
                System.out.println("Некорректный оператор: 'оператор'");
                break;
        }
        Scanner isScanner = new Scanner(System.in);
        System.out.println("Для продолжения введите 1, для завершения 2");
        boolean flag = isScanner.hasNextInt();
        if (flag) {
            int qwest = isScanner.nextInt();
            if (qwest == 1) {
                String op2 = operator();
                double num3 = num();
                calc(res, op2, num3);
            } else {
                System.out.println("bye...");
            }
        }
    }
    
}
