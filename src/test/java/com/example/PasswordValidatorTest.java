package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {


    @Test
    void testValidatePasswordLength() {
        PasswordValidator validator = new PasswordValidator();
        boolean result1 = validator.validatePasswordLength("12345678");
        System.out.println("Testfall 1: Passwortlänge ist größer oder gleich 8 - Erwartet: true, Ergebnis: " + result1);
        assertTrue(result1);


        boolean result2 = validator.validatePasswordLength("123456");
        System.out.println("Testfall 2: Passwortlänge ist kleiner als 8 - Erwartet: false, Ergebnis: " + result2);
        assertFalse(result2);
    }
    @Test
    void testHasDigit() {

        String passwordWithDigit = "passwörter2";
        Assertions.assertTrue(PasswordValidator.hasDigit(passwordWithDigit));

        String passwordWithoutDigit = "password";
        assertFalse(PasswordValidator.hasDigit(passwordWithoutDigit));
    }

    @Test
    public void testPasswordContainsBothUpperCaseAndLowerCase(){
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.containsBothUpperCaseAndLowerCase("aaaaAaaa"));

    }

    @Test
    public void testWeakPassword(){
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isWeakPassword("00000000"));
    }

}
