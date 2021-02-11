package com.enorkus.academy.controller;

import com.enorkus.academy.entity.Customer;

import static org.springframework.util.StringUtils.capitalize;


public class Formatter {
    public static final int LENGTH_BEFORE_DASH = 4;

    public static Customer format(Customer customer) {
        String fixedName = fixNames(customer.getFirstName());
        String fixedLastName = fixNames(customer.getLastName());
        String fixedPersonalNumber = fixPersonalNumber(customer.getPersonalNumber());

        return new Customer.Builder(fixedName, fixedLastName, fixedPersonalNumber)
                .middleName(customer.getMiddleName())
                .age(customer.getAge())
                .countryCode(customer.getCountryCode())
                .city(customer.getCity())
                .monthlyIncome(customer.getMonthlyIncome())
                .employer(customer.getEmployer())
                .gender(customer.getGender())
                .maritalStatus(customer.getMaritalStatus())
                .build();

    }

    private static String fixNames(String input) {
        return capitalize(input.toLowerCase());
    }

    private static String fixPersonalNumber(String number) {
        if (number.length() <= LENGTH_BEFORE_DASH) {
            return number;
        }
        return number.substring(0, LENGTH_BEFORE_DASH) + "-" + number.substring(LENGTH_BEFORE_DASH);
    }


}
