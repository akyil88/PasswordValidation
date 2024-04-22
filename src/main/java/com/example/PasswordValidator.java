package com.example;

public class PasswordValidator {
    public boolean validatePasswordLength(String password) {
        return password.length() >=(8);
    }


}