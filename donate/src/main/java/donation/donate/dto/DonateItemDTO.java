package donation.donate.dto;

public class DonateItemDTO {
    private String itemName;
    private int quantity;
    private String itemType;
    private String itemCondition;
    private String pickupAddress;

    public DonateItemDTO() {}

    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public String getItemType() { return itemType; }
    public String getItemCondition() { return itemCondition; }
    public String getPickupAddress() { return pickupAddress; }

    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setItemType(String itemType) { this.itemType = itemType; }
    public void setItemCondition(String itemCondition) { this.itemCondition = itemCondition; }
    public void setPickupAddress(String pickupAddress) { this.pickupAddress = pickupAddress; }
}

