package donation.donate.controller;

import donation.donate.dto.DonateItemDTO;
import donation.donate.dto.DonateRequestDTO;
import donation.donate.model.DonateItem;
import donation.donate.model.DonateRequest;
import donation.donate.service.DonateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/donate")
@CrossOrigin(origins = "*")
public class DonateController {

    private final DonateService donateService;

    public DonateController(DonateService donateService) {
        this.donateService = donateService;
    }

    // Create donation
    @PostMapping("/item")
    public ResponseEntity<DonateItem> donateItem(@RequestBody DonateItemDTO dto) {
        return ResponseEntity.ok(donateService.createDonation(dto));
    }

    // Get all donations
    @GetMapping("/items")
    public ResponseEntity<List<DonateItem>> getAllDonations() {
        return ResponseEntity.ok(donateService.getAllDonations());
    }

    // Create donation request
    @PostMapping("/requests")
    public ResponseEntity<DonateRequest> requestDonation(@RequestBody DonateRequestDTO dto) {
        return ResponseEntity.ok(donateService.createDonateRequest(dto));
    }

    // Get requests for a specific donation
    @GetMapping("/requests/{donationId}")
    public ResponseEntity<List<DonateRequest>> getRequests(@PathVariable Long donationId) {
        return ResponseEntity.ok(donateService.getRequestsForDonation(donationId));
    }
}

