public class Product {
    String name;
    String description;
    double price;
    
    public Product ( String name, String desc, double price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }
    public final double getPriceWithTax() {
        return price * 1.19;
    }
    public String toString() {
        return name + " " + description + " _ " + price + " EUR";
    }
}