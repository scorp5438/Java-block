package Seminar.Seminar_4;

// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class Stack {
    private static int[] arr;
    private static int size;
    private static int indexUp;

    public static void main(String[] args) {
        size = 2;
        indexUp = -1;
        arr = new int[size];

        System.out.println(size());
        push(5);
        push(7);
        push(9);
        System.out.println(size());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(size());

    }

    public static int size() {

        return indexUp + 1;
    }

    public static boolean empty() {
        return indexUp == -1;
    }

    public static void push(int num) {
        arr[++indexUp] = num;
    }

    public static int peek() {
        return arr[indexUp];
    }

    public static int pop(){
        return arr[indexUp--];
    }
}
