package com.develoopers.loop.dtos;

public class TokenJwt {
    private String token;
    public TokenJwt(String token) {
        this.token = token;
    }//Constructor
    public TokenJwt() {} //constructor vacio


    public String getToken() {
        return token;
    }// getToken

    @Override
    public String toString() {
        return "TokenJwt{" +
                "token='" + token + '\'' +
                '}';
    }// toString
}
