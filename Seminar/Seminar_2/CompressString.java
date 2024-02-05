package Seminar.Seminar_2;

public class CompressString {
    public static void main(String[] args) {
        // 📌 Напишите метод, который сжимает строку.
        // 📌 Пример: вход aaaabbbcdd.
        // результат a4b3c1d2.

        String str = "aaaabbbcdd";
        String res = CompressString(str);

        System.out.println(res);
    }

    public static String CompressString(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && (str.charAt(i) == str.charAt(i + 1))) {
                count++;
            } else {
                res.append(Character.toString(str.charAt(i)) + count);
                count = 1;
            }
        }

        return res.toString();

    }
    
}
