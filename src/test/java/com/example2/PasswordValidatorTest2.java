package com.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest2 {

    @Test
    void testHasDigit() {

        String passwordWithDigit = "passwörter";
        assertTrue(PasswordValidator2.hasDigit(passwordWithDigit));

        String passwordWithoutDigit = "password";
        assertFalse(PasswordValidator2.hasDigit(passwordWithoutDigit));
    }
}


