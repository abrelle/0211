package com.enorkus.academy.validation;

import com.enorkus.academy.entity.Customer;

public class CustomerValidator extends Validator<Customer> {


    @Override
    public void validate(Customer customer, String message) {

        MandatoryValueValidator mandatoryValueValidator = new MandatoryValueValidator();
        CustomerAdultValidator customerAdultValidator = new CustomerAdultValidator();
        CountryCodeValidator countryCodeValidator = new CountryCodeValidator();
        PersonalNumberValidator personalNumberValidator = new PersonalNumberValidator();

        mandatoryValueValidator.validate(customer.getFirstName(), "First name is mandatory!");
        mandatoryValueValidator.validate(customer.getLastName(), "Last name is mandatory!");
        mandatoryValueValidator.validate(customer.getPersonalNumber(), "Personal number is mandatory!");
        personalNumberValidator.validate(customer.getPersonalNumber(), "Personal number must contain numbers only");
        customerAdultValidator.validate(customer.getAge(), "Customer must be 18 or older!");
        countryCodeValidator.validate(customer.getCountryCode(), "Invalid country code!");
    }
}
