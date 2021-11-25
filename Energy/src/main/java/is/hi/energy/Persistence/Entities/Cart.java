package is.hi.energy.Persistence.Entities;

import javax.persistence.*;

// One to one cart entity for each user.
// where they can view all added items, or remove items from cart.
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @OneToOne
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;

    private int quantity;

    // Getters & setters
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cart(){

    }
    public Cart(User user, Item item, int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }
}