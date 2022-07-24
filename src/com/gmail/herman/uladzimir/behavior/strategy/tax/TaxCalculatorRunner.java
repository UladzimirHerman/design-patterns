package com.gmail.herman.uladzimir.behavior.strategy.tax;

import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Account;
import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Month;
import com.gmail.herman.uladzimir.behavior.strategy.tax.profile.Person;
import com.gmail.herman.uladzimir.behavior.strategy.tax.region.CaliforniaTaxStrategy;
import com.gmail.herman.uladzimir.behavior.strategy.tax.region.ColoradoTaxStrategy;
import com.gmail.herman.uladzimir.behavior.strategy.tax.region.TexasTaxStrategy;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class TaxCalculatorRunner {

    public static void main(String[] args) {
        Person person = new Person(27, 0, new BigDecimal("8500"));
        TaxStrategy taxStrategy = new TexasTaxStrategy();
        Account account = new Account(person, taxStrategy);

        Stream.of(Month.values()).forEach(month -> {
            System.out.println(month + " report");

            if (Month.MARCH.equals(month)) {
                System.out.println("Person moved to California");
                person.setSalary(new BigDecimal("11500"));
                account.setTaxStrategy(new CaliforniaTaxStrategy());
            }

            if (Month.SEPTEMBER.equals(month)) {
                System.out.println("Person moved to Colorado");
                person.setSalary(new BigDecimal("9000"));
                account.setTaxStrategy(new ColoradoTaxStrategy());
            }

            if (Month.OCTOBER.equals(month)) {
                System.out.println("Person celebrated his birthday");
                person.setAge(person.getAge() + 1);
            }

            if (Month.NOVEMBER.equals(month)) {
                System.out.println("Person became a parent");
                person.setChildren(2);
            }

            BigDecimal tax = account.getTaxStrategy().calculateTax(person, account.getYearIncome());
            BigDecimal netSalary = person.getSalary().subtract(tax);
            account.addIncome(netSalary);
            System.out.println(String.format("age: %s, children: %s, gross salary: %s, tax amount: %s, net salary: %s, year net salary %s",
                    person.getAge(), person.getChildren(), person.getSalary(), tax, netSalary, account.getYearIncome()));
        });

    }

}
