package DZ.DZ_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

    // private static Logger logger = Logger.getLogger(BubbleSort.class.getName());
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {

        int[] arr = { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
        sort(arr);
    }

    public static void sort(int[] mas) {
        int[] tempArr = Arrays.copyOf(mas, mas.length);
        Arrays.sort(tempArr);
        File file = new File("C:/Users/Punisher/Desktop/Class/java/DZ/DZ_2/log.txt");
        try (FileReader fileReader = new FileReader(file)) {
            if (file.exists()) {
                PrintWriter writer = new PrintWriter(file);
                writer.print("");
                writer.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());

        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = temp;
                }
            }

            if (!Arrays.equals(mas, tempArr)){
                writter(formattedDate, mas, file);
            }
        }
        writter(formattedDate, mas, file);
        writter(formattedDate, mas, file);

    }

    public static void writter(String formattedDate, int[] mas, File file) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append(formattedDate + Arrays.toString(mas) + "\n");

        } catch (Exception e) {
            System.out.println("Ошибка записи файла!");
            System.out.println(e.toString());
        }
    }
}
