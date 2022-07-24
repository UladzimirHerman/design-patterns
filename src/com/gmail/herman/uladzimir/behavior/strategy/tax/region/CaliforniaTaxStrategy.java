package com.gmail.herman.uladzimir.behavior.strategy.tax.region;

import com.gmail.herman.uladzimir.behavior.strategy.tax.TaxStrategy;
import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Person;

import java.math.BigDecimal;

public class CaliforniaTaxStrategy implements TaxStrategy {

    private static final BigDecimal INCOME_TAX = new BigDecimal("0.32");
    private static final BigDecimal UNION_TAX = new BigDecimal("0.03");
    private static final BigDecimal PENSION_TAX = new BigDecimal("0.01");
    private static final BigDecimal TAX_STEP = new BigDecimal("0.08");
    private static final BigDecimal MAX_YEAR_INCOME = new BigDecimal("45000");

    @Override
    public BigDecimal calculateTax(Person person, BigDecimal yearIncome) {
        BigDecimal tax = INCOME_TAX.add(UNION_TAX).add(PENSION_TAX);

        if (MAX_YEAR_INCOME.compareTo(yearIncome) <= 0) {
            tax = tax.add(TAX_STEP);
        }

        return tax.multiply(person.getSalary());
    }

}
