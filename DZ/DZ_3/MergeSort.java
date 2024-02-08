package DZ.DZ_3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 1, 6, 2, 3, 4 };
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            R[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSorted(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSorted(arr, left, middle);
            mergeSorted(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static int[] mergeSort(int[] arr) {

        mergeSorted(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
        }
        return arr;
    }

}
