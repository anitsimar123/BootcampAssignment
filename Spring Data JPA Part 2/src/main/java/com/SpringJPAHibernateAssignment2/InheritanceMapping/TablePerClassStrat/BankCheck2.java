package com.SpringJPAHibernateAssignment2.InheritanceMapping.TablePerClassStrat;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BankCheck")
public class BankCheck2 extends Payment2 {
    private String checkNumber;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}
