package tn.esprit.credit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.credit.Entities.Credit;

public interface CreditRepository extends JpaRepository<Credit,Long> {

}
