package donation.donate.repository;

import donation.donate.model.DonateToys;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DonateToysRepository extends JpaRepository<DonateToys, Long> {}
