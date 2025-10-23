package donation.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donate_clothes")
public class DonateClothes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private int quantity;
    private String itemCondition;
    private String pickupAddress;
    private Long userId;

    public DonateClothes() {}

    public DonateClothes(String itemName, int quantity, String itemCondition, String pickupAddress, Long userId) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemCondition = itemCondition;
        this.pickupAddress = pickupAddress;
        this.userId = userId;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public String getItemCondition() { return itemCondition; }
    public String getPickupAddress() { return pickupAddress; }
    public Long getUserId() { return userId; }

    public void setId(Long id) { this.id = id; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setItemCondition(String itemCondition) { this.itemCondition = itemCondition; }
    public void setPickupAddress(String pickupAddress) { this.pickupAddress = pickupAddress; }
    public void setUserId(Long userId) { this.userId = userId; }
}

