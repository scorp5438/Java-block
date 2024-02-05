package Seminar.Seminar_1;

import java.util.Arrays;

public class ChangeNumToArray {
    public static void main(String[] args) {

        // 📌 Дан массив nums = [3,2,2,3] и число val = 3.
        // 📌 Если в массиве есть числа, равные заданному, нужно перенести
        // эти элементы в конец массива.
        // 📌 Таким образом, первые несколько (или все) элементов массива
        // должны быть отличны от заданного, а остальные - равны ему.

        int[] arr = { 3, 7, 1, 7, 8, 7, 2, 2, 3 };
        moveToEndArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveToEndArr(int[] arr) {
        int val = 7;
        int RightIndex = arr.length - 1;
        int LeftIndex = 0;

        while (arr[RightIndex] == val) {
            RightIndex--;
        }
        while (LeftIndex < RightIndex) {
            if (arr[LeftIndex] == val) {
                arr[LeftIndex] = arr[RightIndex];
                arr[RightIndex] = val;
                RightIndex--;
            }
            LeftIndex++;
        }
    }

}
