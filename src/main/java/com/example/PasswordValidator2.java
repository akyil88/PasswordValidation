package com.example;

public class PasswordValidator2 {

    public static boolean hasDigit(String password) {
     for (char c : password.toCharArray()) {
        if (Character.isDigit(c)) {
            return true;
        }
    }
        return false;
    }
}


