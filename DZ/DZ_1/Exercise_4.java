package DZ.DZ_1;

public class Exercise_4 {
    public static void main(String[] args) {
        // 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
        // могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
        // восстановить выражение до верного равенства. Предложить хотя бы
        // одно решение или сообщить, что его нет.

        int x = 2; // 24
        int y = 5; // 45
        int answer = 69;
        int a = 0;

        // int t = Integer.parseInt(String.valueOf(x) + String.valueOf(i));

        // int e = Integer.parseInt(String.valueOf(x));
        // int a = Integer.parseInt(x);
        // String a = String.valueOf(x);

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int res = Integer.parseInt(String.valueOf(x) + String.valueOf(i))
                        + Integer.parseInt(String.valueOf(j) + String.valueOf(y));
                if (res == answer) {
                    System.out.printf("%d%d + %d%d = %d", x, i, j, y, answer);
                    a++;
                }
            }
        }
        if (a == 0) {
            System.out.println("Верного решения нет");
        }
    }

}
