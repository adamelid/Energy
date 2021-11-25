package is.hi.energy.Persistence.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// Entity class for each item (product) on the website.
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String name;
    private String description;
    private String manufacturer;
    private int caffeineAmount;
    private double rating;
    private int price;

    //@OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Cart> carts = new ArrayList<>();

    public Item(String name, String description, String manufacturer, int caffeineAmount, double rating, int price) {
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.caffeineAmount = caffeineAmount;
        this.rating = rating;
        this.price = price;
    }

    // Getters & setters
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCaffeineAmount() { return caffeineAmount; }

    public void setCaffeineAmount(int caffeineAmount) { this.caffeineAmount = caffeineAmount; }

    public double getRating() { return rating; }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
