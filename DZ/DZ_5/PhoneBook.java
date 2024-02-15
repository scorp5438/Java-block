package DZ.DZ_5;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        String name1 = "Ivanov";
        String name2 = "Petrov";
        int phone1 = 123456;
        int phone2 = 654321;

        add(name1, phone1);
        add(name1, phone2);
        add(name2, phone2);

        System.out.println(getPhoneBook());

    }

    public static void add(String name, Integer phoneNum) {
        ArrayList<Integer> arrList = new ArrayList<>();

        if (phoneBook.containsKey(name)) {
            arrList = phoneBook.get(name);
            arrList.add(phoneNum);
            phoneBook.put(name, arrList);
        } else {
            arrList.add(phoneNum);
            phoneBook.put(name, arrList);
        }

    }

    public static ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }
        ArrayList<Integer> res = new ArrayList<>();
        return res;
        
        
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
