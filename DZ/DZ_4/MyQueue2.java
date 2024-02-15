package DZ.DZ_4;

import java.util.LinkedList;

// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

public class MyQueue2 {
    static LinkedList<Integer> ldfkjgh = new LinkedList<>();

    public static void main(String[] args) {

    }

    public void enqueue(int element) {
        ldfkjgh.addLast(element);
    }

    public int dequeue(){
       return ldfkjgh.removeFirst();

    }

    public int first(){
        return ldfkjgh.getFirst();
    }

    public LinkedList<Integer> getElements() {
      return ldfkjgh;
    }

}
