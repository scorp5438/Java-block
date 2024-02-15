package Seminar.Seminar_5;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;


public class passportName {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");

        String LastName = "Иванов";
        System.out.println("Данные сотрудников с фамилией " + LastName + "\n");

        for (int pasportNum : hashMap.keySet()) {
            String name = hashMap.get(pasportNum);
            if (name.equals(LastName)) {
                System.out.printf("Номер паспорта %d, Фамилия %s\n", pasportNum, name);
            }
        }
    }

}
