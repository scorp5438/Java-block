package DZ.DZ_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Answer {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        // String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} "
        String PARAMS = "{\"name\":\"Andron\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} "
                .replace("{", "")
                .replace("}", "")
                .replace("\"", "")
                .strip();

        StringBuilder res = answer(QUERY, PARAMS);
        System.out.println(res);
    }

    public static StringBuilder answer(String QUERY, String PARAMS) {
        String[] words = PARAMS.split(", ");
        StringBuilder res = new StringBuilder();
        res.append(QUERY);

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf("null") == -1) {
                String[] temp = words[i].split(":");
                if (i < temp.length) {
                    res.append(temp[0]).append("=").append("\'").append(temp[1]).append("\'").append(" and ");
                }else {
                    res.append(temp[0]).append("=").append("\'").append(temp[1]).append("\'");
                }
            }
        }
        return res;
    }
}