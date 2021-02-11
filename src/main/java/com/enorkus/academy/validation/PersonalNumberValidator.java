package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;

public class PersonalNumberValidator extends Validator<String> {
    @Override
    public void validate(String personalNumber, String message) {
        for (char c : personalNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new ValidationException(message);
            }
        }

    }
}
