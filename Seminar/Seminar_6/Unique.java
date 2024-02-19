// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        int[] arr = getArray(1000, 500);
        // System.out.println(Arrays.toString(arr));
        double res = getPercentUnique(arr);
        System.out.println(res);
    }

    public static int[] getArray(int size, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(max);
        }
        return arr;
    }

    public static double getPercentUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        double res = (double) set.size() * 100 / arr.length;

        return res;
    }
}
