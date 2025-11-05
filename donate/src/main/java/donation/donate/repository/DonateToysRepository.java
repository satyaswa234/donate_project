package donation.donate.repository;

import donation.donate.entity.DonateToys;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DonateToysRepository extends JpaRepository<DonateToys, Long> {}
