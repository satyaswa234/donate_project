package donation.donate.controller;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateToys;
import donation.donate.service.DonateToysService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/toys")
@CrossOrigin(origins = "*")
public class DonateToysController {

    private final DonateToysService service;

    public DonateToysController(DonateToysService service) {
        this.service = service;
    }

    @PostMapping
    public DonateToys addDonation(@RequestBody DonateItemDTO dto) {
        return service.addDonation(dto);
    }

    @GetMapping("/all")
    public List<DonateToys> getAll() {
        return service.getAllDonations();
    }
}

