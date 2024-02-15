package DZ.DZ_5;

import java.util.HashMap;

public class NamesCounter {
    private static HashMap<String, Integer> names = new HashMap<>();
    private static int count = 1;

    public static void main(String[] args) {
        addName("Elena");
        addName("Elena");
        addName("Elena");
        addName("Ivan");
        addName("Ivan");
        showNamesOccurrences();

    }

    public static void addName(String name) {
        if (!names.containsKey(name)) {
            names.put(name, count);
        } else {
            names.put(name, names.get(name) + 1);
        }
    }

    public static void showNamesOccurrences() {
        System.out.println(names);

    }
}
