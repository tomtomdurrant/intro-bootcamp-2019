package com.manchesterdigital;

public class SpotifyAccount {
    private final String username;
    private final String password;

    public SpotifyAccount(String username, String password) {

        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
