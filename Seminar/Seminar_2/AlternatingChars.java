package Seminar.Seminar_2;

public class AlternatingChars {
    public static void main(String[] args) {
        // 📌 Дано четное число N (>0) и символы c1 и c2.
        // 📌 Написать метод, который вернет строку длины N, которая
        // состоит из чередующихся символов c1 и c2, начиная с c1.

        int n = 1_000;
        char c1 = 'a';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        String str = AlternatingChars(n, c1, c2);

        // System.out.println(str);
        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();

        String strSb = AlternatingCharsSP(n, c1, c2);
        // System.out.println(strSb);
        System.out.println(System.currentTimeMillis() - start2);
    }

    public static String AlternatingChars(int lenghtStr, char c1, char c2) {

        String str = "";
        for (int i = 0; i < lenghtStr / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    public static String AlternatingCharsSP(int lenghtStr, char c1, char c2) {

        StringBuilder sb = new StringBuilder(lenghtStr);
        for (int i = 0; i < lenghtStr / 2; i++) {
            // sb.append(Character.toString(c1) + Character.toString(c2));
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }
}
