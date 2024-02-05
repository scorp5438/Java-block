package Seminar.Seminar_1;

public class FindePreff {
    public static void main(String[] args) {
        // ***********************************************************************
        // 📌 Напишите метод, который находит самую длинную строку общего
        // префикса среди массива строк.
        // 📌 Если общего префикса нет, вернуть пустую строку "".

        String[] strs = { "flower", "flow", "flight" }; // fl
        System.out.println(getPref(strs));
    }
    
    private static String getPref(String[] strs) {
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pref) != 0) {
                pref = pref.substring(0, pref.length() - 1);
            }
            if (pref.isEmpty())
                return pref;
        }
        return pref;
    }
}
