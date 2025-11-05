package donation.donate.controller;

import donation.donate.dto.DonateItemDTO;
import donation.donate.entity.DonateClothes;
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

    @PostMapping
    public ResponseEntity<DonateClothes> addDonation(@RequestBody DonateItemDTO dto) {
        try {
            return ResponseEntity.ok(donateClothesService.addDonation(dto));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<DonateClothes>> getAllDonations() {
        return ResponseEntity.ok(donateClothesService.getAllDonations());
    }
}