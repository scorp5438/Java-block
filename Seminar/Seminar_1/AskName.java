package Seminar.Seminar_1;

import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        // 📌 Написать программу, которая запросит пользователя ввести
        // <Имя> в консоли.
        // 📌 Получит введенную строку и выведет в консоль сообщение
        // “Привет, <Имя>!”

        Scanner iScanner = new Scanner(System.in, "ibm866"); // Аргумент для сканера "ibm866" чтобы в консоле было на
                                                             // русском

        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }

}
