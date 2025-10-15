package donation.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donate_requests")
public class DonateRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private Long donationId; // reference to DonateItem
    private String status;   // PENDING, APPROVED, REJECTED

    public DonateRequest() {}

    public DonateRequest(Long donationId, String status) {
        this.donationId = donationId;
        this.status = status;
    }

    public Long getRequestId() { return requestId; }
    public Long getDonationId() { return donationId; }
    public String getStatus() { return status; }

    public void setRequestId(Long requestId) { this.requestId = requestId; }
    public void setDonationId(Long donationId) { this.donationId = donationId; }
    public void setStatus(String status) { this.status = status; }
}

