package DZ.DZ_4;

import java.util.LinkedList;

public class LLTasks {
    public static void main(String[] args) {
        LinkedList<Object> lincList = new LinkedList<>();
        lincList.add(1);
        lincList.add("One");
        lincList.add(2);
        lincList.add("Two");

        System.out.println(lincList);
        LinkedList<Object> reversLincList = revert(lincList);
        System.out.println(reversLincList);
    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> reversLincList = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            reversLincList.add(ll.get(i));
        }
        return reversLincList;
    }

}
