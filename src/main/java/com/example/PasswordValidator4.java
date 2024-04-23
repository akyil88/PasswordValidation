package com.example;

public class PasswordValidator4 {

    public boolean isWeakPassword(String password) {

        return password.equals("Passwort1") || password.equals("Aa345678") || password.equals("12345678") || password.equals("00000000");
    }
}
