package donation.donate.controller;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateOtherItems;
import donation.donate.service.DonateOtherItemsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donate/other")
@CrossOrigin(origins = "*")
public class DonateOtherItemsController {

    private final DonateOtherItemsService service;

    public DonateOtherItemsController(DonateOtherItemsService service) {
        this.service = service;
    }

    // ✅ Add Donation
    @PostMapping("/add")
    public DonateOtherItems addDonation(@RequestBody DonateItemDTO dto) {
        return service.saveDonation(dto);
    }

    // ✅ Get All Donations
    @GetMapping("/all")
    public List<DonateOtherItems> getAll() {
        return service.getAllDonations();
    }
}
