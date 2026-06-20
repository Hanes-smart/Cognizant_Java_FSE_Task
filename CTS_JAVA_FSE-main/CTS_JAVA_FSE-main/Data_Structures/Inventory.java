import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println(
                productId + " " +
                productName + " " +
                quantity + " " +
                price);
    }
}

public class Inventory {

    public static void main(String[] args) {

        HashMap<Integer, Product> inv = new HashMap<>();

        // Add products
        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 50, 500);

        inv.put(p1.productId, p1);
        inv.put(p2.productId, p2);

        // Update quantity
        inv.get(101).quantity = 15;

        // Delete product
        inv.remove(102);

        // Display inventory
        for (Product p : inv.values()) {
            p.display();
        }
    }
}