package tn.esprit.credit.Entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity


public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id ;

    @Enumerated(EnumType.STRING)
    private CreditType type;
    private int montant ;
    @Temporal(TemporalType.DATE)
    private Date date ;

    public Credit() {
    }

    public Credit(CreditType type, int montant, Date date) {
        this.type = type;
        this.montant = montant;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CreditType getType() {
        return type;
    }

    public void setType(CreditType type) {
        this.type = type;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
