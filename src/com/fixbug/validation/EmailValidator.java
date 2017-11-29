package com.fixbug.validation;

import javax.validation.*;

public class EmailValidator extends NotEmptyStringValidator {

    private static final int MIN_LENGTH_BEFORE_AT = 2;
    private static final int MAX_LENGTH_BEFORE_AT = 30;

    private static final int MIN_LENGTH_AFTER_AT = 2;
    private static final int MAX_LENGTH_AFTER_AT = 15;

    private StringLengthValidator beforeAtValidator = new StringLengthValidator(MIN_LENGTH_BEFORE_AT, MAX_LENGTH_BEFORE_AT);
    private StringLengthValidator afterAtValidator = new StringLengthValidator(MIN_LENGTH_AFTER_AT, MAX_LENGTH_AFTER_AT);

    @Override
    public void validate(String value) {
        super.validate(value);
        String[]parts = value.split("@",2);
        while (parts.length != 2 || parts[1].contains("@")){
            throw new ValidationException("wrong format");
        }
        beforeAtValidator.validate(parts[0]);
        afterAtValidator.validate(parts[1]);
    }
}
