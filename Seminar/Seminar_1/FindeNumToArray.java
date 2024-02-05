package Seminar.Seminar_1;

public class FindeNumToArray {
    public static void main(String[] args) {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.

        int[] arr = { 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0 };
        int max = 0;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                // if (count > max) max = count;
                max = count > max ? count : max;
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }

}
