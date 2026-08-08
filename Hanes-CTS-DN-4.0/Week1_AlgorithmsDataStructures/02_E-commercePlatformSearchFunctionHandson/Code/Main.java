public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Book", "Education")
        };

        System.out.println("Linear Search:");
        Product result1 = SearchUtil.linearSearch(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("Binary Search:");
        Product result2 = SearchUtil.binarySearch(products, "Mobile");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
