package is.hi.energy.Persistence.Entities;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String name;
    private String description;
    private String manufacturer;
    private double rating;
    private int price;
    private int caffeineAmount;

    public Item(String name, String description, String manufacturer, double rating, int price, int caffeineAmount) {
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.rating = rating;
        this.price = price;
        this.caffeineAmount = caffeineAmount;
    }

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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCaffeineAmount() {
        return caffeineAmount;
    }

    public void setCaffeineAmount(int caffeineAmount) {
        this.caffeineAmount = caffeineAmount;
    }
}
