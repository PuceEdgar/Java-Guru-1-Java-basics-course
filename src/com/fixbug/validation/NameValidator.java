package com.fixbug.validation;

import javax.validation.ValidationException;


public class NameValidator extends StringLengthValidator {


    public NameValidator(int min, int max) {
        super(min, max);
    }

    @Override
    public void validate(String value) {
        super.validate(value);
        for (char c : value.toCharArray())
            if (Character.isDigit(c)) {
                throw new ValidationException(" No numbers in name");
        }
    }


}
