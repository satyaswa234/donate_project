package donation.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donate_books")
public class DonateBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private int quantity;
    private String itemCondition;
    private String pickupAddress;
    private Long userId;

    public DonateBooks() {}

    public DonateBooks(String itemName, int quantity, String itemCondition, String pickupAddress, Long userId) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemCondition = itemCondition;
        this.pickupAddress = pickupAddress;
        this.userId = userId;
    }

    // Getters and setters (similar to DonateClothes)
}

