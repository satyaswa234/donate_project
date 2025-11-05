package donation.donate.service;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateOtherItems;
import donation.donate.repository.DonateOtherItemsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateOtherItemsService {

    private final DonateOtherItemsRepository repository;

    public DonateOtherItemsService(DonateOtherItemsRepository repository) {
        this.repository = repository;
    }

    // ✅ Save Donation
    public DonateOtherItems saveDonation(DonateItemDTO dto) {

        DonateOtherItems item = new DonateOtherItems();
        item.setItemName(dto.getItemName());
        item.setQuantity(dto.getQuantity());
        item.setItemCondition(dto.getItemCondition());
        item.setPickupAddress(dto.getPickupAddress());
        item.setUserId(dto.getUserId());
        item.setImageUrl(dto.getImageUrl());

        return repository.save(item);
    }

    // ✅ Get All Donations
    public List<DonateOtherItems> getAllDonations() {
        return repository.findAll();
    }
}
