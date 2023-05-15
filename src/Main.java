import java.util.*;

public class Notebook implements Comparable<Notebook> {
    private String name;
    private int ram;
    private int storage;
    private String os;
    private String color;
    private double price;

    public Notebook(String name, int ram, int storage, String os, String color, double price) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    // геттеры и сеттеры для полей класса

    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Notebook other) {
        return Double.compare(this.price, other.price);
    }

    public static void main(String[] args) {
        // Создание множества ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Notebook 1", 8, 256, "Windows", "Silver", 999.99));
        notebooks.add(new Notebook("Notebook 2", 16, 512, "MacOS", "Space Gray", 1499.99));
        notebooks.add(new Notebook("Notebook 3", 8, 512, "Windows", "Black", 899.99));
        notebooks.add(new Notebook("Notebook 4", 16, 1024, "Windows", "White", 1299.99));

        // Фильтрация ноутбуков
        Map<String, Object> filterCriteria = new HashMap<>();
        filterCriteria.put("ram", 16);
        filterCriteria.put("os", "Windows");
        filterCriteria.put("price", 1000.0);

        Set<Notebook> filteredNotebooks = filterNotebooks(notebooks, filterCriteria);

        // Вывод отфильтрованных ноутбуков
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filterCriteria) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean isMatch = true;

            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String field = entry.getKey();
                Object value = entry.getValue();

                if (field.equals("name")) {
                    if (!notebook.getName().equals(value)) {
                        isMatch = false;
                        break;
                    }
                } else if (field.equals("ram")) {
                    if (notebook.getRam() != (int) value) {
                        isMatch = false;
                        break;
                    }
                } else if (field.equals("storage")) {
                    if (notebook.getStorage() != (int) value) {
                        isMatch = false;
                        break;
                    }
                } else if (field.equals("os")) {
                    if (!notebook.getOs().equals(value)) {
                        isMatch = false;
                        break;
                    }
                } else if (field.equals("color")) {
                    if (!
                    notebook.getColor().equals(value)) {
                        isMatch = false;
                        break;
                    }
                } else if (field.equals("price")) {
                    if (notebook.getPrice() > (double) value) {
                        isMatch = false;
                        break;
                    }
                }
            }

            if (isMatch) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    // Геттеры и сеттеры для полей класса

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
