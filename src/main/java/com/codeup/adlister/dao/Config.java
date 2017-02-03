package com.codeup.adlister.dao;

/**
 * Created by Harry on 2/3/17.
 */
public class Config {
    public static final String url = "jdbc:mysql://localhost/adlister_db";
    public static final String username = "adlister_user";
    public static final  String password = "codeup";

    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
