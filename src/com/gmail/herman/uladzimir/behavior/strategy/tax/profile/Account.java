package com.gmail.herman.uladzimir.behavior.strategy.tax.profile;

import com.gmail.herman.uladzimir.behavior.strategy.tax.TaxStrategy;

import java.math.BigDecimal;

public class Account {

    private Person person;
    private TaxStrategy taxStrategy;
    private BigDecimal yearIncome;

    public Account(Person person, TaxStrategy taxStrategy) {
        this.person = person;
        this.taxStrategy = taxStrategy;
        this.yearIncome = new BigDecimal("0");
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public BigDecimal getYearIncome() {
        return yearIncome;
    }

    public void addIncome(BigDecimal income) {
        this.yearIncome = yearIncome.add(income);
    }

}
