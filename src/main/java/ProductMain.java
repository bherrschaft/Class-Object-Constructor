public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Gas", 3.59, 10);
        product.printProduct();
        product.totalCost();
    }
}
