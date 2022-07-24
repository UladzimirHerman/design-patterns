package com.gmail.herman.uladzimir.behavior.strategy.tax.region;

import com.gmail.herman.uladzimir.behavior.strategy.tax.TaxStrategy;
import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Person;

import java.math.BigDecimal;

public class ColoradoTaxStrategy implements TaxStrategy {

    private static final BigDecimal INCOME_TAX = new BigDecimal("0.25");
    private static final BigDecimal UNION_TAX = new BigDecimal("0.07");
    private static final BigDecimal PENSION_TAX = new BigDecimal("0.01");
    private static final BigDecimal TAX_STEP = new BigDecimal("0.03");
    private static final BigDecimal CHILDREN_MULTIPLY = new BigDecimal("3");
    private static final int MIN_PERSON_AGE = 25;
    private static final int MAX_PERSON_AGE = 35;

    @Override
    public BigDecimal calculateTax(Person person, BigDecimal yearIncome) {
        BigDecimal tax = INCOME_TAX.add(UNION_TAX).add(PENSION_TAX);

        if (person.getAge() > MIN_PERSON_AGE && person.getChildren() == 0) {
            tax = tax.add(TAX_STEP);
        } else if (person.getAge() < MAX_PERSON_AGE && person.getChildren() > 0) {
            tax = person.getChildren() > 2 ?
                    tax.subtract(TAX_STEP.multiply(CHILDREN_MULTIPLY)) :
                    tax.subtract(TAX_STEP.multiply(new BigDecimal(person.getChildren())));
        }

        return tax.multiply(person.getSalary());
    }

}
