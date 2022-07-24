package com.gmail.herman.uladzimir.behavior.strategy.tax;

import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Person;

import java.math.BigDecimal;

public interface TaxStrategy {

    BigDecimal calculateTax(Person person, BigDecimal yearIncome);

}
