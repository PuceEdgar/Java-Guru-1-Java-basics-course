package com.fixbug.validation;

import javax.validation.*;


public class StringLengthValidator extends NotEmptyStringValidator {

    private int min;
    private int max;

    public StringLengthValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void validate(String value) {
        super.validate(value);
        if (value.length() < min || value.length() > max){
            throw new ValidationException(String.format("length must be between %d and %d", min, max));
        }
    }
}
