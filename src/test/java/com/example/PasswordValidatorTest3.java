package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest3 {

    @Test
    public void testPasswordContainsBothUpperCaseAndLowerCase(){
        PasswordValidator3 validator = new PasswordValidator3();
        assertTrue(validator.containsBothUpperCaseAndLowerCase("aaaaaaaA"));

    }
}
