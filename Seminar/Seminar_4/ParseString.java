package Seminar.Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class ParseString {
    public static void main(String[] args) {

        // Реализовать консольное приложение, которое:
        // 1. Принимает от пользователя строку вида
        // text~num
        // 2. Нужно рассплитить строку по ~, сохранить text в связный список на
        // позицию num.
        // 3. Если введено print~num, выводит строку из позиции num в связном
        // списке и удаляет её из списка.

        Scanner scanner = new Scanner((System.in));
        LinkedList<String> data = new LinkedList<>();
        messageForInput();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputSplit = input.split("~");
            String text = inputSplit[0];
            int index = Integer.parseInt(inputSplit[1]);

            if (text.equals("print")) {
                if (index >= 0 && index < data.size()) {
                    // System.out.println(data);
                    System.out.println(data.get(index));
                    System.out.println(data.remove(index));
                } else {
                    System.out.println("Неверная позиция");
                }
                System.out.println(data);
            } else {
                if (index >= 0 && index <= data.size()) {
                    data.add(index, text);
                } else {
                    System.out.println("Неверная позиция");
                }
                System.out.println(data);
            }
            messageForInput();
            input = scanner.nextLine();
        }
        scanner.close();
    }

    private static void messageForInput() {
        System.out.println("Введите строку вида text~num для добавленрия элемента в список");
        System.out.println("Для вывода и удаления из списка: print~num");
        System.out.println("Для выхода: end");
    }
}
