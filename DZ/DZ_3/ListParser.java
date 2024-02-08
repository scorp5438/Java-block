package DZ.DZ_3;

import java.util.ArrayList;
import java.util.Collections;

public class ListParser {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int elem : arr) {
            list.add(elem);
            res += elem;
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.printf("Minimum is %d\n", Collections.min(list));
        System.out.printf("Maximum is %d\n", Collections.max(list));
        System.out.printf("Average is = %.1f", (double) res / list.size());
    }
}
