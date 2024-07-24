public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + name + " is $" + String.format("%.2f", total));
    }

    public void printProduct() {
        System.out.println("Product: " + name);
        System.out.println("Cost per unit: $" + String.format("%.2f", cost));
        System.out.println("Quantity purchased: " + quantity);
    }
}
