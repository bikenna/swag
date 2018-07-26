package com.swagmusic.swag.authorization;

public class AuthToken {
    public AuthToken(String token){
        this.token = "Bearer "+token;
    }

    public String getToken(){
        return this.toString();
    }

    @Override
    public String toString(){
       return this.token;
    }

    private String token;
}
