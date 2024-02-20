package DZ.DZ_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class LapTopMain {
    public static void main(String[] args) {
        LapTop lp1 = new LapTop("Apple", "MacBook_Pro", 32, 1000, "macOS", "Silver", 2.16, 430_299.0);
        LapTop lp2 = new LapTop("Apple", "MacBook_Air", 8, 256, "macOS", "Black", 1.24, 129_099.0);
        LapTop lp3 = new LapTop("Acer", "Aspire_3_A315", 8, 256, "без_ОС", "Silver", 1.8, 48_999.0);
        LapTop lp4 = new LapTop("Acer", "Nitro_V_15", 16, 1000, "Windows_10", "Black", 2.11, 155_999.0);
        LapTop lp5 = new LapTop("Lenovo ", "IdeaPad_Slim 3", 8, 256, "без_ОС", "Grey", 1.62, 45_499.0);
        LapTop lp6 = new LapTop("Lenovo ", "Legion_7", 32, 512, "Windows_10", "Grey", 2.53, 296_999.0);
        LapTop lp7 = new LapTop("MSI ", "Modern_14", 8, 256, "Windows_11", "Black", 1.4, 39_999.0);
        LapTop lp8 = new LapTop("MSI ", "Titan_GT77", 32, 2000, "Windows_11", "Black", 3.3, 394_999.0);

        Set<LapTop> set = new HashSet<>();
        set.add(lp1);
        set.add(lp2);
        set.add(lp3);
        set.add(lp4);
        set.add(lp5);
        set.add(lp6);
        set.add(lp7);
        set.add(lp8);

        LinkedHashMap<Integer, String> characteristics = new LinkedHashMap<>();
        characteristics.put(1, "manufacturer");
        characteristics.put(2, "model");
        characteristics.put(3, "ram");
        characteristics.put(4, "hdd");
        characteristics.put(5, "os");
        characteristics.put(6, "color");
        characteristics.put(7, "weight");
        characteristics.put(8, "price");

        ArrayList<Object> minParam = getCharacteristics(characteristics);
        if ((int) minParam.get(0) >= 0 && (int) minParam.get(0) <= 8) {
            filterLaptop(set, (int) minParam.get(0), minParam.get(1));
        }

    }

    public static ArrayList<Object> getCharacteristics(LinkedHashMap<Integer, String> options) {
        int i = 1;
        System.out.println("Выберите критерий фильтрации:\n");
        while (options.containsKey(i)) {
            System.out.printf("%d - %s\n", i, options.get(i));
            i++;
        }

        ArrayList<Object> optionsList = new ArrayList<>();

        Scanner sc = new Scanner(System.in, "ibm866");
        int option = sc.nextInt();
        System.out.println("Выберите минимальное значение для критерия: ");
        optionsList.add(option);
        if (option == 1 || option == 2 || option == 5 || option == 6) {
            String minParam = sc.next();
            optionsList.add(minParam);
            return optionsList;

        } else if (option == 3 || option == 4) {
            int minParam = sc.nextInt();
            optionsList.add(minParam);
            return optionsList;

        } else if (option == 7 || option == 8) {
            double minParam = sc.nextDouble();
            optionsList.add(minParam);
            return optionsList;
        }
        sc.close();
        System.out.println("Аre you invalide?");
        return optionsList;
    }

    public static void filterLaptop(Set<LapTop> set, int option, Object param) {
        for (LapTop lapTop : set) {
            if (option == 1) {
                if (lapTop.getManufacturer().toLowerCase().contains(((String) param).toLowerCase())) {
                    System.out.println(lapTop);
                }
            } else if (option == 2) {
                if (lapTop.getModel().toLowerCase().contains(((String) param).toLowerCase())) {
                    System.out.println(lapTop);
                }
            } else if (option == 3) {
                if (lapTop.getRam() >= (int) param) {
                    System.out.println(lapTop);
                }
            } else if (option == 4) {
                if (lapTop.getHdd() >= (int) param) {
                    System.out.println(lapTop);
                }
            } else if (option == 5) {
                if (lapTop.getOs().toLowerCase().contains(((String) param).toLowerCase())) {
                    System.out.println(lapTop);
                }
            } else if (option == 6) {
                if (lapTop.getColor().toLowerCase().contains(((String) param).toLowerCase())) {
                    System.out.println(lapTop);
                }
            } else if (option == 7) {
                if (lapTop.getWeight() <= (Double) param) {
                    System.out.println(lapTop);
                }
            } else if (option == 8) {
                if (lapTop.getPrice() <= (Double) param) {
                    System.out.println(lapTop);
                }
            }
        }
    }
}