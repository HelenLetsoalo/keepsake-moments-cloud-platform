package za.co.keepsakemoments.keepsake_backend.model;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price){
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must have a value");
        }
        this.name = name;
        if(description == null|| description.isBlank() ) {
            throw new IllegalArgumentException("Description must not be empty");
        }
        this.description = description;
        if(price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if(newPrice <= 0){
            throw new IllegalArgumentException("Price has to be greater than 0");
        }
        this.price = newPrice;
    }

    public void setDescription(String newDescription){
        if(newDescription == null|| newDescription.isBlank() ) {
            throw new IllegalArgumentException("Description must not be empty");
        }
        this.description = newDescription;
    }
}
