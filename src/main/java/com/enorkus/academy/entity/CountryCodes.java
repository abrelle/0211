package com.enorkus.academy.entity;

public enum CountryCodes {
    LT("LT"),
    LV("LV"),
    EE("EE"),
    SE("SE");

    private String defaultValue;

    CountryCodes(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean equalValue(String passedValue) {
        return this.defaultValue.equals(passedValue);
    }
}
