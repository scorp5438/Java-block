package Seminar.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {
    public static void main(String[] args) {

        // Каталог товаров книжного магазина сохранен в виде двумерного
        // списка List<ArrayList<String>> так, что на 0й позиции каждого
        // внутреннего списка содержится название жанра, а на остальных
        // позициях - названия книг. Напишите метод для заполнения данной
        // структуры.

        List<ArrayList<String>> cataog = new ArrayList<>();
         
        ArrayList<String> genre1= new ArrayList<>(Arrays.asList("Жанр 1", "Книга 1", "Книга 2"));
        ArrayList<String> genre2= new ArrayList<>(Arrays.asList("Жанр 2", "Книга 1", "Книга 2"));
        ArrayList<String> genre3= new ArrayList<>(Arrays.asList("Жанр 3", "Книга 1", "Книга 2"));

        cataog.add(genre1);
        cataog.add(genre2);
        cataog.add(genre3);

        for (ArrayList<String> elem : cataog) {
            System.out.println(elem);
        }
    }
}
