package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;

public class CustomerAdultValidator extends Validator<Integer> {
    public static final int VALID_AGE = 18;

    @Override
    public void validate(Integer age, String message) {
        if (age < VALID_AGE) {
            throw new ValidationException(message);
        }
    }
}
