package donation.donate.service;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateBooks;
import donation.donate.repository.DonateBooksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateBooksService {

    private final DonateBooksRepository repository;

    public DonateBooksService(DonateBooksRepository repository) {
        this.repository = repository;
    }

    public DonateBooks saveDonation(DonateItemDTO dto) {
        DonateBooks book = new DonateBooks(
                dto.getItemName(),
                dto.getQuantity(),
                dto.getItemCondition(),
                dto.getPickupAddress(),
                dto.getUserId(),
                dto.getImageUrl()
        );
        return repository.save(book);
    }

    public List<DonateBooks> getAll() {
        return repository.findAll();
    }
}

