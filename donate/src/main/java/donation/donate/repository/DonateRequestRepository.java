package donation.donate.repository;

import donation.donate.model.DonateRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonateRequestRepository extends JpaRepository<DonateRequest, Long> {
    List<DonateRequest> findByDonationId(Long donationId);
}

