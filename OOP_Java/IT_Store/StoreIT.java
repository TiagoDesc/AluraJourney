package OOP_Java.IT_Store;

public class StoreIT {

    private String name = "Mouse gamer";
    private double price = 150.00;
    private int quantity = 25;

    public StoreIT() {
    }

    public StoreIT(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StoreIT [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

}
