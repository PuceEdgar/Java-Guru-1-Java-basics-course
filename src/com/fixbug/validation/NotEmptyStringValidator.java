package com.fixbug.validation;

import javax.validation.ValidationException;

public class NotEmptyStringValidator extends AbstractStringValidator {

    @Override
    public void validate(String value) {
        if (value == null || value.isEmpty()){
            throw new ValidationException("cannot be null or empty");
        }
    }
}
