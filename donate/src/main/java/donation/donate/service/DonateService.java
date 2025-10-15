package donation.donate.service;

import donation.donate.dto.DonateItemDTO;
import donation.donate.dto.DonateRequestDTO;
import donation.donate.model.DonateItem;
import donation.donate.model.DonateRequest;
import donation.donate.repository.DonateItemRepository;
import donation.donate.repository.DonateRequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DonateService {

    private final DonateItemRepository donateItemRepository;
    private final DonateRequestRepository donateRequestRepository;

    public DonateService(DonateItemRepository donateItemRepository, DonateRequestRepository donateRequestRepository) {
        this.donateItemRepository = donateItemRepository;
        this.donateRequestRepository = donateRequestRepository;
    }

    // Donate Item
    public DonateItem createDonation(DonateItemDTO dto) {
        DonateItem item = new DonateItem(
                dto.getItemName(),
                dto.getQuantity(),
                dto.getItemType(),
                dto.getItemCondition(),
                dto.getPickupAddress()
        );
        return donateItemRepository.save(item);
    }

    // Get all donations
    public List<DonateItem> getAllDonations() {
        return donateItemRepository.findAll();
    }

    // Create donation request
    public DonateRequest createDonateRequest(DonateRequestDTO dto) {
        DonateRequest request = new DonateRequest(dto.getDonationId(), "PENDING");
        return donateRequestRepository.save(request);
    }

    // Get requests for a donation
    public List<DonateRequest> getRequestsForDonation(Long donationId) {
        return donateRequestRepository.findByDonationId(donationId);
    }
}

