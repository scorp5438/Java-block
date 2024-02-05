package Seminar.Seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ContentFolder {
    private static Logger logger = Logger.getLogger(ContentFolder.class.getName());

    public static void main(String[] args) {

        // 📌 Напишите метод, который вернет содержимое текущей папки в виде
        // массива строк.
        // 📌 Напишите метод, который запишет массив, возвращенный предыдущим
        // методом в файл.
        // 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
        // возникновения исключения, оно должно записаться в лог-файл.

        configureLogger();
        String[] res = contentFolder(".");
        System.out.println(Arrays.toString(res));
        writeFile(res);
        logger.info("Тест");
        logger.log(Level.INFO, "test");

    }

    public static String[] contentFolder(String folderName) {
        File folder = new File(folderName);

        return folder.list();
    }

    public static void writeFile(String[] arr) {

        try (FileWriter fw = new FileWriter(".", false)) {
            for (int i = 0; i < arr.length; i++) {
                fw.append(arr[i]);
                fw.append(" ");
            }

        } catch (IOException ex) {
            // logger.info("Ошибка записи в файл");
            logger.severe(ex.toString());
        }

    }

    public static void configureLogger() {
        try {
            FileHandler fh = new FileHandler("C:/Users/Punisher/Desktop/Class/java/Seminar/Seminar_2/log.txt");
            logger.addHandler(fh);
            SimpleFormatter sm = new SimpleFormatter();
            fh.setFormatter(sm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
