package donation.donate.repository;

import donation.donate.model.DonateItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateItemRepository extends JpaRepository<DonateItem, Long> {
}
