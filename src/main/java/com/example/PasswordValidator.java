package com.example;

public class PasswordValidator {
    public boolean validatePasswordLength(String password) {
        return password.length() >=(8);
    }

    public static boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }


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


    public boolean isWeakPassword(String password) {

        return password.equals("Passwort1") || password.equals("Aa345678") || password.equals("12345678") || password.equals("00000000");
    }


}
