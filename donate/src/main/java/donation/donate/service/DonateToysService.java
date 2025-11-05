package donation.donate.service;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateToys;
import donation.donate.repository.DonateToysRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateToysService {

    private final DonateToysRepository repository;

    public DonateToysService(DonateToysRepository repository) {
        this.repository = repository;
    }

    public DonateToys addDonation(DonateItemDTO dto) {
        DonateToys toy = new DonateToys(
                dto.getItemName(),
                dto.getQuantity(),
                dto.getItemCondition(),
                dto.getPickupAddress(),
                dto.getUserId(),
                dto.getImageUrl()
        );

        return repository.save(toy);
    }

    public List<DonateToys> getAllDonations() {
        return repository.findAll();
    }
}

