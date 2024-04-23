package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest2 {

    @Test
    void testHasDigit() {

        String passwordWithDigit = "passwörter2";
        Assertions.assertTrue(PasswordValidator2.hasDigit(passwordWithDigit));

        String passwordWithoutDigit = "password";
        assertFalse(PasswordValidator2.hasDigit(passwordWithoutDigit));
    }
}


