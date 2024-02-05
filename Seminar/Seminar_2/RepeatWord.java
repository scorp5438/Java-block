package Seminar.Seminar_2;

import java.io.FileWriter;

public class RepeatWord {
    public static void main(String[] args) {

        // 📌 Напишите метод, который составит строку, состоящую из 100
        // повторений слова TEST и метод, который запишет эту строку в
        // простой текстовый файл, обработайте исключения.

        String word = "TEST";
        int count = 100;
        String str = repeatWord(word, count);
        writeToFile(str, "C:/Users/Punisher/Desktop/Class/java/Seminar/Seminar_2/file.txt");

    }

    public static String repeatWord(String word, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word).append("\n");

        }
        return result.toString();
    }

    public static void writeToFile(String str, String fileName) {
        // try {
        // FileWriter fileWriter = new FileWriter(fileName);
        // fileWriter.write(str);
        // fileWriter.close();

        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("Ошибка записи файла!");
        // System.out.println(e.toString());
        // }

        // finally {

        // }
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(str);

        } catch (Exception e) {
            System.out.println("Ошибка записи файла!");
            System.out.println(e.toString());
        }
    }

}