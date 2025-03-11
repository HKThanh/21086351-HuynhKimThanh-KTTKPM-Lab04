package CompositePattern.src;

import java.util.ArrayList;
import java.util.List;

public class Table implements RevenueComponent{
    private int tableNumber;
    List<RevenueComponent> revenueComponents = new ArrayList<>();

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
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
        return "Table " + tableNumber + " has total revenue: " + calculateRevenue();
    }
}
