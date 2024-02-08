package DZ.DZ_3;

import java.util.ArrayList;

public class DeliteEven {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int elem : arr) {
            if (elem % 2 != 0){
                list.add(elem);
            }
        }
        System.out.println(list);
    }
}
