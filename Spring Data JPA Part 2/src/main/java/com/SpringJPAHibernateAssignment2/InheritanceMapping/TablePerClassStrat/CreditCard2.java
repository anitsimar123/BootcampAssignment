package com.SpringJPAHibernateAssignment2.InheritanceMapping.TablePerClassStrat;


import javax.persistence.Entity;

@Entity
public class CreditCard2 extends Payment2 {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
