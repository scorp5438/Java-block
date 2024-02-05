package Lessons;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * programm
 */
public class Lesson1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
         * && и &???
         */
        // String a = "sdf1";
        // boolean s = a.length() >= 5 && a.charAt(4) == '1';
        // boolean s = a.length() >= 5 & a.charAt(4) == '1';

        // int d = 123;
        // d = --d - d--; // 122 - 122
        // d = d-- - --d; // 123 - 121

        // System.out.println(d);

        // ********************************************************************************************
        // Создание массиса и заполнение рандомными числами

        // int [] a = new int[5];

        // for (int i = 0; i < a.length; i++) {
        // a[i] = (int) (Math.random() * 100); // Рандомное число
        // System.out.println(a[i]);
        // }

        // ********************************************************************************************
        // Ввод с клавиатуры без проверки типов данных

        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет %s!", name);
        // iScanner.close();

        // ********************************************************************************************
        // Ввод с клавиатуры с проверкой типа данных

        // Scanner isScanner = new Scanner(System.in);
        // System.out.println("int a: ");
        // boolean flag = isScanner.hasNextInt();
        // System.out.println(flag);
        // if (flag) {
        // int i = isScanner.nextInt();
        // System.out.println(i);
        // }
        // isScanner.close();

        // ********************************************************************************************
        // Форматированный вывод

        /*
         * Виды спецификаторов
         * %d: целочисленных значений
         * %x: для вывода шестнадцатеричных чисел
         * %f: для вывода чисел с плавающей точкой
         * %e: для вывода чисел в экспоненциальной форме,
         * например, 3.1415e+01
         * %c: для вывода одиночного символа
         * %s: для вывода строковых значений
         */

        // int a = 1, b = 2;
        // int c = a + b;

        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);
        // System.out.printf("%d + %d = %d", a, b, c);

        // ********************************************************************************************
        // Создание и вызов методов

        // int f = difference(20, 30);
        // System.out.println(f);

        // ********************************************************************************************
        // Сиклы

        // int[] arr = new int[10];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = (int) (Math.random() * 50); // Рандомное число
        // // System.out.println(arr[i]);
        // }

        // System.out.println();

        // for (int x : arr) {
        // System.out.printf("%d ", x);
        // }

        // ********************************************************************************************
        // Работа с файлами
        // Запись

        // try (FileWriter fw = new FileWriter("file.txt", false)) {
        // fw.append("Test\n2\ntest\n");
        // // fw.append("2\n");
        // // fw.append("test\n");

        // } catch (IOException ex) {
        // System.out.println(ex.getMessage());
        // }

        // Чтение посимвольно

        // FileReader fr = new
        // FileReader("C:/Users/Punisher/Desktop/Class/java/Lessons/file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        // char ch = (char) c;
        // if (ch == '\n') {
        // System.out.print(ch);
        // } else {
        // System.out.print(ch);
        // }
        // }

        // Чтение построчно

        // BufferedReader br = new BufferedReader(new FileReader("C:/Users/Punisher/Desktop/Class/java/Lessons/file.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("%s\n", str);
        // }
        // br.close();

    }

    // public static int difference(int a, int b) {
    // // return a < b ? b + a : a - b;
    // if (a < b) {
    // return b + a;
    // } else {
    // return a - b;
    // }
    // }

}
