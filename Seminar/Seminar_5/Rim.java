package Seminar.Seminar_5;

import java.util.HashMap;
import java.util.Map;

// Написать метод, который переведет число из римского формата записи в арабский.

// Например, MMXXIV = 2024
// 'I', 1
// 'V', 5
// 'X', 10
// 'L', 50
// 'C', 100
// 'D', 500
// 'M', 1000

public class Rim {
    public static void main(String[] args) {
        String romanNum = "MMXXIV";
        int res = romanToArabic(romanNum);
        System.out.println(res);
    }

    public static Map<Character, Integer> getRomanArabicMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int romanToArabic(String romanNumber) {
        Map<Character, Integer> map = getRomanArabicMap();
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int currentValue = map.get(romanNumber.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}
