package com.fixbug;

import com.fixbug.registration.UserRegistration;
import com.fixbug.registration.UserRegistrationForm;

public class FindBugTest {

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistrationForm().register();
        System.out.println("-------REGISTERED-------");
        System.out.println(registration);
    }

}
