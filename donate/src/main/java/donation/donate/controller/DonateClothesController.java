package donation.donate.controller;

import donation.donate.dto.DonateItemDTO;
import donation.donate.model.DonateClothes;
import donation.donate.service.DonateClothesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clothes")
@CrossOrigin(origins = "*")
public class DonateClothesController {

    private final DonateClothesService donateClothesService;

    public DonateClothesController(DonateClothesService donateClothesService) {
        this.donateClothesService = donateClothesService;
    }

    // POST: Add new clothes donation
    @PostMapping
    public ResponseEntity<DonateClothes> addDonation(@RequestBody DonateItemDTO dto) {
        try {
            DonateClothes saved = donateClothesService.addDonation(dto);
            return ResponseEntity.ok(saved);
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    // GET: All clothes donations
    @GetMapping("/all")
    public ResponseEntity<List<DonateClothes>> getAllDonations() {
        return ResponseEntity.ok(donateClothesService.getAllDonations());
    }
}
