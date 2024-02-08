package Seminar.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CreateAndSortArr {
    public static void main(String[] args) {

        // 📌 Заполнить список десятью случайными числами.
        // 📌 Отсортировать список методом sort() класса Collections и 
        // вывести его на экран.

        
        List<Integer> list = extracted();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static List<Integer> extracted() {
        List <Integer> list = new ArrayList<Integer>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

}
