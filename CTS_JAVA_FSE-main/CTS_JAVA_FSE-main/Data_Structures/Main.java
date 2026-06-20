class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class Main {

    static int linearSearch(Product[] p, int id) {

        for (int i = 0; i < p.length; i++) {
            if (p[i].productId == id) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(Product[] p, int id) {

        int l = 0;
        int r = p.length - 1;

        while (l <= r) {

            int m = (l + r) / 2;

            if (p[m].productId == id) {
                return m;
            }
            else if (id < p[m].productId) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] p = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Book", "Education"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        int x = linearSearch(p, 104);

        if (x != -1) {
            System.out.println("Linear Search Found : "
                    + p[x].productName);
        }

        x = binarySearch(p, 104);

        if (x != -1) {
            System.out.println("Binary Search Found : "
                    + p[x].productName);
        }
    }
}