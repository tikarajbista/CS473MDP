package com.example.tikarajbista.w1l4;

public class User {
    private String userName;
    private String password;
    public User(String name, String pass){
        this.userName = name;
        this.password = pass;
    }

    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return  password;
    }

}
