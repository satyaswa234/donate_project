package donation.donate.repository;

import donation.donate.entity.DonateItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateItemRepository extends JpaRepository<DonateItem, Long> {
}
