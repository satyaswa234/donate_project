package donation.donate.repository;

import donation.donate.model.DonateBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonateBooksRepository extends JpaRepository<DonateBooks, Long> {}
