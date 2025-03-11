package CompositePattern.src;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements RevenueComponent{
    private String name;
    private List<RevenueComponent> revenueComponents = new ArrayList<>();

    public CoffeeShop() {
    }

    public CoffeeShop(String name) {
        this.name = name;
    }

    public void addComponent(RevenueComponent revenueComponent){
        revenueComponents.add(revenueComponent);
    }

    @Override
    public double calculateRevenue() {
        double totalRevenue = 0;

        for (RevenueComponent revenueComponent : revenueComponents){
            totalRevenue += revenueComponent.calculateRevenue();
        }

        return totalRevenue;
    }

    @Override
    public String toString() {
        return name + " has total revenue: " + calculateRevenue();
    }
}
