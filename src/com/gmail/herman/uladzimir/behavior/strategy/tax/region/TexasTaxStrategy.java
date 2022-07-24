package com.gmail.herman.uladzimir.behavior.strategy.tax.region;

import com.gmail.herman.uladzimir.behavior.strategy.tax.TaxStrategy;
import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Person;

import java.math.BigDecimal;

public class TexasTaxStrategy implements TaxStrategy {

    private static final BigDecimal INCOME_TAX = new BigDecimal("0.27");
    private static final BigDecimal UNION_TAX = new BigDecimal("0.05");
    private static final BigDecimal PENSION_TAX = new BigDecimal("0.03");
    private static final BigDecimal TAX = INCOME_TAX.add(UNION_TAX).add(PENSION_TAX);

    @Override
    public BigDecimal calculateTax(Person person, BigDecimal yearIncome) {
        return TAX.multiply(person.getSalary());
    }

}
