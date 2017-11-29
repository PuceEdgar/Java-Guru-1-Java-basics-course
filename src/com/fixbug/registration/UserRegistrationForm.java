package com.fixbug.registration;

import com.fixbug.validation.AbstractStringValidator;
import com.fixbug.validation.EmailValidator;
import com.fixbug.validation.NameValidator;
import com.fixbug.validation.StringLengthValidator;

import javax.validation.ValidationException;
import java.util.Scanner;

public class UserRegistrationForm {

    public UserRegistration register() {
        String firstName = getStringFromUser("First name : ", new NameValidator(2, 30));
        String lastName = getStringFromUser("Last name : ", new NameValidator(2, 30));
        String email = getStringFromUser("Email : ", new EmailValidator());
        String password = getStringFromUser("Password : ", new StringLengthValidator(8, 50));
        return new UserRegistration(firstName, lastName, email, password);
    }

    private String getStringFromUser(String message, AbstractStringValidator validator) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                String stringFromUser = scanner.nextLine();
                validator.validate(stringFromUser);
                return stringFromUser;
            } catch (ValidationException e) {
                System.out.println("     ERROR : " + e.getMessage());
            }
        }
    }


}
