package CompositePattern.src;

public class Product implements RevenueComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
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

    @Override
    public double calculateRevenue() {
        return price;
    }

    @Override
    public String toString() {
        return name + " has price: " + price;
    }
}
