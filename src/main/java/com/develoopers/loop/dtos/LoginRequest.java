package com.develoopers.loop.dtos;


public class LoginRequest {

    private String email;
    private String password;

    public LoginRequest(String password, String email) {
        this.password = password;
        this.email = email;
    }
    public LoginRequest() {}// constructor vacio

    public String getEmail() {
        return email;
    }// getEmail

    public String getPassword() {
        return password;
    }// getPassword

    @Override
    public String toString() {
        return "LoginRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }// toString
}//LoginRequest
