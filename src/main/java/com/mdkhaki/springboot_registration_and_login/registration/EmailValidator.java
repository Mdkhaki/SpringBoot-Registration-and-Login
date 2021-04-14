package com.mdkhaki.springboot_registration_and_login.registration;

import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // TODO: Regex for email validation
        return true;
    }
}
