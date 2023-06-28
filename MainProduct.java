package Maven1;
import java.util.ArrayList;

class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class MainProduct {
    private ArrayList<Product> productList;

    public Main() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(int id, int newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setPrice(newPrice);
                break;
            }
        }
    }

    public void deleteProduct(int id) {
        Product productToRemove = null;
        for (Product product : productList) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            productList.remove(productToRemove);
        }
    }

    public void displayProducts() {
        System.out.println("Product List:");
        for (Product product : productList) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: Rs " + product.getPrice());
        }
    }

    public static void main(String[] args) {
    	
        Main Manageproduct = new Main();

        // Create products
        
        Product product1 = new Product(1, "Monitor", 10000);
        Product product2 = new Product(2, "Keyboard", 1000);
        Product product3 = new Product(3, "Mouse", 500);
        Product product4 = new Product(4, "Laptop", 30000);
        // Add products to the list
        
        Manageproduct.addProduct(product1);
        Manageproduct.addProduct(product2);
        Manageproduct.addProduct(product3);
        Manageproduct.addProduct(product4);
        
        // Display initial products
        
        System.out.println("After Adding Products");
        Manageproduct.displayProducts();

        // Update product price
        
        Manageproduct.updateProduct(2, 750);

        // Display	 products after update
        
        System.out.println("After Updating Product of id 2");
        Manageproduct.displayProducts();

        // Delete product
        
        Manageproduct.deleteProduct(1);

        // Display products after delete
        
        System.out.println("After Deleting Product of id 1");
        Manageproduct.displayProducts();
    }
}
