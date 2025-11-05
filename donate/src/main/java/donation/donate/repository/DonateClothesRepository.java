package donation.donate.repository;

import donation.donate.entity.DonateClothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateClothesRepository extends JpaRepository<DonateClothes, Long> {
}
