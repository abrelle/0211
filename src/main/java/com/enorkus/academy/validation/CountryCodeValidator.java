package com.enorkus.academy.validation;

import com.enorkus.academy.entity.CountryCodes;
import com.enorkus.academy.exception.ValidationException;

public class CountryCodeValidator extends Validator<String> {

    @Override
    public void validate(String countryCode, String message) {
        if (countryCode == null || countryCode.isEmpty()) {
            return;
        }
        for (CountryCodes code : CountryCodes.values()) {
            if (code.equalValue(countryCode)) {
                return;
            }
        }
        throw new ValidationException(message);
    }
}
