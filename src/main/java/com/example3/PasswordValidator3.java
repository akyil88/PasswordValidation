package com.example3;

public class PasswordValidator3 {
    public static boolean hasMixedCase(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
        }

        return hasLowerCase && hasUpperCase;
    }
}
