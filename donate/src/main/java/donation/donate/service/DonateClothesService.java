package donation.donate.service;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateClothes;
import donation.donate.repository.DonateClothesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateClothesService {

    private final DonateClothesRepository repository;

    public DonateClothesService(DonateClothesRepository repository) {
        this.repository = repository;
    }

    public DonateClothes addDonation(DonateItemDTO dto) {

        DonateClothes clothes = new DonateClothes(
                dto.getItemName(),
                dto.getQuantity(),
                dto.getItemCondition(),
                dto.getPickupAddress(),
                dto.getUserId(),
                dto.getImageUrl()   // ✅ Save image
        );

        return repository.save(clothes);
    }

    public List<DonateClothes> getAllDonations() {
        return repository.findAll();
    }
}