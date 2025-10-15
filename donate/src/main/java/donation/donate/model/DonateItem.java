package donation.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donate_items")
public class DonateItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donationId;

    private String itemName;
    private int quantity;
    private String itemType;
    private String itemCondition;
    private String pickupAddress;

    public DonateItem() {}

    public DonateItem(String itemName, int quantity, String itemType, String itemCondition, String pickupAddress) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemType = itemType;
        this.itemCondition = itemCondition;
        this.pickupAddress = pickupAddress;
    }

    public Long getDonationId() { return donationId; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public String getItemType() { return itemType; }
    public String getItemCondition() { return itemCondition; }
    public String getPickupAddress() { return pickupAddress; }

    public void setDonationId(Long donationId) { this.donationId = donationId; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setItemType(String itemType) { this.itemType = itemType; }
    public void setItemCondition(String itemCondition) { this.itemCondition = itemCondition; }
    public void setPickupAddress(String pickupAddress) { this.pickupAddress = pickupAddress; }
}

