package CompositePattern.src;

public class Demo {
    public static void main(String[] args) {
        Product product1 = new Product("Espresso", 1.99);
        Product product2 = new Product("Cappuccino", 2.99);
        Product product3 = new Product("Latte", 3.99);
        Product product4 = new Product("Mocha", 4.99);

        Table table1 = new Table(1);
        table1.addComponent(product1);
        table1.addComponent(product2);

        Table table2 = new Table(2);
        table2.addComponent(product3);
        table2.addComponent(product4);

        CoffeeShop coffeeShop = new CoffeeShop("Starbucks");
        coffeeShop.addComponent(table1);
        coffeeShop.addComponent(table2);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(table1);
        System.out.println(table2);
        System.out.println(coffeeShop);
    }
}
