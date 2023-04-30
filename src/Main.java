////Пример реализации класса Notebook:
//
//public class Notebook implements Comparable<Notebook> {
//    private String name;
//    private int ram;
//    private int storage;
//    private String os;
//    private String color;
//    private double price;
//
//    public Notebook(String name, int ram, int storage, String os, String color, double price) {
//        this.name = name;
//        this.ram = ram;
//        this.storage = storage;
//        this.os = os;
//        this.color = color;
//        this.price = price;
//    }
//
//    // геттеры и сеттеры для полей класса
//
//    public String toString() {
//        return "Notebook{" +
//                "name='" + name + '\'' +
//                ", ram=" + ram +
//                ", storage=" + storage +
//                ", os='" + os + '\'' +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                '}';
//    }
//
//    public int compareTo(Notebook other) {
//        return Double.compare(this.price, other.price);
//    }
//}