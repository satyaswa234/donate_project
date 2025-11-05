package donation.donate.repository;

import donation.donate.entity.DonateRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateRequestRepository extends JpaRepository<DonateRequest, Long> {
    // no extra methods needed for now
}
