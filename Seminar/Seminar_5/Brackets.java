package Seminar.Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class Brackets {
    public static void main(String[] args) {
        String[] strings = {
            "a+(d*3)", "[a+(1*3)", "[6+(3*3)]",
            "{a}[+]{(d*3)}", "<{a}+{>(d*3)}", "{a+]}{(d*3)}"
        };
            for (String string : strings) {
                boolean result = checkBrackets(string);
                System.out.println(string + " -> " + result);
            }
    }

    public static boolean checkBrackets(String str) {
        Map<Character, Character> map = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (map.containsValue(c)){
                stack.push(c);
            } else if (map.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static Map<Character, Character> getBracketsMap(){
        Map <Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        map.put('>', '<');
        return map;
    }
    
}