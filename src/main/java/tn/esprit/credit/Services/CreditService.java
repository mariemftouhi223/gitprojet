package tn.esprit.credit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.credit.Entities.Credit;
import tn.esprit.credit.Repositories.CreditRepository;

@Service

public class CreditService implements CreditInterface {

    @Autowired
    CreditRepository creditRepository;
    @Override
    public Credit ajouter(Credit credit) {
        return creditRepository.save(credit) ;


    }
}
