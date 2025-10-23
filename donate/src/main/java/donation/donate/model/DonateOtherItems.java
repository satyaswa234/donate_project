package donation.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donate_other_items")
public class DonateOtherItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private int quantity;
    private String itemCondition;
    private String pickupAddress;
    private Long userId;

    public DonateOtherItems() {}

    public DonateOtherItems(String itemName, int quantity, String itemCondition, String pickupAddress, Long userId) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemCondition = itemCondition;
        this.pickupAddress = pickupAddress;
        this.userId = userId;
    }

    // Getters and setters
}

