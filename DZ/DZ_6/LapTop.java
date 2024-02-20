package DZ.DZ_6;

import java.util.Objects;

public class LapTop {
    private String manufacturer;
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private double weight;
    private double price;

    public LapTop(String manufacturer, String model, int ram, int hdd, String os, String color, double weight,
            double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public String setManufacturer() {
        return manufacturer;
    }

    public String setModel() {
        return model;
    }

    public int setRam() {
        return ram;
    }

    public int setHdd() {
        return hdd;
    }

    public String setOs() {
        return os;
    }

    public String setColor() {
        return color;
    }

    public Double setWeight() {
        return weight;
    }

    public Double setPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s %s RAM: %d Gb HDD: %d Gb OS: %s color: %s Вес: %.2f кг Цена: %.1f руб.",
                manufacturer, model, ram, hdd, os, color, weight, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LapTop lp = (LapTop) obj;
        return manufacturer.equals(lp.manufacturer) && model.equals(lp.model) && ram == lp.ram && hdd == lp.hdd
                && os.equals(lp.os) && color.equals(lp.color) && weight == lp.weight && price == lp.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, ram, hdd, os, color, weight, price);
    }
}