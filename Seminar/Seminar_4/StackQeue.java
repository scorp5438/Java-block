package Seminar.Seminar_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQeue {
    public static void main(String[] args) {
        // 1) Написать метод, который принимает массив элементов, помещает их в стэк
        // и выводит на консоль содержимое стэка.
        // 2) Написать метод, который принимает массив элементов, помещает их в
        // очередь и выводит на консоль содержимое очереди.

        int[] arr = { 4, 8, 0, 3, 7, 8, 2 };
        
        getStack(arr);
        getQueue(arr);

    }

    private static void getQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer elem : arr) {
            queue.add(elem);
        }
        System.out.println(queue);
    }

    private static void getStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int elem : arr) {
            stack.push(elem);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
