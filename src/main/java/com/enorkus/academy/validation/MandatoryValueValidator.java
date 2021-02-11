package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;

public class MandatoryValueValidator extends Validator<String> {
    @Override
    public void validate(String name, String message) {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException(message);
        }

    }
}
