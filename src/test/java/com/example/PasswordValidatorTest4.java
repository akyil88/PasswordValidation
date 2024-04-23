package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest4 {

    @Test
    public void testWeakPassword(){
        PasswordValidator4 validator = new PasswordValidator4();
        assertTrue(validator.isWeakPassword("000000000"));
    }

}
