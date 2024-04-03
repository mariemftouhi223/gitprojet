package tn.esprit.credit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.credit.Entities.Credit;
import tn.esprit.credit.Services.CreditService;

@RestController
public class CreditController {
    @Autowired
    CreditService creditService;
    @PostMapping(path = "/save")
    public Credit ajouter (@RequestBody Credit credit)
    {
        return creditService.ajouter(credit);
    }
}
