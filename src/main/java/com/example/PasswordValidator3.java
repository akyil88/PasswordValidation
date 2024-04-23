package com.example;

public class PasswordValidator3 {
    public boolean containsBothUpperCaseAndLowerCase(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        return hasLowerCase && hasUpperCase;
    }
}
